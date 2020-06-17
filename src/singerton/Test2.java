package singerton;

import java.util.HashMap;
@SuppressWarnings("unchecked")
public class Test2 {

    public static void main(String[] args) {

        HashMap hashMapv = new HashMap();
        hashMapv.put(1,'1');
        hashMapv.put(1,'1');
        System.out.println(hashMapv.hashCode());
    }
}
