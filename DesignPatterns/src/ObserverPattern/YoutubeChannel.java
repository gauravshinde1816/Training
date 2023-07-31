package ObserverPattern;
import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel  implements Observable{
    public String name;

    public  YoutubeChannel(String name){
        this.name  = name;
    }
    ArrayList<Observer> subs = new ArrayList<Observer>();
    @Override
    public void add(Observer o) {
        subs.add(o);
    }

    @Override
    public void remove(Observer o) {
        subs.remove(o);
    }

    @Override
    public void notifyAlldependents() {
        for (Observer sub: subs
             ) {
                sub.update();
        }
    }

    public void uploadVideo(String video){
        System.out.println("New Video uploaded of name "  +  video);
        notifyAlldependents();
    }
}
