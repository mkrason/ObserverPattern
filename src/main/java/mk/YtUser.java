package mk;

public class YtUser implements Observer {

    private String name;
    private int videosToWatch;

    public YtUser(String name){
        this.name = name;
//        videosToWatch = 0;
    }

    public void update() {
        videosToWatch++;
        System.out.println("Hey " + name + " Wideo to watch = " + videosToWatch);
        //gtgtgt
        //kkkkkkk
        //jjjjj
    }
}
