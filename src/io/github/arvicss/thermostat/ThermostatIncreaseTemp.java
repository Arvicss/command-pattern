package io.github.arvicss.thermostat;

import io.github.arvicss.command.Command;

public class ThermostatIncreaseTemp implements Command {
    private Thermostat thermostat;

    public ThermostatIncreaseTemp(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public ThermostatIncreaseTemp() {
    }

    public Thermostat getThermostat() {
        return thermostat;
    }

    public void setThermostat(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        this.thermostat.increaseTemperature();
    }
}
