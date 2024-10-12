public class CircularQueue {
    int front;
   int rear;
   int size;
   int capacity;
   int[] CircularQueue;

   public CircularQueue(int capacity) {
       CircularQueue=new int[capacity];
       this.capacity=capacity;
       front=-1;
       rear=-1;
       size=0;
   }
   public boolean isFull(){
       if((front==0  && rear==capacity-1) || (front!=0 && rear==(front-1)%(capacity)) ){
           return true;
       }
       return false;
   }
   public boolean isEmpty(){
    if(front==-1){
        return true;
    }
    return false;
}
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;

        }
        return CircularQueue[front];
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
                }
        if(isEmpty()){
            front=0;
            rear=0;
        }
        else if(rear==capacity-1 && front!=0){
            rear=0;

        } 
        else {
            rear++;
        }
        CircularQueue[rear]=data;
        size++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int val=CircularQueue[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else if(front==capacity-1){
            front=0;
        }
        else{
            front++;
        }
        size--;
        return val;
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        if(rear<=front){
            for(int i=front;i<capacity-1;i++){
                System.out.print(CircularQueue[i]);
            }
            for(int i=0;i<=rear;i++){
                System.out.print(CircularQueue[i]);
                if(i==rear){
                    System.out.print(",");
                }

                       }
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(CircularQueue[i]);
                if(i==rear){
                    System.out.print(",");
                }
            }
    
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CircularQueue q=new CircularQueue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(7);
        q.dequeue();
        q.enqueue(10);
        q.print();
        System.out.println();
        
    }
}
