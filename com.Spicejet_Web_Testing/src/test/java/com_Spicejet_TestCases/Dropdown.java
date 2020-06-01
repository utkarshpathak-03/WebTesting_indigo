package com_Spicejet_TestCases;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebElement;

public class Dropdown 
{
	public static void CallMethod(String action,WebElement element,String value) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	     
	      Method method= Dropdown.class.getMethod(action, WebElement.class, String.class);
	      method.invoke(action,element,value);
	}
	
	public static void DrpDwn_Act_Scroll(WebElement element, String inputData) {
		
	}
	
	public static void DrpDwn_Act_Click(WebElement element, String inputData) {
		element.click();
	}
	
	public static void DrpDwn_Ver_Checkbox(WebElement element, String inputData) {
		
	}
	
	public static void DrpDwn_Ver_Align(WebElement element, String inputData) {
		
	}
	
	public static void DrpDwn_Ver_Title(WebElement element, String inputData) {
		element.getText().compareTo(inputData);
	}
	
	public static void DrpDwn_Act_Select(WebElement element, String inputData) {
		
	}
}


