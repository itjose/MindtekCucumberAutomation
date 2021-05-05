package utilities;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelTest {

    public static void main(String[] args) {

        String path = "";

        try {
            FileInputStream file = new FileInputStream(path);
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet1= workbook.getSheet("");
            String firstName = sheet1.getRow(1).getCell(1).toString();


        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
