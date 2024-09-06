package io.github.arvicss.light;

import io.github.arvicss.command.Command;

public class LightIncreaseBrightness implements Command {
    private Light light;

    public LightIncreaseBrightness(Light light) {
        this.light = light;
    }

    public LightIncreaseBrightness() {
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.increaseBrightness();
    }
}