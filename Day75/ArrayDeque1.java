import java.util.ArrayDeque;
import java.util.Deque;
class ArrayDeque1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        System.out.println(deque);
        deque.remove();
        System.out.println(deque);
        deque.addLast(50);
        System.out.println(deque);
        System.out.println(deque.contains(40));
        System.out.println(deque.element());
        System.out.println(deque.getClass());
        System.out.println(deque.isEmpty());
        System.out.println(deque.offer(60));
        System.out.println(deque.size()); 
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peek());
        System.out.println(deque.getLast());
        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.pop());

        for (Integer integer : deque) {
            System.out.println(integer);
        }
        deque.clear();
        System.out.println(deque);
    }
}

