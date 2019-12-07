/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Saneth
 */
public class Queue {

    int queue[]= new int[5];
    int rear =-1;
    int front =-1;
    int maxsize = queue.length;
    
    boolean isempty(){
        return rear == -1 && front==-1;
    }
    
    boolean isfull(){
        return rear==maxsize-1;
       
    }
    public void enqueue(int data){
        if(isfull()){
            System.out.println("queue is full");   
        }
        else if(isempty()){
            front = front +1;
            rear = rear +1;
            queue[rear]= data;
            System.out.println("data added");
        }
        else{
            rear =rear +1;
            queue[rear] =data;
            System.out.println("data added");
       }
    }
    public void dequeue(){
                if(isempty()){
                    System.out.println("nothing to remove");    
                }
                else if(rear ==front){
                 int data = queue[front];
                 rear = rear+1;
                 front = front +1;
                    System.out.println(data);
                
                }else{
                int data = queue[front];
                front = front+1;
                System.out.println(data);}
                
               
            }
    public static void main(String[] args) {
        Queue ob = new Queue();
        ob.enqueue(5);
         ob.enqueue(4);
          ob.enqueue(3);
           ob.dequeue();
           ob.dequeue();
           ob.dequeue();
            ob.dequeue();
            ob.dequeue();
        
    }
    
}
