package Introduction_to_Java.Thuc_hanh;

import java.util.Scanner;

public class TinhChiSoCanNangCuaCoThe {
    float height;
    float weight;

    public static void main(String[] args) {
        TinhChiSoCanNangCuaCoThe check = new TinhChiSoCanNangCuaCoThe();
        System.out.println("nhập số cân nặng và chiều cao của bạn vào");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số cân nặng của bạn: ");
        check.weight = scanner.nextInt();
        System.out.print("Số chiều cao của bạn: ");
        check.height = scanner.nextInt();
        check.height=check.height/100;
        float BMI;
        BMI = check.weight / (check.height*check.height);
        System.out.println(BMI);
        System.out.println(check.height);
        System.out.println(check.weight);
        if (BMI < 18.5) {
            System.out.println("UnderWeight");
        } else if (25>BMI||BMI>=18.5) {
            System.out.println("normal");

        } else if (30>BMI||BMI>=25){
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }


}
