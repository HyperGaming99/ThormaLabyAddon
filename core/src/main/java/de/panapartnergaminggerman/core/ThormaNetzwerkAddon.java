package de.panapartnergaminggerman.core;

import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;
import de.panapartnergaminggerman.core.commands.ExamplePingCommand;
import de.panapartnergaminggerman.core.ExampleGameTickListener;

@AddonMain
public class ThormaNetzwerkAddon extends LabyAddon<ExampleConfiguration> {

  @Override
  protected void enable() {
    this.registerSettingCategory();

    this.registerListener(new ExampleGameTickListener(this));
    this.registerCommand(new ExamplePingCommand());

    this.logger().info("Enabled the Addon");
  }

  @Override
  protected Class<ExampleConfiguration> configurationClass() {
    return ExampleConfiguration.class;
  }
}
