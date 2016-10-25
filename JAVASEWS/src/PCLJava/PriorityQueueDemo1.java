package PCLJava;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo1 {
		 public static void main(String[] args) 
		 {  
			 PriorityQueue pq=new PriorityQueue();  
			 pq.add("Arun");         
			 pq.add("Venkatesh");   
			 pq.add("Karthik");      
			 pq.offer("Pranab");     
			 System.out.println(pq);  
			 System.out.println("-----element and peek----");     
			 System.out.println(pq.element());//get the first element,does not remove         
			 System.out.println(pq.peek());//get the first element,does not remove       
			 System.out.println("----printing element via Iterator---"); 
			 
			 Iterator itr=pq.iterator(); 
	
			 while(itr.hasNext()) 
			 {                
				 System.out.println(itr.next());     
			 }    
			 
			 System.out.println("poll and remove demo");   
			 System.out.println(pq.poll()); //get the first element in zigzag way and removes it ,  
			 System.out.println(pq.remove()); //get the first element in zigzag way and removes it
			 //remove()-exception occurs if queue is empty
			 System.out.println(pq); // the rest of the elements in the linkedList. 
			 
	Queue<Integer> q=new PriorityQueue<>();
	int arr[]={50,30,100,25,78};
	
	for(int a:arr)  
	{               
		q.add(a);       
	} 
	for(int a:arr)  
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
