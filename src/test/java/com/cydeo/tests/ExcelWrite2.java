package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.apache.poi.ss.util.CellUtil.getRow;

public class ExcelWrite2 {
    
    @Test
    public void test() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("employee.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Employees3");
        XSSFCell cell;
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            for (int j = 0; j < 4; j++) {
                if (sheet.getRow(i).getCell(j).toString().equals("Randall")) {
                    cell = sheet.getRow(i).createCell(j+1);
                    cell.setCellValue("SetExample");
                }
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream("employee.xlsx");
        workbook.write(fileOutputStream);
        fileOutputStream.close();
        fileInputStream.close();
        workbook.close();


    }
}

