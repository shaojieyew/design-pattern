package pattern.behavioral.state;

public class PlayingState extends  MediaPlayerState{
    @Override
    public void stop() {
        player.setState(new StopState());
        System.out.println("stop playing");
    }

    @Override
    public void play() {
        System.out.println("already playing, nothing happen");
    }
}
