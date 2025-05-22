package com.design_pattern._01_creational_patterns._03_abstract_factory._02_after;

import com.design_pattern._01_creational_patterns._02factory_method._02_after.Anchor;
import com.design_pattern._01_creational_patterns._02factory_method._02_after.Wheel;

public class WhitePartsProFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
