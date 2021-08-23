package class_and_object_in_java.bai_tap;



public class LopFan {
    public static void main(String[] args){
        Fan fan1=new Fan();
        Fan fan2=new Fan();
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan2.setspeed(Fan.medium);
        fan1.seton(true);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());



    }
}
