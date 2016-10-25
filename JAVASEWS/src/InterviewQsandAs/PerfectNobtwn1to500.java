package InterviewQsandAs;
// WAP to print the prefect number btwn 1 to 500
//Eg: The number 6 is said to be a perfect number because it is equal to the sum of all its exact divisors(other than itself) i.e 6=1+2+3
public class PerfectNobtwn1to500 {

	public static void main(String[] args) {
		int sum=0,x=0;
		for(int num=1;num<500;num++)
		{
			for(int i=1;i<num;i++)
			{
				x=num%i;
				if(x==0)
					sum=sum+i;
			}
			if(sum==num)
			{
				System.out.println("Perfect number is :"+num);
				System.out.println("Factors are:");
				for(int i=1;i<num;i++)
				{
					x=num%i;
					if(x==0)
						System.out.println(i);
				}
			}
			sum=0;
		}
	}
}
