package Excel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

//To read String value you can call getStringCellValue() method
//To read Numeric value you can call getNumericCellValue() which will return double value which we can typecast into int and then we can use in our test data.

public class readnumericDatafromExcel {

	
		@Test
		public void test1() throws Throwable, IOException
		{
		
		 // return the path of local path of project
//	         String path=System.getProperty("E:\\Mystuff\\SELINUMWS\\SEBYMOVIDS\\user\\");		
			
	         // load workbook
		 XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("E:\\Mystuff\\SELINUMWS\\SEBYMOVIDS\\user\\AppTestData.xlsx")));
			
	        // read numeric data 
		int data= (int)wb.getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
		
	        // print on console
		System.out.println("Data from Excel is >>> "+data);
			
		}	
	}
