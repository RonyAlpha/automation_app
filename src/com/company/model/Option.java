package com.company.model;

import org.sikuli.script.App;
import org.sikuli.script.Region;

/**
 * Created by ANDE on 28/11/2016.
 */
public class Option extends Sections {
    public void create() {
        Double rand = (Math.random() * 10000);
        try {
            App a = new App("Firefox");
            if (!a.hasWindow()) {
                App.open("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
            }
            a.waitForWindow(15);
            a.focus();
            if(s.exists("imgs/option/administration_bold.jpg")== null){
                s.find("imgs/option/administration_nonBold.jpg");
                s.click("imgs/option/administration_nonBold.jpg");
            }
            s.wait("imgs/option/administration_bold.jpg",8.0);
            if(s.exists("imgs/option/option_bold.jpg")== null){
                s.find("imgs/option/option_nonBold.jpg");
                s.click("imgs/option/option_nonBold.jpg");
            }
            s.wait("imgs/option/option_bold.jpg",8.0);
            s.click("imgs/option/new.jpg");
            s.wait("imgs/option/newTab.jpg",8.0);
            s.find("imgs/option/nameTitle.jpg").right(320).click("imgs/option/titleField.jpg");
            s.paste("TestSikulix : "+rand.intValue());
            s.find("imgs/option/type.jpg").right(360).click("imgs/option/arrowDown.jpg");
            s.paste("à la carte");
            s.find("imgs/option/showOrder.jpg").right(150).click("imgs/option/orderField.jpg");
            s.paste("1");
            s.find("imgs/option/service.jpg").right(350).click("imgs/option/textfieldService.jpg");
            s.paste("WebTV");
            s.find("imgs/option/duration.jpg").right(250).click("imgs/option/textField.jpg");
            s.paste("12");
            s.find("imgs/option/Commitment.jpg").right(200).click("imgs/option/textField.jpg");
            s.paste("12");
            s.find("imgs/option/cancellationRule.jpg").right(350).click("imgs/option/arrowDown.jpg");
            s.paste("Immediate");
            s.click("imgs/option/save.jpg");
            s.find("imgs/option/option_bold.jpg").click();
            s.find("imgs/option/sikulix.jpg").left(120).click("imgs/option/delete.jpg");
            s.find("imgs/option/ok.jpg").click();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
