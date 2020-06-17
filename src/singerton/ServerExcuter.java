package singerton;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ServerExcuter {
    public static void main(String[] args) {
        ScheduledExecutorService excutorServer = Executors.newScheduledThreadPool(2);
        CompletableFuture<String > completableFuture = CompletableFuture.supplyAsync(()->{
            System.out.println("正在执行线程a");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return "遇到了一些错误";
            }
            return "执行完毕a线程";
        },excutorServer);
        CompletableFuture<String > completableFutureb = CompletableFuture.supplyAsync(()->{
            System.out.println("正在执行线程b");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return "遇到了一些错误";
            }
            return "执行完毕b线程";
        },excutorServer);
        completableFuture.thenAccept((a)->{
            System.out.println(a);
        });
        completableFutureb.thenAccept((b)->{
            System.out.println(b);
        });
    }

}
