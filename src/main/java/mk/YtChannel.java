package mk;


import java.util.ArrayList;

public class YtChannel implements Subject{

    private ArrayList<Observer> observerList;

    public YtChannel(){
        observerList = new ArrayList<>();
    }

    public void publishNewVideo(){
        System.out.println("YTChannel: Publisching new video.");
        notifyObservers();
    }

    public void register(Observer o) {
        observerList.add(o);
    }

    public void unregister(Observer o) {
        observerList.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observerList){
                o.update();
        }
    }
}
