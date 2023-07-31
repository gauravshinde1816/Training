package ObserverPattern;

import java.util.ArrayList;

public interface Observable {

     public void add(Observer o);

     public  void remove(Observer o);

     public  void notifyAlldependents();
};
