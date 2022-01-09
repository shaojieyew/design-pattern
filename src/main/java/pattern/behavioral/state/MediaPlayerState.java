package pattern.behavioral.state;

public abstract class MediaPlayerState {

    MediaPlayer player;

    public abstract void stop();
    public abstract void play();

    public void setPlayer(MediaPlayer player){
        this.player = player;
    }
}
