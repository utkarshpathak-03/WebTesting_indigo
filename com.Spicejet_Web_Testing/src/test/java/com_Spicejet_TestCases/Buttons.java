package com_Spicejet_TestCases;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebElement;

public class Buttons {

	
	public static void CallMethod(String action,WebElement element,String value) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	     
	      Method method= Buttons.class.getMethod(action, WebElement.class, String.class);
	      method.invoke(action,element,value);
	}
	
	public static void But_Ver_Enable(WebElement element, String inputData) {
		element.isEnabled();
	}
	
	public static void But_Ver_ButtonText(WebElement element, String inputData) {
		element.getText().compareTo(inputData);
	}
	
	public static void But_Ver_ButtonAlignment(WebElement element, String inputData) {
		
	}
	
	public static void But_Ver_ButtonFont(WebElement element, String inputData) {
		
	}
	
	public static void But_Act_ClickButtton(WebElement element, String inputData) {
		element.click();
	}
	
	public static void But_Act_RightClickButtton(WebElement element, String inputData) {
		
	}
}
