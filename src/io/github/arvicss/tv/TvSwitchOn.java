package io.github.arvicss.tv;

import io.github.arvicss.command.Command;

public class TvSwitchOn implements Command {
    private Tv tv;

    public TvSwitchOn(Tv tv) {
        this.tv = tv;
    }

    public TvSwitchOn() {
    }

    public Tv getTv() {
        return tv;
    }

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.switchOn();
    }
}
