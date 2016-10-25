package InterviewQsandAs;


public class AmstrongNoinARange {
	
	public static void main(String[] args) {
		
	for(int num=100;num<=1000;num++)
	{
		int sum=0,r=0,temp=num;
		
		
	while(temp>0)  
	{
		r=temp%10;
		sum=sum + (r*r*r);
		temp=temp/10;	
	}
	
	if(num == sum)
	System.out.println("Number"+ num +" is a amstrong no.");
  }
	
 }
}

