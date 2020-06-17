package singerton;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashTest {
    public static void main(String[] args) {
//        HashMap<String, String> hash = new HashMap<>();
        TreeMap<String, String> hash = new TreeMap ();
        hash.put("b","1");
        hash.put("q","1");
        hash.put("d","1");
        hash.put("q","1");
        hash.put("w","1");
        hash.put("e","1");
        hash.put("r","1");
        hash.put("t","1");
        hash.put("y","1");
        hash.put("u","1");
        hash.put("i","1");
        Set<String> strings = hash.keySet();
        for (String string : strings) {
            System.out.println(string+":"+hash.get(string));
        }
        System.out.println("============");
        Set<Map.Entry<String, String>> entries = hash.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
