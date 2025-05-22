package com.design_pattern._01_creational_patterns._03_abstract_factory._02_after;

import com.design_pattern._01_creational_patterns._02factory_method._02_after.Anchor;
import com.design_pattern._01_creational_patterns._02factory_method._02_after.Wheel;
import com.design_pattern._01_creational_patterns._03_abstract_factory._01_before.WhiteAnchor;
import com.design_pattern._01_creational_patterns._03_abstract_factory._01_before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
