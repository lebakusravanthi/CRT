import java.util.PriorityQueue;
import java.util.Collections;
public class Example {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(30);
        System.out.println("Min-Heap PriorityQueue: " + pq);
        System.out.println("Min: " + pq.peek());
        System.out.println("Remove Min: " + pq.poll());
        System.out.println("New Min: " + pq.peek());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(30);
        System.out.println("Max-Heap PriorityQueue: " + maxHeap);
        System.out.println("Max: " + maxHeap.peek());
        System.out.println("Remove Max: " + maxHeap.poll());
        System.out.println("New Max: " + maxHeap.peek());
    }
}