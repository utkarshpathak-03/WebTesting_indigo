package com_Spicejet_TestCases;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebElement;

public class Popup {
	public static void CallMethod(String action,WebElement element,String value) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	     
	      Method method= Popup.class.getMethod(action, WebElement.class, String.class);
	      method.invoke(action,element,value);
	}
	
	public static void Pop_Ver_OK(WebElement element, String inputData) {
		
	}
	
	public static void Pop_Ver_CancelOK(WebElement element, String inputData) {
		
	}
	
	public static void Pop_Ver_Textbox(WebElement element, String inputData) {
		
	}
	
	public static void Pop_Ver_Align(WebElement element, String inputData) {
		
	}
	
	public static void Pop_Act_Edit(WebElement element, String inputData) {
		
	}
	
	public static void Pop_Act_Scroll(WebElement element, String inputData) {
		
	}
}

