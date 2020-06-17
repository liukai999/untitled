package singerton;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test4Copy {
    public static void main(String[] args) throws InterruptedException {
        long l = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CompletableFuture <Integer>future = CompletableFuture.supplyAsync(()->{
            System.out.println("老板：后勤员你去城里进点货！");
            try {
                System.out.println("后勤员赵出去进货了，他开着小货车比较快，估计5小时后才会回来...");
                Thread.sleep(5000);
                return 1;
            } catch (InterruptedException e) {
                System.err.println("小红路上遭遇了不测");
                return 1;
            }
        },executorService);
        CompletableFuture<Integer>  future2 = CompletableFuture.supplyAsync(()->{
            System.out.println("老板:厨师张,你去烹饪十份辣椒炒肉,等下顾客来要吃!,厨师张需要6小时才能做好.");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return 2;
            }
            return 2;
        },executorService);
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(()->{
            System.out.println("老板: 收银员小刘 ,等下客人来了,你帮我收好账,收账不需要多少时间!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return 3;
            }
            return 3;
        },executorService);
        System.out.println("老板开了一家酒店,招来了三个员工,正准备好好盈利一把.");
        Thread.sleep(1000);
        System.out.println("老板出去了一趟!");
        Thread.sleep(6000);
        System.out.println("老板查看了近期的收益");
        future.thenAccept((e)->{
            System.out.println("后勤员赵返回了信息:"+e);
        });
        future2.thenAccept((e)->{
            System.out.println("厨师张返回了信息:"+e);
        });
        future3.thenAccept((e)->{
            System.out.println("厨师赵返回了信息:"+e);
        });

        long l2 = System.currentTimeMillis();
        System.out.println("整个过程执行了"+(l2-l)/1000+"秒!");
    }


}
