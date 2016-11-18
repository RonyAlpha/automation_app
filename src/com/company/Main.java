package com.company;

import com.company.controler.Scenario;
import com.company.view.Selector;

public class Main{

    public static void main(String[] args) {
        Selector s = new Selector();
        Scenario n = new Scenario();
        n.initialize(s.display());

        /*Screen s = new Screen();
        Sikulix sx = new Sikulix();
        openApp myApp = new openApp();
        try {
            myApp.app("Firefox");
            s.paste("http://staging-telecentro.wecare.alphanetworks.be/");
            s.type(Key.ENTER);
            s.wait("imgs/form-home.png", 200);
            s.find("imgs/label_login.jpg");
            s.click();
            s.paste("dpe");
            s.find("imgs/label_password.png");
            s.click();
            s.paste("alpha001");
            s.click("imgs/button_login.png");
            s.wait("imgs/button_logout.png",20);
            s.find("imgs/button_logout.png");
            s.click();
            s.wait("imgs/form-home.png", 200);
            App.close("Firefox");
            //vsdfkjgflmigjsdflkghsdflk;
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
        */
    }
}
