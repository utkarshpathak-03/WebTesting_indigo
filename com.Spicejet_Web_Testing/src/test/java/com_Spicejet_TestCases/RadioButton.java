package com_Spicejet_TestCases;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebElement;

public class RadioButton {
	public static void CallMethod(String action,WebElement element,String value) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	     
	      Method method= RadioButton.class.getMethod(action, WebElement.class, String.class);
	      method.invoke(action,element,value);
	}
	public static void Radio_Ver_Enable(WebElement element, String inputData) {
		element.isEnabled();
	}
	public static void Radio_Act_ClickButtton(WebElement element, String inputData) {
		element.click();
	}

}
