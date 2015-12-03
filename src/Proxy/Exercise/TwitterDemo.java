package Proxy.Exercise;

public class TwitterDemo {
    public static void main(String[] args) {
        TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceImpl());

        System.out.println(service.getTimeline("Its_Speed"));
    }
}
