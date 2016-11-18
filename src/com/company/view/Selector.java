package com.company.view;

import org.sikuli.script.App;
import org.sikuli.script.Screen;
import org.sikuli.script.Sikulix;

public class Selector 
{
	public int display() 
	{	
		int idProject;
		String targetType;
		String[] items = {"nothing selected", "Telecentro", "BeinFrance", "BeinMena", "Orange"};
		targetType = Sikulix.popSelect("Please select your project","Project",items);
		if(targetType.matches("Telecentro"))
		{
			idProject=1;
		}
		else if(targetType.matches("BeinFrance"))
		{
			idProject=2;
		}
		else if(targetType.matches("BeinMena"))
		{
			idProject=3;
		}
		else if(targetType.matches("Orange"))
		{
			idProject=4;
		}
		else
		{
			idProject=0;
		}
		return idProject;
	}

	public void App(String myApp)
	{
		try {
			Screen s = new Screen();
			String path = "";
			switch (myApp)
			{
				case "Firefox":
					path = "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";
					break;
				case "Chrome":
					System.out.println("Not yet implemented");
					break;
				default:
					System.out.println("t'as rien mis connard");
			}
			App.open(path);
			App.focus(myApp);
			s.wait("imgs/inputUrl.jpg",20);
			s.find("imgs/inputUrl.jpg");
			s.click("imgs/inputUrl.jpg");
		} catch (Exception e) {
			e.getLocalizedMessage();
		}
	}
}
