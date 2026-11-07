package com.zergatul.cheatutils.configs;

public class AttributeSwapConfig {
    public int startSlot = 0;   // Default: first hotbar slot
    public int secondSlot = 1;  // Default: second hotbar slot

    // Validate slot numbers (0–8)
    public void validate() {
        if (startSlot < 0 || startSlot > 8) startSlot = 0;
        if (secondSlot < 0 || secondSlot > 8) secondSlot = 1;
    }
}
