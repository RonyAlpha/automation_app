package com.company.initialization;
import org.sikuli.script.App;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

/**
 * Created by ARBA on 17/11/2016.
 */
public class openApp {

    public void app(String myApp)
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
