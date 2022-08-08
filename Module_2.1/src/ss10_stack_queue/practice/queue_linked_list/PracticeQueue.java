package ss10_stack_queue.practice.queue_linked_list;

public class PracticeQueue {
    Node head , tail ;

    public PracticeQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key){
        Node tempt = new Node(key);
        if(this.tail == null ){
            this.head = this.tail = tempt;
            return;
        }
        this.tail.next = tempt;
        this.tail = tempt;
    }

    public Node dequeue(){
        if (this.head == null)
            return null;
        Node tempt = this.head;
        this.head = this.head.next;
        if(this.head == null){
            this.tail = null;
        }
        return tempt;
    }

    public static void main(String[] args) {
        PracticeQueue queue = new PracticeQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Deque : " + queue.dequeue().key);
    }
}
