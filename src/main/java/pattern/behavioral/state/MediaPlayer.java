package pattern.behavioral.state;

public class MediaPlayer {

    private MediaPlayerState state;

    public MediaPlayer() {
        this.state = new StopState();
        state.setPlayer(this);
    }

    public void setState(MediaPlayerState state) {
        this.state = state;
    }

    public void play(){
        state.play();
        state.setPlayer(this);
    }

    public void stop(){
        state.stop();
        state.setPlayer(this);
    }

}
