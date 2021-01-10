package learning_java;
/**
 * 包括hashset和treeset的一些功能
 * by Joyce
 */

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class demo_set{
    public static void main(String[] args) {

        /**初始化hashset**/
        Set<String> hashset = new HashSet<>();

        /**添加元素**/
        hashset.add("a");
        hashset.add("bb");
        hashset.add("ccc");

        /**遍历hashset，注意hashset的顺序不是sorted的**/
        for (String x: hashset){
            System.out.println(x);
        }

        /**删除元素**/
        hashset.remove("a");
        hashset.remove("bb");

        /**判断是否存在某元素**/
        System.out.println(hashset.contains("ccc"));

        /**hashset的大小**/
        System.out.println(hashset.size());

        System.out.println("=======Treeset======");

        /**初始化treeset**/
        Set<String> treeset = new TreeSet<>();

        treeset.add("ccc");
        treeset.add("bb");
        treeset.add("a");

        /**遍历treeset，注意treeset的顺序是sorted的**/
        for(String x: treeset){
            System.out.println(x);
        }



    }
}
