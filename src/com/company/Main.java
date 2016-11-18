package com.company;
import com.company.initialization.*;
import org.sikuli.script.*;

public class Main{

    public static void main(String[] args) {
        Screen s = new Screen();
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
            lfddlkfsldf;
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
    }
}
