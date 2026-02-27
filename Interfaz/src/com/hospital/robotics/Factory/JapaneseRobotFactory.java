package com.hospital.robotics.factory;

import com.hospital.robotics.arm.*;
import com.hospital.robotics.vision.*;

public class JapaneseRobotFactory implements SurgeryRobotFactory {

    @Override
    public RoboticArm createArm() {
        return new JapaneseArm();
    }

    @Override
    public VisionSystem createVision() {
        return new JapaneseVision();
    }
}