package com.str;
class Queue {
	
	private int[] arr;
	private int front;
	private int rear;
	private int capacity;
	private int count;
	
	
	
	public Queue(int size) {
		arr=new int[size];
		capacity=size;
		front =0;
		rear=-1;
		count=0;
	}
	
public void enQueue(int item) {
	
	if(isFull()) {
		System.out.println("Overflow");
		System.exit(-1);
	}
	System.out.println("Inserting element "+ item);
	rear=(rear+1)%capacity;
	arr[rear]=item;
	count++;
}

public void deQueue() {
	if(isEmpty()) {
		System.out.println("Underflow");
		System.exit(-1);
	}
	
	int x=arr[front];
	System.out.println("Deleted Element is "+x);
	front=(front+1)%capacity;
	count--;
}

public int peek() {
	if(isEmpty()) {
		System.out.println("Underflow");
		System.exit(-1);
	}
	return arr[front];
	
}

public boolean isEmpty() {
	return count==0;
	}
	
public boolean isFull() {
	return count==capacity;
  }
}


public class QueueDriver {

	public static void main(String[] args) {
		
		Queue g1=new Queue(5);
		
		g1.enQueue(1);
		g1.enQueue(2);
		g1.enQueue(3);
		g1.enQueue(4);
		g1.deQueue();
		System.out.println(g1.peek());
		g1.enQueue(5);
		g1.deQueue();
		System.out.println(g1.peek());
		g1.deQueue();
		System.out.println(g1.peek());

	}

}
