package com_Spicejet_TestCases;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebElement;

public class Hyperlinks 
{
	public static void CallMethod(String action,WebElement element,String value) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	     
	      Method method= Hyperlinks.class.getMethod(action, WebElement.class, String.class);
	      method.invoke(action,element,value);
	}
	
	public static void Hyp_Ver_Enable(WebElement element, String inputData) {
		element.isEnabled();
	}
	
	public static void Hyp_Ver_Name(WebElement element, String inputData) {
		element.getText().equalsIgnoreCase(inputData);
	}
	
	public static void Hyp_Act_ClickHyperLink(WebElement element, String inputData) {
		element.click();
	}
}
