package com.company.model;

import java.util.EmptyStackException;
import org.sikuli.basics.Settings;
import org.sikuli.script.*;

public class Scenario {

	public void initialize(int project) 
	{
		/*
		 * 	Project
		 * 	-------
		 * 	1 : Telecentro
		 * 	2 : BeinFrance
		 * 	3 : BeinMena
		 * 	4 : Orange
		 */
		Screen s = new Screen();
		Settings.setShowActions(true);
		try
		{
			switch(project)
			{
				case 1:
					App.open("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
					App.focus("Firefox");
					s.find("imgs/initialize/inputUrl.jpg");
					s.click("imgs/initialize/inputUrl.jpg");
					s.paste("http://staging-telecentro.wecare.alphanetworks.be/");
					s.type(Key.ENTER);
					break;
				case 2:
					App.open("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
					App.focus("Firefox");
					s.find("imgs/initialize/inputUrl.jpg");
					s.click("imgs/initialize/inputUrl.jpg");
					s.paste("http://staging-beinfrance.wecare.alphanetworks.be/");
					s.type(Key.ENTER);
					break;
				case 3:
					App.open("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
					App.focus("Firefox");
					s.find("imgs/initialize/inputUrl.jpg");
					s.click("imgs/initialize/inputUrl.jpg");
					s.paste("https://staging-beinmena.wecare.alphanetworks.be/");
					s.type(Key.ENTER);
					break;
				case 4:
					App.open("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
					App.focus("Firefox");
					s.find("imgs/initialize/inputUrl.jpg");
					s.click("imgs/initialize/inputUrl.jpg");
					s.paste("http://staging-mobistar.wecare.alphanetworks.be/");
					s.type(Key.ENTER);
					break;
				default:
					Sikulix.popError("Error no project found");
					throw new EmptyStackException();
			}
		}
		catch(Exception e)
		{
			e.getLocalizedMessage();
		}
	}
}
