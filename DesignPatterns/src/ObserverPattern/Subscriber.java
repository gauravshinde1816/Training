package ObserverPattern;

public class Subscriber implements Observer{
    YoutubeChannel yt;
    public Subscriber(YoutubeChannel yt){
        this.yt = yt;
    }
    @Override
    public void update() {
        System.out.println("Video uploaded on " + this.yt.name + " Youtube channel" );
    }
}
