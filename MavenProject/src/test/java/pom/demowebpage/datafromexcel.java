package pom.demowebpage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class datafromexcel 
{
  @DataProvider(name="excel")
  public Object[][] from() throws Exception
  {
	  FileInputStream f=new FileInputStream("./excel/DataProvider.xlsx");
	  Workbook book = WorkbookFactory.create(f);
	  Sheet s = book.getSheet("Sheet1");
	  int rown=s.getLastRowNum();
	  int coln=s.getRow(0).getLastCellNum();
	  Object [][] a=new Object[rown][coln];
	  for(int i=1;i<=rown;i++)
	  {
		  for(int j=0;j<coln;j++)
		  {
			  a[i-1][j]=s.getRow(i).getCell(j).toString();
		  }
	  }
	  return a;
  }
}
