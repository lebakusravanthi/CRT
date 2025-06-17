import java.util.ArrayList;
class MinHeap1 {
    private ArrayList<Integer> heap;
    public MinHeap1() {
        heap = new ArrayList<>();
    }
    public void insert(int val) {
        heap.add(val);
        heapifyUp(heap.size() - 1);
    }
    public int extractMin() {
        if (heap.isEmpty()) throw new IllegalStateException("Heap is empty")
        int min = heap.get(0);
        int last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }
        return min;
    }
    public boolean isMinHeap() {
        for (int i = 0; i < heap.size(); i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < heap.size() && heap.get(i) > heap.get(left)) return false;
            if (right < heap.size() && heap.get(i) > heap.get(right)) return false;
        }
        return true;
    }
    public void printHeap() {
        System.out.println(heap);
    }
    private void heapifyUp(int index) {
        int parent = (index - 1) / 2;
        while (index > 0 && heap.get(index) < heap.get(parent)) {
            swap(index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }
    private void heapifyDown(int index) {
        int size = heap.size();
        while (true) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;
            if (left < size && heap.get(left) < heap.get(smallest)) smallest = left;
            if (right < size && heap.get(right) < heap.get(smallest)) smallest = right;
            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else {
                break;
            }
        }
    }
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    public static void main(String[] args) {
        MinHeap1 minHeap = new MinHeap1();
        int[] values = {20, 5, 15, 22, 9, 3};
        for (int val : values) {
            minHeap.insert(val);
        }
        System.out.println("MinHeap after insertions:");
        minHeap.printHeap();
        System.out.println("Heap property valid? " + minHeap.isMinHeap(
        System.out.println("\nRemoving elements one by one:");
        while (true) {
            try {
                int min = minHeap.extractMin();
                System.out.println("Extracted Min: " + min);
                System.out.print("Heap now: ");
                minHeap.printHeap();
                System.out.println("Heap property valid? " + minHeap.isMinHeap());
            }
			catch (IllegalStateException e) {
                System.out.println("Heap is now empty.");
                break;
			}
}