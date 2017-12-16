package mk;

public class Client {

    public static void main(String[] args) {

        YtChannel ytChannel = new YtChannel();

        YtUser ytUser1 = new YtUser("Rysiek");

        ytChannel.register(ytUser1);

        ytChannel.publishNewVideo();

        System.out.println("------------------");

        YtUser ytUser2 = new YtUser("Patt");
        ytChannel.register(ytUser2);
        ytChannel.publishNewVideo();
        System.out.println("------------------");

        ytChannel.unregister(ytUser1);
        ytChannel.publishNewVideo();
        System.out.println("------------------");
    }

}
