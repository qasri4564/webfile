package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
    
    public static void main(String[] args) throws IOException {
        
        
        String excelpath = "D:\\TestData.xlsx";
        FileInputStream inputstream = new FileInputStream(excelpath);
        
        
        XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        
        // Using Iterator
        
        Iterator iterator = sheet.iterator();
        
        while(iterator.hasNext()){
            
            XSSFRow row =(XSSFRow)iterator.next();
            
            Iterator cellIterator= row.cellIterator();
            
            while(cellIterator.hasNext()) {
                
                XSSFCell cell= (XSSFCell)cellIterator.next();
                
                switch(cell.getCellType())
                {
                case STRING: System.out.println(cell.getStringCellValue()); break;
                case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
                case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break;
                
                }
                
            }
            
            System.out.println();
        }
        
    }
}