package io.github.arvicss.musicplayer;

import io.github.arvicss.command.Command;

public class MusicPlayerDecreaseVolume implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerDecreaseVolume() {
    }

    public MusicPlayerDecreaseVolume(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        this.musicPlayer.decreaseVolume();
    }
}
