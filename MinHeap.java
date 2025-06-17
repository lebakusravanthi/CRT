import java.util.ArrayList;
class MinHeap {
    private ArrayList<Integer> heap;
    public MinHeap() {
        heap = new ArrayList<>();
    }
    public void insert(int val) {
        heap.add(val);
        heapifyUp(heap.size() - 1);
    }
    public int extractMin() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        int min = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }
        return min;
    }
    public int peek() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap.get(0);
    }
    private void heapifyUp(int i) {
        int parent = (i - 1) / 2;
        while (i > 0 && heap.get(i) < heap.get(parent)) {
            swap(i, parent);
            i = parent;
            parent = (i - 1) / 2;
        }
    }
    private void heapifyDown(int i) {
        int size = heap.size();
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;
            if (left < size && heap.get(left) < heap.get(smallest)) {
                smallest = left;
            }
            if (right < size && heap.get(right) < heap.get(smallest)) {
                smallest = right;
            }
            if (smallest != i) {
                swap(i, smallest);
                i = smallest;
            } else {
                break;
            }
        }
    }
    private void swap(int i, int j) {
        int tmp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, tmp);
    }
    public void printHeap() {
        System.out.println(heap);
    }
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        int[] values = {20, 5, 15, 22, 9, 3};
        for (int val : values)
            minHeap.insert(val);
        System.out.println("Min Heap: ");
        minHeap.printHeap();
        System.out.println("Extracted Min: " + minHeap.extractMin());
        System.out.println("Heap after extractMin: ");
        minHeap.printHeap();
	}
}