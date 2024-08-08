public class QueueY {
    static class Innerqueue {
        int arr[];
        int size;
        int rear = -1;

        Innerqueue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        // enqueue
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("full queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Innerqueue q = new Innerqueue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {  // Fixed condition
            System.out.println(q.peek());
            q.remove();
        }
    }
}
