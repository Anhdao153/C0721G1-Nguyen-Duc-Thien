package Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class DocChuThanhSo {

    public static void main(String[] args) {
        System.out.println("Hãy nhập số bạn cần đọc");
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        int d;
        d=a/100;
            switch (d) {
                case 1:
                    System.out.print("một trăm");
                    break;
                case 2:
                    System.out.print("hai trăm");
                    break;
                case 3:
                    System.out.print("ba trăm");
                    break;
                case 4:
                    System.out.print("bốn trăm ");
                    break;
                case 5:
                    System.out.print("năm trăm");
                    break;
                case 6:
                    System.out.print("sáu trăm");
                    break;
                case 7:
                    System.out.print("bảy trăm");
                    break;
                case 8:
                    System.out.print("tám trăm");
                    break;
                case 9:
                    System.out.print("chín trăm");
                    break;
            }
            int b=a;
            b=(a-d*100)/10;
            switch (b) {
                case 1:
                    System.out.print("Mười");
                    break;
                case 2:
                    System.out.print("hai mười");
                    break;
                case 3:
                    System.out.print("ba mươi");
                    break;
                case 4:
                    System.out.print("bốn mươi");
                    break;
                case 5:
                    System.out.print("năm mươi");
                    break;
                case 6:
                    System.out.print("sáu mươi");
                    break;
                case 7:
                    System.out.print("bảy mươi");
                    break;
                case 8:
                    System.out.print("tám mươi");
                    break;
                case 9:
                    System.out.print("chín mươi");
                    break;
            }
            int c=a;
            c=a-d*100-b*10;
            switch (c) {
                case 0:
                    System.out.println("Không");
                    break;
                case 1:
                    System.out.println("một");
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 3:
                    System.out.println("ba");
                    break;
                case 4:
                    System.out.println("bốn");
                    break;
                case 5:
                    System.out.println("năm");
                    break;
                case 6:
                    System.out.println("sáu");
                    break;
                case 7:
                    System.out.println("bảy");
                    break;
                case 8:
                    System.out.println("tám");
                    break;
                case 9:
                    System.out.println("chín");
                    break;
                default:
                    System.out.println("mười");
            }
        }
    }

