package io.github.arvicss.musicplayer;

import io.github.arvicss.command.Command;

public class MusicPlayerPlayPlaylist implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayerPlayPlaylist() {
    }

    public MusicPlayerPlayPlaylist(MusicPlayer musicPlayer) {
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
        this.musicPlayer.playPlaylist();
    }
}