package class_and_object_in_java.bai_tap;

public class StopWatch {
    public static void main(String[] args){
        LopStopWatch stopWatch=new LopStopWatch();
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
