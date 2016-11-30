package com.company.model;

import org.sikuli.script.App;
import org.sikuli.script.Region;

/**
 * Created by ANDE on 30/11/2016.
 */
public class BusinessRules extends Sections{
    public void Create()
    {
        Region r;
        Double rand = (Math.random() * 10000);
        try {
            App a = new App("Firefox");
            if (!a.hasWindow()) {
                App.open("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
            }
            a.waitForWindow(15);
            a.focus();
            if(s.exists("imgs/business rules/administration_bold.jpg")== null){
                s.find("imgs/business rules/administration_nonBold.jpg");
                s.click("imgs/business rules/administration_nonBold.jpg");
            }
            s.wait("imgs/business rules/administration_bold.jpg",8.0);
            if(s.exists("imgs/business rules/business_rules_bold.jpg")== null){
                s.find("imgs/business rules/business_rules_nonBold.jpg");
                s.click("imgs/business rules/business_rules_nonBold.jpg");
            }
            s.wait("imgs/business rules/business_rules_bold.jpg",8.0);
            s.click("imgs/business rules/new.jpg");
            s.wait("imgs/business rules/newTab.jpg",8.0);
            s.find("imgs/business rules/nameTitle.jpg").right(320).click("imgs/business rules/NameField.jpg");
            s.paste("TestSikulix : "+rand.intValue());
            s.find("imgs/business rules/activationDate.jpg").right(360).click("imgs/business rules/arrowDown.jpg");
            s.paste("Immediate");
            s.find("imgs/business rules/voucher.jpg").click();
            s.find("imgs/business rules/sikuli_voucher.jpg").left(100).find("imgs/business rules/checkbox.jpg").click();
            r=s.find("imgs/business rules/add_dropdown.jpg").right(250);
            r.click("imgs/business rules/arrowDown.jpg");
            s.paste("Promotion");
            r.right(250).click("imgs/business rules/arrowDown.jpg");
            s.paste("sikuliPromo");
            s.find("imgs/business rules/save.jpg").click();
            s.click("imgs/business rules/save.jpg");
            s.find("imgs/business rules/business_rules_bold.jpg").click();
            s.find("imgs/business rules/sikulix.jpg");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
