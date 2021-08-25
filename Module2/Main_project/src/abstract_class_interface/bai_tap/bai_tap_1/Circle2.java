package abstract_class_interface.bai_tap;

import access_modifier_static_method_static_property.bai_tap.Circle;

public class Circle2 extends Circle implements resize {
    public Circle2(double v){}


    @Override
    public double resize(double percent) {
        return percent;
    }
}

