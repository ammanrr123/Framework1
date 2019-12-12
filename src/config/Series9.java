package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Series9 {

	@SuppressWarnings({ "resource", "static-access", "deprecation" })
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis;
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFRow	row;
		XSSFCell cell;
		
		
		  fis=new FileInputStream("");
		  
		  workbook=new XSSFWorkbook(fis);
		  
		  int index=workbook.getSheetIndex("");
		  
		  sheet=workbook.getSheetAt(index);
		  
		  row=sheet.getRow(0);
		  
		  row.getLastCellNum();
		  
		  cell=row.getCell(3);
		  
		  if(cell.getCellType()==cell.CELL_TYPE_STRING) {
			  cell.getStringCellValue();
		  }
		  else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
			  cell.getNumericCellValue();
		  }
		  else if(cell.getCellType()==cell.CELL_TYPE_BOOLEAN) {
			  cell.getBooleanCellValue();
		  
		  }
		  

	}

}
