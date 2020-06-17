package singerton;

import java.util.HashMap;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ImageLoader2 instance = ImageLoader2.getInstance();
        Thread thread = new Thread(()->{
            while(true){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(instance.num>0){
                    System.out.println(Thread.currentThread().getName()+"当前的值为:"+instance.num--);
                }
                //开分支进行结构
            }

        });
        Thread thread2 = new Thread(()->{
            while(true){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(instance.num>0)
                System.out.println(Thread.currentThread().getName()+"当前的值为:"+instance.num--);
            }
        });
        thread.start();
        thread2.start();
        //todo 了解spring  mybatis 事物  并发性事物  编程性事物


    }
}
