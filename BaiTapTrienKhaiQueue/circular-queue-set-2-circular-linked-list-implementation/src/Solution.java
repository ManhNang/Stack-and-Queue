class Node {
    public int data;
    public Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }
}

class Queue {
    public Node front;
    public Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }
}

public class Solution {
    public static void enQueue(Queue q, int value) {
        Node temp = new Node(value);
        if (q.front == null) {
            q.front = temp;
        } else {
            q.rear.link = temp;
        }
        q.rear = temp;
        q.rear.link = q.front;
    }

    public static Integer deQueue(Queue q) {
        if (q.front == null) {
            return null;
        }

        int value = q.front.data;
        if (q.front == q.rear) {
            q.front = null;
            q.rear = null;
        } else {
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }

    public static void displayQueue(Queue q) {
        if (q.front == null) {
            System.out.println("Queue rỗng");
            return;
        }
        Node temp = q.front;
        System.out.print("Các phần tử trong Queue: ");
        while (temp.link != q.front) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        enQueue(q, 14);
        enQueue(q, 22);
        enQueue(q, 6);

        displayQueue(q);

        System.out.println("Xóa giá trị = " + deQueue(q));
        System.out.println("Xóa giá trị = " + deQueue(q));

        displayQueue(q);

        enQueue(q, 9);
        enQueue(q, 20);

        displayQueue(q);
    }
}