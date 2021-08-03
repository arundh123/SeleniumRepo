import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excel {

    public static void main(String[] args) throws IOException {

        FileInputStream file= new FileInputStream("src/main/Utils/testdata.xlsx");
        XSSFWorkbook wb= new XSSFWorkbook("file");
        XSSFSheet sheet= wb.getSheet("Sheet1");



    }
}
