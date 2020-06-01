package com_Spicejet_TestCases;


import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TestActions {
	public static void CallClass(String action, String element, String value, String className,WebDriver driver) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	     WebElement elmnt = driver.findElement(By.xpath(element));
		if(className.equalsIgnoreCase(VariableClass.FN_HYPERLINKS)) {
			Hyperlinks.CallMethod(action, elmnt, value);
		}
		else if(className.equalsIgnoreCase(VariableClass.FN_BUTTONS)) {
			Buttons.CallMethod(action, elmnt, value);
		}
		else if(className.equalsIgnoreCase(VariableClass.FN_TEXTBOX)) {
			Textbox.CallMethod(action, elmnt, value);
		}
		else if(className.equalsIgnoreCase(VariableClass.FN_CHECKBOX)) {
			Checkbox.CallMethod(action, elmnt, value);
		}
		else if(className.equalsIgnoreCase(VariableClass.FN_POPUP)) {
			Popup.CallMethod(action, elmnt, value);
		}
		else if(className.equalsIgnoreCase(VariableClass.FN_DROPDOWN)) {
			Dropdown.CallMethod(action, elmnt, value);
		}
		else if(className.equalsIgnoreCase(VariableClass.FN_RADIOBUTTON)) {
			RadioButton.CallMethod(action, elmnt, value);
		}
		else if(className.equalsIgnoreCase(VariableClass.FN_NAVIGATION)) {	
		}	
	}
	
	
	
}

