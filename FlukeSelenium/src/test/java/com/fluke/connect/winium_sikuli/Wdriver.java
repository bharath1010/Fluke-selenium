package com.fluke.connect.winium_sikuli;

import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.Screen;

public class Wdriver {
	public static WiniumDriver driver;
	@SuppressWarnings("unused")
	public static void launchApplication()
	{
		try
		{
			Screen screen;  
			Runtime rt=Runtime.getRuntime();
			Process pr=rt.exec("C:\\Users\\Dell\\Documents\\FlukeFramework\\FlukeFramework\\src\\test\\resources\\drivers\\Winium.Desktop.Driver.exe");
			System.out.println("Winium Diver Is Started");
            DesktopOptions opt=new DesktopOptions();
			opt.setApplicationPath(Global.applicationPath);
			driver=new WiniumDriver(new URL("http://localhost:9999"),opt);
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		  
	}	
	public static WiniumDriver winiumgetdriver()
	{
		
		  return driver;
	}

}
