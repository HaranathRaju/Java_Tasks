package DigitalMusicPlayer;
class MusicPlayer {
    private Track currentTrack; // composition: MusicPlayer "has-a" Track

    public MusicPlayer(Track track) {
        this.currentTrack = track;
    }

    public void playTrack() {
        System.out.println(currentTrack.getDetails());
        currentTrack.play();
    }

    public void pauseTrack() {
        currentTrack.pause();
    }

    public void skipTrack() {
        currentTrack.skip();
    }

    public void repeatTrack() {
        currentTrack.repeat();
    }
}