package com.company.view;

import com.sun.javafx.scene.control.skin.CustomColorDialog;
import org.sikuli.script.App;
import org.sikuli.script.Screen;
import org.sikuli.script.Sikulix;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.beans.*; //Property change stuff
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.beans.*; //Property change stuff
import java.awt.*;
import java.awt.event.*;

public class Selector
{
	private JFrame frame = new JFrame();
	public static void main() {
		JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
		String nom = jop.showInputDialog(null, "Veuillez décliner votre identité !", "Gendarmerie nationale !", JOptionPane.QUESTION_MESSAGE);
		jop2.showMessageDialog(null, "Votre nom est " + nom, "Identité", JOptionPane.INFORMATION_MESSAGE);
	}

	public String projectDialog (){
		Object[] possibilities = {"Telecentro", "BeinFrance", "BeinMena", "Orange", "EcoNet"};
		Object[] buttons = {"Next", "Cancel"};
		String s = (String)JOptionPane.showInputDialog(
				frame,
				"Select the project to test:",
				"Project Selection",
				JOptionPane.PLAIN_MESSAGE,
				null,
				possibilities,
				"Nothing selected");

		System.out.println(s);

		return s;
	}

	public int project()
	{
		int idProject;
		String targetType;
		String[] items = {"nothing selected", "Telecentro", "BeinFrance", "BeinMena", "Orange", "EcoNet"};
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
		else if(targetType.matches("EcoNet"))
		{
			idProject=5;
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
