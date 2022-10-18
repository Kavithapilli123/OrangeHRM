import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static FileInputStream fi;
	public static Workbook wb;
	public static Sheet ws;

	
public static int getRowCount(String xlfile,String xlsheet) throws IOException {

 fi=new FileInputStream(xlfile);
 wb=new XSSFWorkbook(fi);
 ws=  wb.getSheet(xlsheet);
 int  rowcount =ws.getLastRowNum();
 wb.close();
return rowcount;
		}
}
