import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class TestDeque {
    public static void main(String[] args){
        Deque<String> deque = new LinkedList<>();
        deque.offerLast("A");
        deque.offerLast("B");
        deque.offerLast("C");
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}
