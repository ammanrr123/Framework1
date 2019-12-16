package config;

public class Constants {

	//This is the list of System Variables
    //Declared as 'public', so that it can be used in other classes of this project
    //Declared as 'static', so that we do not need to instantiate a class object
    //Declared as 'final', so that the value of this variable can be changed
    // 'String' & 'int' are the data type for storing a type of value	
	public static final String URL = "http://usappobiewt100:81/fins_oui/start.swe?SWECmd=Login&SWECM=S&SRN=&SWEHo=usappobiewt100";
	public static final String Path_TestData = "C://Users//ammanrr//eclipse-workspace//Framework1//src//dataEnginee//Test3.xlsx";
	public static final String Path_OR="C://Users//ammanrr//eclipse-workspace//Framework1//src//config//OR.txt";
	public static final String File_TestData = "Test3.xlsx";

	//List of Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID =1 ;
	public static final int Col_PageObject=3;
	public static final int Col_ActionKeyword =4 ;
	public static final int Col_RunMode=2;

	//List of Data Engine Excel sheets
	public static final String Sheet_TestSteps = "Test Steps";
	public static final String Sheet_TestCases= "Test Cases";
	
	// List of Test Data
	public static final String UserName = "ammanrr";
	public static final String Password = "Nana1siri!1";
	public static final String Communication = "IPC";
	public static final String ActNumber = "*N820962*";
}