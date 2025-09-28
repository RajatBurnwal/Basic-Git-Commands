package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.cucumber.java.en.When;

public class LoginWIthExcelFileStepDefinition {

	@When("user passes valid credentials from {string}")
	public void user_passes_valid_credentials_from(String excelFileName) throws Exception {
	    
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\"+excelFileName);
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet("Leads").getRow(2).getCell(2).getStringCellValue();
		System.out.println(value);
	}
}
