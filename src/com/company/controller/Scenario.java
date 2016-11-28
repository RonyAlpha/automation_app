package com.company.controller;

import java.util.EmptyStackException;
import org.sikuli.basics.Settings;
import org.sikuli.script.*;
import com.company.model.*;

public class Scenario {
	private Sections m = new Sections();
	private Vouchers mv = new Vouchers();

	/*
		 * 	Projects
		 * 	-------
		 * 	1 : Telecentro
		 * 	2 : BeinFrance
		 * 	3 : BeinMena
		 * 	4 : Orange
		 * 	5 : Econet
	*/
	public void initialize(String project)
	{

		Settings.setShowActions(true);

		try
		{
			String url, login, password;
			switch(project.toLowerCase().replaceAll("\\s",""))
			{
				case "telecentro":
					url = "http://staging-telecentro.wecare.alphanetworks.be/";
					login = "dpe";
					password = "alpha001";
					break;
				case "beinfrance":
					url = "http://staging-beinfrance.wecare.alphanetworks.be/";
					login = "developer";
					password = "developer$123";
					break;
				case "beinmena":
					url = "https://staging-beinmena.wecare.alphanetworks.be/";
					login = "developer";
					password = "developer$123";
					break;
				case "orange":
					url = "http://staging-mobistar.wecare.alphanetworks.be/";
					login = "developer";
					password = "Developer$123";
					break;
				case "econet":
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

	public void execution(String[] sections){
		for(int i = 0;i < sections.length; i++) {
			if(!sections[i].equals("")){
				switch(sections[i].toLowerCase())
				{
					case "vouchers":
						mv.create(1,"shared");
						break;
					case "options":
						break;
					case "product":
						break;
					case "catalog":
						break;
					default:
						Sikulix.popError("Error no section found");
						throw new EmptyStackException();
				}
			}
		}

	}

	public void evacuation(){
		m.logout();
		m.closeApp();
	}
}
