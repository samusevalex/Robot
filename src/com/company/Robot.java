package com.company;

import com.company.Interfaces.Head;
import com.company.Interfaces.Leg;

public class Robot {
    private Leg leg;
    private Head head;

    public Robot(Leg leg, Head head){
        this.leg = leg;
        this.head = head;
    }
    public void action(){
        leg.go();
        head.calc();
    }
}
