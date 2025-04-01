package queue_interface;

import java.util.*;

public class QueueOperations {
    public static void main(String[] args) {
        // Reverse a Queue Example
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        System.out.println("Original Queue: " + queue);
        queue = reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);

        // Generate Binary Numbers Example
        int n = 5;
        System.out.println("Binary Numbers: " + generateBinaryNumbers(n));

        // Hospital Triage Example
        System.out.println("Hospital Triage Order:");
        hospitalTriage();

        // Stack Using Queues Example
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack Top: " + stack.top());
        System.out.println("Popped: " + stack.pop());

        // Circular Buffer Example
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.insert(4); // Overwrites oldest
        System.out.print("Circular Buffer: ");
        buffer.printBuffer();
    }

    // Reverse a Queue
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        return queue;
    }

    // Generate Binary Numbers Using a Queue
    public static List<String> generateBinaryNumbers(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        while (n-- > 0) {
            String current = queue.poll();
            result.add(current);
            queue.offer(current + "0");
            queue.offer(current + "1");
        }
        return result;
    }

    // Hospital Triage System using PriorityQueue
    static class Patient {
        String name;
        int severity;
        public Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }
    public static void hospitalTriage() {
        PriorityQueue<Patient> pq = new PriorityQueue<>(Comparator.comparingInt(p -> -p.severity));
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().name);
        }
    }

    // Implement a Stack Using Queues
    static class StackUsingQueues {
        Queue<Integer> queue = new LinkedList<>();
        public void push(int x) {
            queue.offer(x);
            int size = queue.size();
            while (size-- > 1) {
                queue.offer(queue.poll());
            }
        }
        public int pop() {
            return queue.poll();
        }
        public int top() {
            return queue.peek();
        }
    }

    // Circular Buffer Simulation
    static class CircularBuffer {
        int[] buffer;
        int head = 0, tail = 0, size = 0, capacity;
        public CircularBuffer(int capacity) {
            this.capacity = capacity;
            buffer = new int[capacity];
        }
        public void insert(int value) {
            buffer[tail] = value;
            tail = (tail + 1) % capacity;
            if (size < capacity) size++;
            else head = (head + 1) % capacity;
        }
        public void printBuffer() {
            for (int i = 0; i < size; i++) {
                System.out.print(buffer[(head + i) % capacity] + " ");
            }
            System.out.println();
        }
    }
}