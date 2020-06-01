package com_Spicejet_TestCases;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebElement;

	
	public class Checkbox {
		public static void CallMethod(String action,WebElement element,String value) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		     
		      Method method= Checkbox.class.getMethod(action, WebElement.class, String.class);
		      method.invoke(action,element,value);
		}
		
		public static void Che_Ver_Enabled(WebElement element, String inputData) {
			element.isEnabled();
		}
		
		public static void Che_Act_MaxCheck(WebElement element, String inputData) {
			
		}
		
		public static void Che_Act_Unselect(WebElement element, String inputData) {
			
		}
		
		public static void Che_Ver_Unselect(WebElement element, String inputData) {
			if(element.isSelected()) {
				element.click();
			}
		}
		
		public static void Che_Act_Select(WebElement element, String inputData) {
			element.click();
		}
		
		public static void Che_Ver_Align(WebElement element, String inputData) {
			
		}
		
		public static void Che_Ver_Font(WebElement element, String inputData) {
			
		}
	}



