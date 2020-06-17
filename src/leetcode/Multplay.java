package leetcode;

public class Multplay {
    /**
     * 第一种：序列本身就是空，此时不会产生碰撞，直接放入行星序列的尾端。
     * 第二种：当序列的最尾端是负数，nextItem < 0，这时方向相同并且速度相同，两个同方向的行星不会产生碰撞，直接放入行星序列的尾端。
     * 第三种：当序列的最尾端是负数，nextItem > 0，这时两个行星的运动方向相反，并不会产生碰撞（比如[-5,-10]在右端放入5），直接放入行星序列的尾端。
     * 第四种：当序列的最尾端是正数，nextItem > 0，这时方向相同并且速度相同，两个同方向的行星不会产生碰撞，直接放入行星序列的尾端。
     * 第五种：当序列的最尾端是正数，nextItem < 0，这时方向相对，两个方向的行星必定会产生碰撞，按照碰撞规则：两个行星相互碰撞，较小的行星会爆炸。如果两颗行星大小相同，则两颗行星都会爆炸。
     * 也就是说，只有第五种情况需要特殊处理。
     */
    public void getstack(){

    }

    public static void main(String[] args) {
        int [] asteroids = {10,5,-10,-5};
        int last = 0;
        int lastindex=0;
        for (int i=0;i< asteroids.length;i++) {
            if(last == 0){
                last = asteroids[i];
                continue;
            }
            if((last>0 && asteroids[i] < 0) || (last < 0 && asteroids[i] > 0)){
                //发生碰撞,看看是哪个星星消亡
                if(Math.abs(last) - Math.abs(asteroids[i]) > 0){
                    //留last
                    asteroids[i] = 0;
                }else{
                    //留现在的
                    last = asteroids[i];
                    asteroids[lastindex] = 0;
                    lastindex = i;
                }
            }else{
                //没有发生碰撞
                last = asteroids[i];
                lastindex = i;
            }

        }
        System.out.print("[");
        for (int i = 0; i < asteroids.length; i++) {
            if(asteroids[i] != 0){
                System.out.print(asteroids[i]+",");
            }

        }
        System.out.print("]");

    }
}
