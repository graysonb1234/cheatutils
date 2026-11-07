package com.zergatul.cheatutils.modules;

import com.zergatul.cheatutils.config.ConfigStore;
import com.zergatul.cheatutils.configs.AttributeSwapConfig;
import net.minecraft.client.Minecraft;

public class AttributeSwapModule {

    private final Minecraft mc = Minecraft.getInstance();
    private final AttributeSwapConfig config;

    public AttributeSwapModule() {
        config = ConfigStore.instance.getConfig(AttributeSwapConfig.class);
    }

    public void swapSlots() {
        config.validate();
        mc.player.getInventory().selected = config.startSlot;
        // Perform swap
        mc.player.getInventory().selected = config.secondSlot;
    }
}
