import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int arr[] = { 1, 3, 1, 2, 2, 2, 1, 4, 3, 4 };
        map.put(1, 1);
        System.out.println(map.get(1));
        map.put(1, map.get(1) + 1);
        for (int ele : arr) {
            // if (map.containsKey(ele)) {
            // map.put(ele, map.get(ele) + 1);
            // } else {
            // map.put(ele, 1);
            // }
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        for (int ele : map.keySet()) {
            System.out.println(ele + " " + map.get(ele));
        }
    }

}
