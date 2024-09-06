package io.github.arvicss.light;

import io.github.arvicss.command.Command;

public class LightDecreaseBrightness implements Command {
    private Light light;

    public LightDecreaseBrightness(Light light) {
        this.light = light;
    }

    public LightDecreaseBrightness() {
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.decreaseBrightness();
    }
}