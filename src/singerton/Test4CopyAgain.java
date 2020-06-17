package singerton;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test4CopyAgain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newScheduledThreadPool(2);
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
            System.out.println("小明说:我去买一点牛肉,我骑单车去大概需要半个小时!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return "路上发生车祸了,买菜失败!";
            }
            return "我买到牛肉了!";
        },executorService);
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->{
            System.out.println("小丽说:我去买一点蔬菜,我骑滑板车去,大概需要一个小时!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return "路上发生车祸了,买菜失败!";
            }
            return "我买到蔬菜了!";
        },executorService);
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(()->{
            System.out.println("小松说:我去买一点饮料及火锅底料,我用平衡车去,大概需要半个小时!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return "路上发生车祸了,买东西失败!";
            }
            return "我买到饮料和火锅底料了!";
        },executorService);
        System.out.println("小明,小丽,小松三人准备吃火锅.");
        System.out.println("小明,小丽,小松三人各自派发了任务");
        future.thenAccept((e)->{
            System.out.println("小明说:"+e);
        });
        future2.thenAccept((e)->{
            System.out.println("小丽说:"+e);
        });
        future3.thenAccept((e)->{
            System.out.println("小松说:"+e);
        });
        System.out.println("三人最终吃到了火锅,玩的十分开心!");
    }

}
