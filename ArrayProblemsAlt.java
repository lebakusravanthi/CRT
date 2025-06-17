import java.util.*;
public class ArrayProblemsAlt {
    public static List<Integer> kLargest(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) maxHeap.offer(num);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k && !maxHeap.isEmpty(); i++) {
            result.add(maxHeap.poll());
        }
        return result;
    }
    static class MedianFinder {
        private PriorityQueue<Integer> lowers = new PriorityQueue<>(Collections.reverseOrder()); 
        private PriorityQueue<Integer> highers = new PriorityQueue<>(); 
        public void addNum(int num) {
            if (lowers.isEmpty() || num <= lowers.peek()) {
                lowers.offer(num);
            } else {
                highers.offer(num);
            }
            rebalance();
        }
        private void rebalance() {
            if (lowers.size() - highers.size() >= 2) {
                highers.offer(lowers.poll());
            } else if (highers.size() - lowers.size() >= 2) {
                lowers.offer(highers.poll());
            }
        }
        public double findMedian() {
            if (lowers.size() == highers.size()) {
                return (lowers.peek() + highers.peek()) / 2.0;
            } else if (lowers.size() > highers.size()) {
                return lowers.peek();
            } else {
                return highers.peek();
            }
        }
    }
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : frequencyMap.keySet()) {
            int freq = frequencyMap.get(key);
            if (buckets[freq] == null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(key);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
            if (buckets[i] != null) {
                result.addAll(buckets[i]);
            }
        }
        return result.subList(0, k);
    }

    public static void main(String[] args) {
        // Test 1: K Largest Elements
        int[] arr = {10, 5, 20, 8, 12, 6};
        int k1 = 3;
        System.out.println("K Largest Elements: " + kLargest(arr, k1));

        // Test 2: Median from Data Stream
        MedianFinder mf = new MedianFinder();
        mf.addNum(10);
        mf.addNum(5);
        System.out.println("Median after adding 10 and 5: " + mf.findMedian());
        mf.addNum(20);
        System.out.println("Median after adding 20: " + mf.findMedian());

        // Test 3: Top K Frequent Elements
        int[] nums = {4, 1, 2, 2, 3, 3, 3, 4, 4, 4};
        int k3 = 2;
        System.out.println("Top K Frequent Elements: " + topKFrequent(nums, k3));
    }
}

