package com.company;

import com.company.controller.Scenario;
import com.company.view.Selector;
import com.company.model.*;

public class Main{

    public static void main(String[] args) {
        Selector vs = new Selector();
        Scenario cs = new Scenario();

        /*Application opening*/
        vs.openFrame();

        /*Launch selected project*/
        cs.initialize(vs.get_dataProject());

        /*Execute selected sections*/
        cs.execution(vs.get_dataSection(),true);

        /*Application closing*/
        cs.evacuation();

    }
}
