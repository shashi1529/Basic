import java.util.HashMap;
import java.util.Map;

public class MapSort {


    static Map<Integer, String> map = new HashMap<Integer, String>();


    public static Map<Integer, String> putValueInMap(Map<Integer, String> map) {
        map.put(1, "one");
        map.put(2, "three");
        map.put(3, "two");
        map.put(4, "Four");

        return map;
    }

    public static void main(String[] args) {
        //Initilize Map
        putValueInMap(map);
        //Sort Value


        // using Iterator
        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }


    }


}


