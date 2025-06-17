import java.util.PriorityQueue;
import java.util.Scanner;
class Task {
    String name;
    int priority;
    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}
public class TaskPriorityManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(
            (t1, t2) -> Integer.compare(t2.priority, t1.priority)
        );
        System.out.print("Enter number of tasks: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name of task " + i + ": ");
            String name = sc.nextLine();

            System.out.print("Enter priority of task " + i + ": ");
            int priority = sc.nextInt();
            sc.nextLine(); // Consume newline

            taskQueue.add(new Task(name, priority));
        }

        // Output sorted tasks by descending priority
        System.out.println("\nTasks in descending priority:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }

        sc.close();
    }
}
