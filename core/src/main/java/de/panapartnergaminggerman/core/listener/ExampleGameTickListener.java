package de.panapartnergaminggerman.core.listener;

import de.panapartnergaminggerman.core.ThormaNetzwerkAddon;
import net.labymod.api.event.Phase;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.lifecycle.GameTickEvent;
import de.panapartnergaminggermane.core.ExampleAddon;

public class ExampleGameTickListener {

  private final ThormaNetzwerkAddon addon;

  public ExampleGameTickListener(ExampleAddon addon) {
    this.addon = addon;
  }

  @Subscribe
  public void onGameTick(GameTickEvent event) {
    if (event.phase() != Phase.PRE) {
      return;
    }

    this.addon.logger().info(this.addon.configuration().enabled().get() ? "enabled" : "disabled");
  }
}
