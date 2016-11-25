package com.company;

import com.company.controller.Scenario;
import com.company.view.Selector;
import com.company.model.*;

public class Main{

    public static void main(String[] args) {
        Selector vs = new Selector();
        Scenario cs = new Scenario();
        Vouchers mv = new Vouchers();

        vs.main();


        /*Here you can select a project*/
        /*int project = vs.project();*/

        /*cs.initialize(5);
        mv.create(1,"shared");
        cs.evacuation();*/

    }
}
