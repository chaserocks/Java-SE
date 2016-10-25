package Aug08;

//8. Create a Student class that have two nonstatic data members id and name with values. Create the object of the Student class by new keyword 
// in main method and printing the objects value. Make the members static and print the values.

public class createStudentbynonstatic {
		
		private int studentId=1; 
	    private String studentName="Bharath Chandra";   
	    
		//Constructors  
		
		void StudentFile(int studentId, String studentName)	
	    {     
			this.studentId=studentId;    
			this.studentName=studentName;    
	    }
	
	  int getStudentId()
	  {  
		  return studentId;
	  }
	  
	  String getStudentName()
	  {   
		  return studentName;
	  } 
		
	void printStudentDetails()
	 {            
		 System.out.println("Student Id:" + studentId);
		 System.out.println("Student Name:" + studentName);
	 }
	
	 public static void main(String[] args) 
	 {  
		createStudentbynonstatic s1=new createStudentbynonstatic();        
	
		 s1.printStudentDetails(); //this method calls and prints all the printStudentDetails.
	 } 
	}

	


