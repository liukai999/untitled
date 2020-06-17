package singerton;

public class Test3 {
    public int getNumber() throws InterruptedException {
        Thread.sleep(4000);
        return 176767;
    }
    public void  callNumber() throws InterruptedException {
        int number = getNumber();
        System.out.println("我在打电话"+ number);
    }

    public static void main(String[] args) throws InterruptedException {
        long l = System.currentTimeMillis();
        Test3 test3 = new Test3();
        test3.callNumber();
        long l2 = System.currentTimeMillis();
        System.out.println((l2-l)/1000);


    }


}
