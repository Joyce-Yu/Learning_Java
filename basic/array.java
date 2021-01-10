package learning_java;
/**
 * DemoArray:数组的创建，遍历
 * DemoArray2: 创建数组 指定的数组维度是字符时，Java会将其转为整数
 * DemoArray3：array和list的相互转化
 * DemoArray4：二维数组的创建，遍历
 * by Joyce
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class DemoArray{
    static class User {}

    public static void main(String[] args) {
        /**声明数组**/
        int[] arr;

        /**定义数组，指定维度，维度可以是数字或者字符**/
        int[] array1 = new int[2];
        User[] users = new User[2];

        /**定义数组时直接指定初始化的元素，不必写出数组大小**/
        int[] array2 = new int[] {1, 2};

        System.out.println(array1.length);

        /**遍历array**/
        for(int item: array1){
            System.out.println(item);
            // array1 : 0, 0
        }

        /**遍历user数组(数组元素为引用型类型的时候，默认为null)**/
        for(User user: users){
            System.out.println(user);
            // users: null,null
        }

    }
}

class DemoArray2 {
    private static int[] test(){
        /**返回一个数组**/
        return new int[]{1,2,3};
    }

    /**当指定的数组维度是字符时，Java 会将其转为整数。如字符 a 的 ASCII 码是 97。**/
    public static void main(String[] args) {
        int length = 3;
        /* 放开被注掉的代码，编译器会报错
            int[] array = new int[4.0];
            int[] array2 = new int["test"];
         */
        int[] array3 = new int['a'];
        int[] array4 = new int[length];
        int[] array5 = new int[length + 2];
        int[] array6 = new int['a' + 2];
        // int[] array7 = new int[length + 2.1];
        System.out.println("array3.length = [" + array3.length + "]");
        System.out.println("array4.length = [" + array4.length + "]");
        System.out.println("array5.length = [" + array5.length + "]");
        System.out.println("array6.length = [" + array6.length + "]");
    }
    // Output:
    // array3.length = [97]
    // array4.length = [3]
    // array5.length = [5]
    // array6.length = [99]
}

class DemoArray3{
    public static void main(String[] args) {
        /**1.array转为list-way1（推荐）**/
        //错误做法
        Integer[] arr = { 1, 2, 3 };
        List list2 = Arrays.asList(arr);
        /*
        list2.add(8);//此注释放掉会报错；不能直接对list2进行add操作，因为ArrayList 继承了 AbstractList，但是并没有覆写 add 和 remove 方法。
        正确做法如下：
        */
        List<Integer> list = new ArrayList(Arrays.asList(arr));
        list.add(8);
        System.out.println(list);

        /**1.array转为list-way2**/
        int[] arr1 = { 1, 2, 3 };
        List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());

        /**2.list转array-way1(推荐)**/
        List<String> testList = new ArrayList(){{add("aa");add("bb");add("cc");}};
        String[] arr2 = testList.toArray(new String[testList.size()]);
        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
        /**2.list转array-way1**/
        String[] arr3 = testList.stream().toArray(String[]::new);
        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr3[i]);
        }

    }

}

class DemoArray4{
    /**二维数组的初始化**/
    public static void main(String[] args) {
        //第一种方式
        int[][] a ={{1,2,3},{4,5,6}};

        //第二种方式
        int[][] b = new int[4][2];
        b[0][1] = 2;

        //第三种方式
        int[][] arr3 = new int[5][];
        for (int i = 0; i < arr3.length; ++i){
            arr3[i] = new int[i+1];
            for(int j = 0; j < arr3[i].length; ++j){
                arr3[i][j] = i + j;
            }
        }
        System.out.println(arr3);

    }
}
