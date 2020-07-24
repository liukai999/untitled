package singerton;

import java.util.concurrent.*;

public class TreadPoolTest {
    public static void main(String[] args) {
        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(4);
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{
            System.out.println("go go go!");
            return "ok";
        },threadPool);
        completableFuture.thenAccept((s)-> System.out.println(s));


    }
}
