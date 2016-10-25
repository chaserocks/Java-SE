package com.qspiders.pack1;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;



public class PriorityQueueDemo {
public static void main(String[] args) {
	PriorityQueue pq = new PriorityQueue<>(); // we can only use the enhanced for loop and iterator only, bt not the get..
	
	pq.add(100);
	pq.add(200);
	pq.add(300);
	pq.add(10);
	pq.add(130);
	pq.add(140);
	pq.add(15);
	pq.add(80);
	System.out.println(pq); // displays in any order.
	
	pq.offer(420); // Adds at the last to the current Arraylist.
	System.out.println(pq);
	
	System.out.println(pq.element());
	System.out.println(pq.peek());
	System.out.println(pq.poll()); // poll and remove are similar.. peek and element and similar, when arraylist is empty peek will give null and element gives exception
	System.out.println(pq.element()); //peek and element are similar but when arraylist is empty poll will give null and remove gives exception.
	
	int arr[]={1,2,3,4,5};
	for(int i:arr)
		pq.add(i);
	System.out.println(pq);
	
	System.out.println("--------");
	for(Object o: pq)
		System.out.println(pq);
	
	Iterator itr=pq.iterator();
	System.out.println("---------");
	while(itr.hasNext())
		System.out.println(itr.next());
	
	Queue<Integer> q=new PriorityQueue<>();
	int arr1[]={50,30,100,25,78};
	
	for(int a:arr1)  
	{               
		q.add(a);       
	} 
	for(int a:arr1)  
	{              
		System.out.println(q.poll());     
	}        
	//we can use enhanced for loop 
	for(Object o:q)       
	{
		System.out.println(o);        
	} 
	/* alternate way 
	        int size=q.size();for(inti=0 ;i<size;i++)        
	          {   
	          System.out.println(q.poll());
	          }*/
	System.out.println(q); 
	System.out.println(q.poll());//null
	System.out.println(q.size()); //0
	System.out.println(q.remove());//exception occurs
	System.out.println(q.size());
	
}
}

