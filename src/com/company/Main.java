package com.company;

import com.company.Interfaces.Head;
import com.company.Interfaces.Leg;
import com.company.Sony.SonyLeg;
import com.company.Toshiba.ToshibaHead;

public class Main {

    public static void main(String[] args) {

        Leg leg = new SonyLeg();
        Head head = new ToshibaHead();

        Robot robot = new Robot(leg, head);

        robot.action();
    }
}
