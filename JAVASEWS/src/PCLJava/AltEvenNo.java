package PCLJava;

public class AltEvenNo {
	//List of EvenNumbers:

	 
    public static void main(String[] args) {
           
            //define the limit
            int limit = 100;
           
            System.out.println("Printing Even numbers between 1 and " + limit);
            
            System.out.println("--------increment by 2-----------");
            
            for(int i=1; i <=limit; i++){
                
                //if the number is divisible by 2 then it is even
                if( i % 2 == 0)
                {
                	System.out.println(i);
                	i+=2;
                }
            }
                
                System.out.println("--------change the value at i=2----------");
                
                for(int i=2; i <=limit; i+=2){
                    
                    //if the number is divisible by 2 then it is even
                    if( i % 2 == 0)
                    {
                    	System.out.println(i);
                    	i+=2;
                    }
                }
                
System.out.println("-------flag---------");
            boolean flag=true;
            
            for(int i=1; i <=limit; i++){
                   
                    //if the number is divisible by 2 then it is even
                    if( i % 2 == 0)
                    {
                    	 if(flag)  //(flag==true)
                            System.out.println(i);
                    	 
                    	 flag=!flag;
                    }
            }

   }

}
