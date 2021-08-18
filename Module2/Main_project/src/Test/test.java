package Test;



public class test {
    public static void main(String[] args) {
        test2 stopWatch = new test2();
        stopWatch.start();
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }
}
