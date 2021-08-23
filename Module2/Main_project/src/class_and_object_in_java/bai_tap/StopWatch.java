package class_and_object_in_java.bai_tap;

public class StopWatch {
    public static void main(String[] args){
        StopWatch2 stopWatch=new StopWatch2();
        stopWatch.start();
        System.out.println("đếm time");
        for (int i=1;i<=1000000000;i++){
            for(int j=i;j<100000000;j++){}
        }
        stopWatch.stop();
        stopWatch.getElapsedTime();
        // System.out.println("Số mili giây đếm được:" +stopWatch.getElapsedTime()*1000000);









    }
}
