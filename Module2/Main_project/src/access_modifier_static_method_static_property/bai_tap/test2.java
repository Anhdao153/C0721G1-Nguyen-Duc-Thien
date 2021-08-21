package access_modifier_static_method_static_property.bai_tap;

public class test2 {
    private String name="john";
    private String classes="co2";
    public test2(String name, String classes){
        this.classes=classes;
        this.name=name;

    }

    public test2() {

    }

    private String getClasses() {
        return classes;
    }

    private String getName() {
        return name;
    }
}
