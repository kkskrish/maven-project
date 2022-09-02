package org.lo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.poifs.crypt.DataSpaceMapUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException  {
            File file = new File("C:\\Users\\hp\\eclipse-workspace\\MavenProject\\Excel\\Datas.xlsx");
            FileInputStream stream =new FileInputStream(file);
            Workbook workbook=new XSSFWorkbook(stream);
            Sheet sheet = workbook.getSheet("Datas1");
            
            
            for(int i=0; i<sheet.getPhysicalNumberOfRows();i++) {
            	Row row = sheet.getRow(i);
            	for(int j=0; j<row.getPhysicalNumberOfCells();j++) {
            		Cell cell = row.getCell(j);
           
            		CellType type = cell.getCellType();
            		switch (type) {
					case STRING:
						String name = cell.getStringCellValue();
						System.out.println(name);
						
						break;
					case NUMERIC:
						if(DateUtil.isCellDateFormatted(cell)) {
							Date dateCellValue = cell.getDateCellValue();
							SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
							String format = dateformat.format(dateCellValue);
							System.out.println(format);
							
						}else {
							
						}
							
				        double d = cell.getNumericCellValue();
						BigDecimal b = BigDecimal.valueOf(d);
						String num = b.toString();
						System.out.println(num);
						break;

					default:
						break;
						
					}
						
            		
            		
            		
            		
            	}
            }
            
            		
            		
	}
	
}

