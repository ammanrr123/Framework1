package executionEnginee;

import java.io.FileInputStream;
//import java.util.concurrent.TimeUnit;
import java.lang.reflect.Method;
import java.util.Properties;

import config.ActionKeywords;
import config.Constants;
import utility.ExcelUtils;



public class DriverScript {
     
public static Properties OR;
public static ActionKeywords actionKeywords;
public static String sActionKeyword;
public static String sPageObject;
public static Method method[];


public static int iTestStep;
public static int iTestLastStep;
public static String sTestCaseID;

public static String sRunMode;

public DriverScript() throws NoSuchMethodException,SecurityException{
	actionKeywords=new ActionKeywords();
	method=actionKeywords.getClass().getMethods();
	
}

public static void main(String[] args) throws Exception{
	ExcelUtils.setExcelFile(Constants.Path_TestData);
	
	String Path_OR=Constants.Path_OR;
	FileInputStream fs=new FileInputStream(Path_OR);
	OR=new Properties(System.getProperties());
	OR.load(fs);
	
	DriverScript startEnginee =new DriverScript();
	startEnginee.execute_TestCase();
	
}

//counting test cases and going to execution one by one
private void execute_TestCase() throws Exception{
	
	int iTotalTestCases=ExcelUtils.getRowCount(Constants.Sheet_TestCases);
	for(int iTestcase=1;iTestcase<=iTotalTestCases;iTestcase++) {
		
	sTestCaseID=ExcelUtils.getCellData(iTestcase, Constants.Col_TestCaseID, Constants.Sheet_TestCases);
		
	sRunMode=ExcelUtils.getCellData(iTestcase, Constants.Col_RunMode, Constants.Sheet_TestCases);
		
	if(sRunMode.equals("Yes")) {
			iTestStep=ExcelUtils.getRowContains(sTestCaseID, Constants.Col_TestCaseID, Constants.Sheet_TestSteps);
			iTestLastStep=ExcelUtils.getTestStepsCount(Constants.Sheet_TestSteps, sTestCaseID, iTestStep);
			
			for(;iTestStep<=iTestLastStep;iTestStep++) {
				
			sActionKeyword=ExcelUtils.getCellData(iTestStep,Constants.Col_ActionKeyword,Constants.Sheet_TestSteps);
			sPageObject=ExcelUtils.getCellData(iTestStep, Constants.Col_PageObject, Constants.Sheet_TestSteps);
			
			execute_Actions();
				
			}
		}
		
	}
}

private static void execute_Actions() throws Exception{
	for(int i=0;i<method.length;i++)
	{
		if(method[i].getName().equals(sActionKeyword)) {
			method[i].invoke(actionKeywords, sPageObject);
			break;
			
		}
	}
	
}

/*
	public static void main(String[] args)throws Exception{
		
		String Path_DataEngine=Constants.Path_TestData;
		ExcelUtils.setExcelFile(Path_DataEngine, Constants.Sheet_TestSteps);
		
		String Path_OR=Constants.Path_OR;
		FileInputStream fs=new FileInputStream(Path_OR);
		OR=new Properties(System.getProperties());
		OR.load(fs);
		
		    for(int iRow=1;iRow<=9;iRow++) {
			sActionKeyword=ExcelUtils.getCellData(iRow, Constants.Col_ActionKeyword);
			sPageObject=ExcelUtils.getCellData(iRow, Constants.Col_PageObject);
			actionKeywords=new ActionKeywords();
			method=actionKeywords.getClass().getMethods();
			execute_Actions();
		}
	}
	
	private static void execute_Actions() throws Exception{
		
		for(int i=0;i<method.length;i++){
			   if(method[i].getName().equals(sActionKeyword)){
				//This is to execute the method or invoking the method
				//Passing 'Page Object' name and 'Action Keyword' as Arguments to this method
				method[i].invoke(actionKeywords,sPageObject);
				break;

			}
		}
	}
	
	*/
	
}/*
public static void main(String[] args) throws Exception {
{                                       
String sPath="C://Users//ammanrr.CORP//eclipse-workspace//Framework1//src//dataEnginee//Test3.xlsx";
ExcelUtils.setExcelFile(sPath, "Test Steps");

for(int iRow=1;iRow<=9;iRow++) {
	
	String sActionKeyword=ExcelUtils.getCellData(iRow, 3);
	if(sActionKeyword.equals("openBrowser")) {
		ActionKeywords.openBrowser();
	}else if(sActionKeyword.equals("navigate")) {
		ActionKeywords.navigate();
	}
	else if(sActionKeyword.equals("input_UserName")) {
		ActionKeywords.input_Username();
	}
	else if(sActionKeyword.equals("input_Password")) {
		ActionKeywords.input_Password();
	}
	else if(sActionKeyword.equals("click_Login")) {
		ActionKeywords.click_Login();
	}
	else if(sActionKeyword.equals("closeBrowser"));
}
}}}*/