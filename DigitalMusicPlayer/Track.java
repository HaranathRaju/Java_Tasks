package DigitalMusicPlayer;

public class Track implements AudioMedia {
    private String title;
    private String artist;
    private double duration;
    private boolean isplaying;

    Track(String title,String artist,double duration) {
        this.title=title;
        this.artist=artist;
        this.duration=duration;
        this.isplaying=false;

    }
    @Override 
    public void play() {
        if (!isplaying) {
            isplaying=true;
            System.out.println("track is playing");
        }
        
    }
    @Override 
    public void pause() {
        if (isplaying) {
            isplaying=false;
            System.out.println("song is paused");
        }
    }
    @Override 
    public void skip() {
        System.out.println("track is skipping");
        isplaying=false;
    }
    @Override 
    public void repeat() {
        System.out.println("track is repeating");
        isplaying=true;
    }

    public String getDetails() {
        return "Track: " + title + "Artist: " + artist + "Duration: " + duration + " mins";
    }
}
