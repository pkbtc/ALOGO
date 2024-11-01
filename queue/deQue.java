public class deQue {
    int front;
   int rear;
   int size;
   int capacity;
   int[] deQueue;
   public deQue(int capacity) {
       deQueue=new int[capacity];
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
    if((front==0  && rear==capacity-1) || (front!=0 && rear==(front-1)%(capacity)) ){
        return true;
    }
    return false;
   }
   public int peekFront(){
    if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
    }
    return deQueue[front];
   }
   public int peekRear(){
    if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
    }
    return deQueue[rear];
   }
   public void enqueueFront(int data){
    if(isFull()){
        System.out.println("Queue is full");
        return;
    }
    if(isEmpty()){
        front=0;
        rear=0;
    }
    else if(front==0 && rear!=capacity-1){
        front=capacity-1;
        
   }
   else {
    front--;
   }
   deQueue[front]=data;
   size++;
   }

}
