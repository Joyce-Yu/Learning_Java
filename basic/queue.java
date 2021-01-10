package learning_java;
/**
 * queue和proorityQueue的部分功能
 * 参考：https://www.liaoxuefeng.com/wiki/1252599548343744/1265120632401152
 * by Joyce
 */

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

class demo_queue{
    public static void main(String[] args) {
        /**新建queue**/
        Queue<String> queue = new LinkedList<>();

        /** queue.offer() 添加元素**/
        queue.offer("a");
        queue.offer("b");

        /** queue.peek() 获取队首元素**/
        System.out.println(queue.peek());
        //输出：a

        /** queue.poll() 取出队列的第一个元素**/
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        // 依次输出：
        // a
        // b
        // null （ps：如果用queue.remove()会抛出异常，因为队列已经没有元素了）

        System.out.println("================Priority Queue============");
        /** 初始化 PriorityQueue **/
        Queue<String> q = new PriorityQueue<>();
        q.offer("c");
        q.offer("a");
        q.offer("b");
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        // 依次输出：
        // a
        // b
        // c

        System.out.println("================Priority Queue银行排队============");

        /** 实现银行排队业务 **/
        Queue<User> user = new PriorityQueue<>(new UserComparator());
        user.offer(new User("Bob", "A2"));
        user.offer(new User("Alice", "A1"));
        user.offer(new User("Nice", "V1"));
        System.out.println(user.poll());
        System.out.println(user.poll());
        System.out.println(user.poll());
        // 依次输出：
        // Nice/V1
        // Bob/A1
        // Alice/A2
    }
}

class UserComparator implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        if (u1.number.charAt(0) == u2.number.charAt(0)) {
            // 如果两人的号都是A开头或者都是V开头,比较号的大小:
            if (u1.number.length() == u2.number.length()) {
                return u1.number.compareTo(u2.number);
            }
            return u1.number.length() - u2.number.length();
        }
        if (u1.number.charAt(0) == 'V') {
            // u1的号码是V开头,优先级高:
            return -1;
        } else {
            return 1;
        }
    }
}

class User {
    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + "/" + number;
    }
}
