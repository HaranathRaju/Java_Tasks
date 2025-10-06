package DigitalMusicPlayer;
public class Main {
    public static void main(String[] args) {
        Track song1 = new Track("Shape of You", "Ed Sheeran", 4.2);
        MusicPlayer player = new MusicPlayer(song1);

        player.playTrack();
        player.pauseTrack();
        player.repeatTrack();
        player.skipTrack();
    }
}