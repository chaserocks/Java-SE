package InterviewQsandAs;

// WAP to find the area of Circle, Square, Rectangle and Triangle? 
public class FindAreaofaCrcleSqreRectTri {
	public static void main(String[] args) {
		System.out.println(getAreaOfCircle(5.5));
		System.out.println(getAreaOfSquare(5));
		System.out.println(getAreaOfRectangle(4,5));
		System.out.println(getAreaOfTriangle(5,6));
	}
	 static double getAreaOfCircle(double rad) 
	 {
			final double PI=3.14;
			double area=PI*rad*rad;
			return area;
	 }

      static double getAreaOfSquare(double len) 
      {
		double area=len*len;
		return area;
	  }

    static double getAreaOfRectangle(double len,double bred)
    {
        double area=len*bred; 	
  		return area;
  	}
      
    static double getAreaOfTriangle(double base, double height)
    {
    	double area=base*height*1/2;
    	return area;
	}

	

	

	

}
