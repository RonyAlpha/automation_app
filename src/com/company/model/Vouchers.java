package com.company.model;

import org.sikuli.script.App;
import org.sikuli.script.Screen;
import java.util.Calendar;

/**
 * Created by ARBA on 23/11/2016.
 */
public class Vouchers  extends Sections{
    private Screen s = new Screen();
    public void create(Integer num, String type){
        try {
            App a = new App("Firefox");
            if(!a.hasWindow()){
                App.open("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
            }
            a.waitForWindow(15);
            a.focus();

            if(s.exists("imgs/voucher/admin_s.jpg")== null){
                s.find("imgs/voucher/admin.jpg");
                s.click("imgs/voucher/admin.jpg");
            }
            s.wait("imgs/voucher/admin_s.jpg",200);

            if(s.exists("imgs/voucher/voucher_s.jpg")== null){
                s.click("imgs/voucher/voucher.jpg");
            }
            s.wait("imgs/voucher/search.jpg",200);
            s.click("imgs/voucher/new.jpg");
            s.wait("imgs/voucher/newTab.jpg",200);

            s.find("imgs/voucher/title.jpg").right().click("imgs/voucher/input.jpg");
            Calendar calendar = Calendar.getInstance();
            String now = calendar.get(Calendar.YEAR)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DAY_OF_MONTH);
            String nextYear = (calendar.get(Calendar.YEAR)+1)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DAY_OF_MONTH);
            s.paste("AAA Sikuli Voucher "+now);

            s.find("imgs/voucher/synopsis.jpg").right().click("imgs/voucher/input.jpg");
            s.paste("Voucher created with Sikuli");

            s.find("imgs/voucher/numberVoucher.jpg").right().click("imgs/voucher/input.jpg");
            s.paste(num.toString());

            s.find("imgs/voucher/validFrom.jpg").right().click("imgs/voucher/select.jpg");
            s.paste(now);

            s.find("imgs/voucher/validto.jpg").right().click("imgs/voucher/select.jpg");
            s.paste(nextYear);

            s.find("imgs/voucher/type.jpg").right().click("imgs/voucher/arrowDown.jpg");
            if(type.equals("unique")){
                s.click("imgs/voucher/unique.jpg");
            }else if(type.equals("shared")){
                s.click("imgs/voucher/shared.jpg");
            }

            s.click("imgs/voucher/save.jpg");
            s.wait("imgs/voucher/created.jpg",200);




            /*s.click("imgs/voucher/close.jpg");*/

        } catch(Exception e){
            e.getMessage();
            e.getLocalizedMessage();

            System.out.println(e);
        }
    }
}