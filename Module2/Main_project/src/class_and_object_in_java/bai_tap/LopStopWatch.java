package class_and_object_in_java.bai_tap;
import java.time.LocalTime;
public class LopStopWatch {
    private LocalTime endTime;
    private LocalTime  startTime ;
    public LocalTime getStartTime(LocalTime startTime){
        return startTime;
    }
    public LocalTime getEndTime(LocalTime endTime){
        return endTime;
    }
    LopStopWatch(){
        startTime=LocalTime.now();
    }
    public void start(){
        this.startTime=LocalTime.now();
        getStartTime(startTime);
    }
    public void stop(){
        this.endTime=LocalTime.now();
        getEndTime(endTime);
    }
    public void getElapsedTime(){
        int ElaspedTime=(startTime.toSecondOfDay()-endTime.toSecondOfDay())*10000000;
        System.out.println("Số mili giây đếm được:" +ElaspedTime);
    }
}
