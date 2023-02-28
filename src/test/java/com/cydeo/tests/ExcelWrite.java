package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {

    @Test
    public void excelRead2() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("employee.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("Employees2");
        XSSFCell cell;
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {

            cell = sheet.getRow(i).createCell(4);

            cell.setCellValue(i);
        }

        FileOutputStream fileOutputStream = new FileOutputStream("employee.xlsx");
        workbook.write(fileOutputStream);

        fileOutputStream.close();
        fileInputStream.close();
        workbook.close();


    }


}
