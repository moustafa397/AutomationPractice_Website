package Data;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;

public class ExcelReader {

    static FileInputStream fis = null;

    public FileInputStream getFileInputStream (){
        String filePath = "D:\\Courses\\Automation(tarek)\\Projects\\AutomationPractice_Website\\src\\test\\java\\Data\\UserData.xlsx";
        File srcFile = new File(filePath);
        try {
            fis = new FileInputStream(srcFile);
        } catch (FileNotFoundException e) {
            System.out.println("Test data File not Found");
            System.exit(0);
        }
        return fis;
    }

    public Object [] [] getExcelData() throws IOException {
        fis = getFileInputStream();
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);

        int TotalNumberOfRows = (sheet.getLastRowNum()+1);
        int TotalNumberOfCols = 8;
        int startRow = 1; // Start from the second row

        String [] [] arrayExcelData = new String[TotalNumberOfRows - startRow][TotalNumberOfCols];

        for (int i = startRow; i < TotalNumberOfRows; i++) {

            for (int j = 0; j < TotalNumberOfCols; j++) {
                XSSFRow row = sheet.getRow(i);
                arrayExcelData[i - startRow] [j] = row.getCell(j).toString();
            }

        }
        wb.close();
        return arrayExcelData;
    }

}
