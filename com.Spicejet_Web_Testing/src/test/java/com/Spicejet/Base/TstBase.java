package com.Spicejet.Base;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;

public class TstBase 
{
public static Logger logger;
@BeforeClass
 void LogAndPrint()
{
	 logger=Logger.getLogger(TstBase.class);
	 PropertyConfigurator.configure("log4j.properties");
	 logger.setLevel(Level.DEBUG);
	 logger.info("In Base Class");
}
}
