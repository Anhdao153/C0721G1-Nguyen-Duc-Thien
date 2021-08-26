package giai_thuat;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static String[] find(String str) {
        String[] arrResult = null;
        String tempResult = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            // kiểm tra nếu xuất hiện lớn hơn 1 lần và khác " "
            if (count > 1 && !String.valueOf(str.charAt(i)).equals(" ")) {
                boolean flag = false;
                // kiểm tra để lấy giá trị duy nhất
                for (int k = 0; k < tempResult.length(); k++) {
                    if (str.charAt(i) == tempResult.charAt(k)) {
                        flag = true;
                    }
                }
                // cho ký tự vào biến tạm nếu chưa tồn tại trong biến tạm
                if (!flag) {
                    tempResult += str.charAt(i);
                }
            }
        }
        // chuyển về mảng theo yêu cầu
        arrResult = tempResult.split("");
        return arrResult;
    }

    public static void main(String[] args) {
        main main2=new main();
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        System.out.println(Arrays.toString(main2.find(text)));
    }
}
