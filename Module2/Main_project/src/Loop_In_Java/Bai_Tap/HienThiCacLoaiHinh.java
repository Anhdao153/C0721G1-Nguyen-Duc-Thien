package Loop_In_Java.Bai_Tap;
import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int choice = -1;
            while (choice != 0) {
                System.out.println("/n Menu");
                System.out.println("1. Draw the triangle");
                System.out.println("2. Draw the square");
                System.out.println("3. Draw the rectangle");
                System.out.println("0. Exit");
                System.out.println("Enter your choice: ");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        int a;
                        System.out.println("nhap A");
                        a=input.nextInt();
                        for (int i=0;i<=a;i++){
                            System.out.print("*");
                            for (int j=0;j<=a;j++){
                                System.out.print("*");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Draw the square");
                        int b;
                        System.out.println("nhap b");
                        b=input.nextInt();
                        for (int i=0;i<=b;i++){
                            System.out.println("*");
                            for (int j=0;j<=i;j++){
                                System.out.print("*");
                            }
                        }
                        break;
                    case 3:
                        int c;
                        System.out.println("nhap c");
                        c=input.nextInt();
                        for (int i=0;i<=c;i++){
                            System.out.print("*");
                            for (int j=c;j>i;j--){
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("N1o choice!");


                }


            }
        }
    }

