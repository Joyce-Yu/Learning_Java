package learning_java;
/**
 * hashmap的创建，添加，遍历（for each，Iterator）
 * by Joyce
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class DemoMap{
    public static void main(String[] args) {
        /**创建<String, Integer>类型的Map**/
        Map<String, Integer> map = new HashMap<>();

        /**添加键值对**/
        map.put("apple",123);
        map.put("pear",123);
        map.put("orange",234);

        /**判断是否包含某个key或某个value**/
        if (map.containsKey("apple")){
            System.out.println("It contains apple");
        }
        if (map.containsValue(123)){
            System.out.println("It contains value123");
        }

        /**遍历map的key**/
        for (String key : map.keySet()){
            Integer value = map.get(key);
            System.out.println(value);
        }

        /**遍历map的key-value对**/
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }

        /**通过使用迭代器来遍历 HashMap**/
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey()+entry.getValue());
        }

    }
}
