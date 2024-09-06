package io.github.arvicss.light;

import io.github.arvicss.command.Command;

public class LightSwitchOn implements Command {
    private Light light;

    public LightSwitchOn(Light light) {
        this.light = light;
    }

    public LightSwitchOn() {
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }
}
