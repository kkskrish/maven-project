package org.lo;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA {

	public static WebDriver driver;


	//1

	public static void getDriverChrome() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}
	//2
	public static void enterUrl(String Url) {
		driver.get(Url);

	}
	//3
	public static void maximize() {
		driver.manage().window().maximize();
	}
	//4
	public void sendKeys(WebElement element,String data) {
		element.sendKeys(data);

	}
	//5
	public void click(WebElement element) {
		element.click();
	}
	//6
	public void clear(WebElement element) {
		element.clear();	
	}		
	//7
	public WebElement findElementById(String attributervalue) {
		WebElement element = driver.findElement(By.id(attributervalue));
		return element;

	}
	//8
	public WebElement findElementByname(String attributervalue) {
		WebElement element = driver.findElement(By.name(attributervalue));
		return element;
	}
	//9
	public WebElement findElementByclassname(String attributervalue) {
		WebElement element = driver.findElement(By.className(attributervalue));
		return element;
	}
	//10
	public String getTitle() {
		String text= driver.getTitle();
		return text;
	}
	//11
	public WebElement findElementByxpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
	//12
	public String getUrl() {
		String currentUrl=driver.getCurrentUrl();
		return currentUrl;
	}
	//13
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	//14
	public static void closewindow() {
		driver.close();
	}
	//15
	public static void closeAllWindows() {
		driver.quit();

	}
	//16 1, 99%-->value
	public String getAttributeValue(WebElement element) {
		String value = element.getAttribute("value");
		return value;
	}
	//16 2, 1%-->any Attribute Name
	public String elementGetAttributeValue(WebElement element,String attributeName) {
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}
	//17
	public void SelectOptionByText(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	//18
	public void SelectOptionByAttribute(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
	//19
	public void typeJs(WebElement element,String text) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0],setAttribute('value',"+ text+"')",element);

	}
	//20
	public void navigateUrl(String Url) {
		driver.navigate().to(Url);
	}
	//21
	public void navigateBack() {
		driver.navigate().back();
	}
	//22
	public void navigateForwrdl() {
		driver.navigate().forward();
	}
	//23
	public void navigateRefresh() {
		driver.navigate().refresh();
	}
	//24
	public void sleep(long num) throws InterruptedException {
		Thread.sleep(num);

	}
	//25
	public void selectByIndex(WebElement element,int num) {
		Select select=new Select(element);
		select.selectByIndex(num);
	}
	//26
	public String getCurrentUrl() {
		String currentUrl=driver.getCurrentUrl();
		return currentUrl;
	}
	//27
	public void dragAndDrop(WebElement a,WebElement b) {
		Actions actions= new Actions(driver);
		actions.dragAndDrop(a, b).perform();
	}
	//28
	public void contextClick(WebElement element) {
		Actions actions= new Actions(driver);
		actions.contextClick(element).perform();
	}
	//29
	public void doubleClick(WebElement element) {
		Actions actions=new Actions(driver);
		actions.doubleClick(element).perform();
	}
	//30
	public void alertAccept() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	//31
	public void alertDismiss() {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	//32
	public void promtAlerAccept(String text) {
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(text);
		alert.accept();
	}
	//33
	public void ScrollDownJs(WebElement element) throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("argument[0].scrollIntoView(true)",element);
	}
	//34
	public void ScrollUpJs(WebElement element) throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("argument[0].scrollIntoView(false)",element);
	}
	//35
	public void screenShotPage(String path) throws IOException {
		TakesScreenshot ss= (TakesScreenshot)driver;
		File s = ss.getScreenshotAs(OutputType.FILE);
		File d=new File(path);
		FileUtils.copyFile(s, d);
	}
	//36
	public void screenShotElement(WebElement element,String path) throws IOException {
		File s = element.getScreenshotAs(OutputType.FILE);
		File d=new File(path);
		FileUtils.copyFile(s, d);
	}
	//37
	public List<WebElement>getOption(WebElement element){
		Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
	//38
	public void selectByValuedDn(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	//39
	public void selectByValuedTextDn(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
	//40
	public void getAllSelectedOption(WebElement element,String value) {
		Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		for(int i=0; i<options.size(); i++) {
			select.selectByIndex(i);
			select.getAllSelectedOptions() ;
		}
	}
	//41
    public void deSelectByIndexDn(WebElement element,String value,int num) {
	    Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		for(int i=0; i<options.size(); i++) {
			select.selectByIndex(i);
			select.deselectByIndex(i);
		}
    }
    //42
    public void deSelectAlldDn(WebElement element) {
	    Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		for(int i=0; i<options.size(); i++) {
			select.selectByIndex(i);
			select.deselectAll();
		}
    }
    //43
    public void isMultipledDn(WebElement element) {
	    Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		for(int i=0; i<options.size(); i++) {
			select.selectByIndex(i);
			select.isMultiple();
		}
    }
    //44
    public void deSelectByVisivleText(WebElement element,String Value) {
	    Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		for(int i=0; i<options.size(); i++) {
			select.selectByIndex(i);
			select.deselectByVisibleText(Value);
		}
    }
    //45
    public void deSelectByValuedDn(WebElement element,String Value) {
	    Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		for(int i=0; i<options.size(); i++) {
			select.selectByIndex(i);
			select.deselectByValue(Value);
		}
    }
    //46
    public void getFirstSelectedOptiondDn(WebElement element) {
	    Select select=new Select(element);
		List<WebElement> options = select.getOptions();
		for(int i=0; i<options.size(); i++) {
			select.selectByIndex(i);
			select.getAllSelectedOptions();
		}
    }
    //47
    public void frameNameorId(String nameOrId) {
    	driver.switchTo().frame(nameOrId);
    }
    //48
    public void frameWebElementFrameElement(WebElement WebElementFrameElement) {
    	driver.switchTo().frame(WebElementFrameElement);
    }
    //49
    public void frameInt(int num) {
    	driver.switchTo().frame(num);
    }
    //50
    public String getWindowHandle() {
    	String windowHandle = driver.getWindowHandle();
    	return windowHandle;
    }
    //51
    public Set<String>getWindowHandles(){
    	Set<String> windowHandles = driver.getWindowHandles();
    	return windowHandles;
    }
    //52
    public String getExcelCellValue(String SheetName,int Rownum,int cellnum) throws IOException {
    	String res=null;
    	File file=new File("C:\\Users\\hp\\eclipse-workspace\\MavenProject\\Excel\\hotelBook.xlsx");
    	FileInputStream stream=new FileInputStream(file);
    	Workbook workbook=new XSSFWorkbook(stream);
    	Sheet sheet = workbook.getSheet(SheetName);
    	Row row = sheet.getRow(Rownum);
    	Cell cell = row.getCell(cellnum);
    	CellType Type = cell.getCellType();
    	switch (Type) {
		case STRING:
			res=cell.getStringCellValue();
			break;
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MMM/yyyy");
				res=dateFormat.format(dateCellValue);
				
			}else {
				double numericCellValue = cell.getNumericCellValue();
				long check = Math.round(numericCellValue);
				if(check==numericCellValue) {
					res=String.valueOf(check);
				}else {
					res=String.valueOf(numericCellValue);
				}
			}
			break;

		default:
			break;
		}
    	return res;
    }
    	
    	//53
    	 public void wirteCdellData(String SheetName,int Rownum,int cellnum, String date) throws IOException {
    	    	
    	    	File file=new File("C:\\Users\\hp\\eclipse-workspace\\MavenProject\\Excel\\hotelBook.xlsx");
    	    	FileInputStream stream=new FileInputStream(file);
    	    	Workbook workbook=new XSSFWorkbook(stream);
    	    	Sheet sheet = workbook.getSheet(SheetName);
    	    	Row row = sheet.getRow(Rownum);
    	    	Cell createCell = row.createCell(cellnum);
    	    	createCell.setCellValue(date);
    	    	FileOutputStream fileoutputstream=new FileOutputStream(file);
    	    	workbook.write(fileoutputstream);
    	    	
    	
    	
    }
    
    
    
    
    
    
    
    






























			}



















































		


