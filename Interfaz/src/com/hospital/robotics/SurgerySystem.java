package com.hospital.robotics;

import com.hospital.robotics.factory.SurgeryRobotFactory;
import com.hospital.robotics.arm.RoboticArm;
import com.hospital.robotics.vision.VisionSystem;

public class SurgerySystem {

    private RoboticArm arm;
    private VisionSystem vision;

    public SurgerySystem(SurgeryRobotFactory factory) {
        this.arm = factory.createArm();
        this.vision = factory.createVision();
    }

    public void performSurgery() {
        vision.scan();
        arm.operate();
    }
}