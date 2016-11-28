package com.company.model;
import org.sikuli.script.*;

/**
 * Created by ARBA on 22/11/2016.
 */
public class Sections {

    public Screen s = new Screen();
    public void openApp(String url){
        try{
            App a = new App("Firefox");
            if(!a.hasWindow()){
                App.open("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
            }
            a.waitForWindow(30);
            a.focus();
            s.find("imgs/initialize/inputUrl.jpg");
            s.click("imgs/initialize/inputUrl.jpg");
            s.paste(url);
            s.type(Key.ENTER);
            s.wait("imgs/login/form.jpg");
        } catch (Exception e){
            e.getLocalizedMessage();
    }
    }

    public void closeApp(){
        App a = new App("Firefox");
        if(a.hasWindow()){
            try {
                s.find("imgs/initialize/close.jpg");
                s.click();
            } catch (Exception e){
                e.getLocalizedMessage();
            }
        }
        System.exit(0);
    }

    public void login(String login, String password){
        try {
            s.find("imgs/login/login.jpg");
            s.click();
            s.paste(login);
            s.find("imgs/login/password.jpg");
            s.click();
            s.paste(password);
            s.click("imgs/login/button.jpg");
            s.wait("imgs/logout/button.jpg", 200);
        } catch(Exception e){
            e.getLocalizedMessage();
            System.out.println(e);
        }
    }

    public void logout(){
        try {
            s.find("imgs/logout/button.jpg");
            s.click();
            s.wait("imgs/login/form.jpg", 200);
        } catch(Exception e){
            e.getLocalizedMessage();
        }

    }

}
