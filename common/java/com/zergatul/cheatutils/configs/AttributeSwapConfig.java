package com.zergatul.cheatutils.configs;

public class AttributeSwapConfig extends ModuleConfig implements Sanitizable {

    private AttributeSwapConfig() {
        secondslot = 2;
        startingslot = 1;
    }

    @Override
    public void sanitize() {
        return;
    }
}
