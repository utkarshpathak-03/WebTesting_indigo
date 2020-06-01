package com_Spicejet_TestCases;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;

public class TestBase 
{
public static Logger logger;
@BeforeClass
 void LogAndPrint()
{
	 logger=Logger.getLogger(TestBase.class);
	 PropertyConfigurator.configure("log4j.properties");
	 logger.setLevel(Level.DEBUG);
	 logger.info("################################In Base Class###############################");
}
}

