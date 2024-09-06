package io.github.arvicss.tv;

import io.github.arvicss.command.Command;

public class TvSwitchOff implements Command {
    private Tv tv;

    public TvSwitchOff(Tv tv) {
        this.tv = tv;
    }

    public TvSwitchOff() {
    }

    public Tv getTv() {
        return tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.switchOff();
    }
}
