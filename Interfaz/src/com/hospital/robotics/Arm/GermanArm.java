package com.hospital.robotics.arm;

public class GermanArm implements RoboticArm {

    @Override
    public void operate() {
        System.out.println("German arm: millimeter precision");
    }
}