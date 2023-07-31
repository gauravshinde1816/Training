import ObserverPattern.Subscriber;
import ObserverPattern.YoutubeChannel;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel mychannel = new YoutubeChannel("IDeaS");

        Subscriber subscriber1 = new Subscriber(mychannel);
        Subscriber subscriber2= new Subscriber(mychannel);
        Subscriber subscriber3 = new Subscriber(mychannel);
        Subscriber subscriber4 = new Subscriber(mychannel);

        mychannel.add(subscriber1);
        mychannel.add(subscriber2);
        mychannel.add(subscriber3);
        mychannel.add(subscriber4);

        mychannel.uploadVideo("New Video 1");

    }
}