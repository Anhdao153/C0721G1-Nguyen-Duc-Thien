package Test;


import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Add chay = new Add();
        while (true) {
            System.out.println("Chọn chức năng\n" +
                    "1.Add\n" +
                    "2.show\n" +
                    "3.Exti");
            System.out.print("Chọn ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    chay.add();
                    break;
                case 2:
                    chay.show();
                    break;


            }
        }
    }
}