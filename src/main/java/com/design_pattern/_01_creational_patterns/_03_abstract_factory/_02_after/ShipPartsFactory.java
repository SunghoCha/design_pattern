package com.design_pattern._01_creational_patterns._03_abstract_factory._02_after;

import com.design_pattern._01_creational_patterns._02factory_method._02_after.Anchor;
import com.design_pattern._01_creational_patterns._02factory_method._02_after.Wheel;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();

}
