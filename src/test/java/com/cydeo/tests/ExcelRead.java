package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {


    @Test
    public void read_excel_file() {

        XSSFWorkbook workbook = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("employee.xlsx");
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
        }

        XSSFSheet sheet = workbook.getSheet("Employees1");

        System.out.println(sheet.getRow(1).getCell(1));

        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
                if(sheet.getRow(i).getCell(j).toString().equalsIgnoreCase("Karen")){
                    System.out.println(sheet.getRow(i).getCell(j+2));
                    break;
                }
                
            }
        }
    }


}
