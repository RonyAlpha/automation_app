package com.company.model;

import org.sikuli.script.App;

/**
 * Created by ANDE on 25/11/2016.
 */
public class Product extends Sections{
    public void create(Integer num, String type){
        Double rand=(Math.random()*10000);

        try {
            App a = new App("Firefox");
            if (!a.hasWindow()) {
                App.open("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
            }
            a.waitForWindow(15);
            a.focus();
            if(s.exists("imgs/product/administration_bold.jpg")== null){
                s.find("imgs/product/administration_nonBold.jpg");
                s.click("imgs/product/administration_nonBold.jpg");
            }
            s.wait("imgs/product/administration_bold.jpg",200);
            if(s.exists("imgs/product/product_bold.jpg")== null){
                s.find("imgs/product/product_nonBold.jpg");
                s.click("imgs/product/product_nonBold.jpg");
            }
            s.wait("imgs/product/product_bold.jpg",200);
            s.click("imgs/product/new.jpg");
            s.wait("imgs/product/newTab.jpg",200);
            s.find("imgs/product/productTitle.jpg").right(320).click("imgs/product/titleField.jpg");
            s.paste("TestSikulix : "+rand.intValue());
            s.click("imgs/product/save.jpg");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
