package io.github.arvicss.thermostat;

import io.github.arvicss.command.Command;

public class ThermostatDecreaseTemp implements Command {
    private Thermostat thermostat;

    public ThermostatDecreaseTemp() {
    }

    public ThermostatDecreaseTemp(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public Thermostat getThermostat() {
        return thermostat;
    }

    public void setThermostat(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        this.thermostat.decreaseTemperature();
    }
}
