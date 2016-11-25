package com.company.controller;

import java.util.EmptyStackException;
import org.sikuli.basics.Settings;
import org.sikuli.script.*;
import com.company.model.*;

public class Scenario {
	 private Sections m = new Sections();

	/*
		 * 	Projects
		 * 	-------
		 * 	1 : Telecentro
		 * 	2 : BeinFrance
		 * 	3 : BeinMena
		 * 	4 : Orange
		 * 	5 : Econet
	*/
	public void initialize(int project) 
	{

		Settings.setShowActions(true);

		try
		{
			String url, login, password;
			switch(project)
			{
				case 1:
					url = "http://staging-telecentro.wecare.alphanetworks.be/";
					login = "dpe";
					password = "alpha001";
					break;
				case 2:
					url = "http://staging-beinfrance.wecare.alphanetworks.be/";
					login = "developer";
					password = "developer$123";
					break;
				case 3:
					url = "https://staging-beinmena.wecare.alphanetworks.be/";
					login = "developer";
					password = "developer$123";
					break;
				case 4:
					url = "http://staging-mobistar.wecare.alphanetworks.be/";
					login = "developer";
					password = "Developer$123";
					break;
				case 5:
					url = "http://staging-liquid.wecare.alphanetworks.be/";
					login = "developer";
					password = "Developer$123";
					break;
				default:
					Sikulix.popError("Error no project found");
					throw new EmptyStackException();
			}
			m.openApp(url);
			m.login(login,password);
		}
		catch(Exception e)
		{
			e.getLocalizedMessage();
		}
	}

	public void evacuation(){
		m.logout();
		m.closeApp();
	}
}
