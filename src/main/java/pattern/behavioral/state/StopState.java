package pattern.behavioral.state;

public class StopState extends  MediaPlayerState{
    @Override
    public void stop() {
        System.out.println("already stopped, nothing happen");
    }

    @Override
    public void play() {
        player.setState(new PlayingState());
        System.out.println("start playing");
    }
}
