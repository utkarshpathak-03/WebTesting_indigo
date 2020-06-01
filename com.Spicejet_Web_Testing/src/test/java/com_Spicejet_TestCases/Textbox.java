package com_Spicejet_TestCases;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebElement;

public class Textbox {
	public static void CallMethod(String action,WebElement element,String value) throws NoSuchMethodException, SecurityException,
									IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	      Method method= Textbox.class.getMethod(action, WebElement.class, String.class);
	      method.invoke(action,element,value);
	}
	
	public static void Tbox_Ver_Enable(WebElement element, String inputData) {
		element.isEnabled();
	}
	
	public static void Tbox_Act_Click(WebElement e, String inputData) {
		e.click();
	}
	
	public static void Tbox_Act_Input(WebElement e, String inputData) {
		e.sendKeys(inputData);
	}
	
	public static void Tbox_Ver_Content(WebElement element, String inputData) {
		
	}
	
	public static void Tbox_Ver_Length(WebElement element, String inputData) {
		
	}
	
	public static void Tbox_Act_editable(WebElement element, String inputData) {
		
	}
	
	public static void Tbox_Act_mandatory(WebElement element, String inputData) {
		
	}
}
