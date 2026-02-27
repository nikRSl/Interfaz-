package com.hospital.robotics.factory;

import com.hospital.robotics.arm.RoboticArm;
import com.hospital.robotics.vision.VisionSystem;

public interface SurgeryRobotFactory {

    RoboticArm createArm();
    VisionSystem createVision();
}