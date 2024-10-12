public class QueueUsingArray {
    int front;
    int rear;
    int size;
    int capacity;
    int Queue[];
    public QueueUsingArray(int capacity) {
        Queue=new int[capacity];
        this.capacity=capacity;
        front=-1;
        rear=-1;
        size=0;
    }
    public boolean isEmpty(){
        if(front==-1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(rear==capacity-1){
            return true;
        }
        return false;

    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;

        }
        return Queue[front];
    }
    public void enqueue(int data) {
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            front=0;
            rear=0;
            
        }
        else{
            rear++;
            
        }
        Queue[rear]=data;
        size++;
    }
    public int dequeue() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int val=Queue[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }
        front++;
        size--;
        return val;
        
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;

                }
        for (int i = front; i <=rear; i++) {
            System.out.print(Queue[i]+" ");
            if(i==rear){
                System.out.print(",");
            }
        }
    }
        public static void main(String[] args) {
            
            QueueUsingArray q=new QueueUsingArray(5);
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            q.enqueue(4);
            q.enqueue(5);
            System.out.println();
            q.print();
            System.out.println();
            System.out.println(q.peek());
            System.out.println();
            System.out.println(q.dequeue());
            System.out.println();
            q.print();

}
    
}
