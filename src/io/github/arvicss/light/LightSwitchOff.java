package io.github.arvicss.light;

import io.github.arvicss.command.Command;

public class LightSwitchOff implements Command {
    private Light light;

    public LightSwitchOff(Light light) {
        this.light = light;
    }

    public LightSwitchOff() {
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOff();
    }
}