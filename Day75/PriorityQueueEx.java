import java.util.PriorityQueue;
import java.util.*;
class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(30);
        priorityQueue.add(40);
        priorityQueue.add(50);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove(50));
        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue.element());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.getClass());
        System.out.println(priorityQueue.contains(20));  
        System.out.println(priorityQueue.isEmpty());
        System.out.println(priorityQueue.offer(25));

        Iterator iterator = priorityQueue.iterator();

        while (iterator.hasNext()) {

            System.out.print(iterator.next() + " ");
        }
        priorityQueue.clear();
        System.out.println(priorityQueue);
    }
}
