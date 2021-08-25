package giai_thuat;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public Character[] find(String string) {
        Character[] strings = new Character[string.length()];
        Character[] strings1 = new Character[string.length()];
        int temp = 0;




        for (int i = 0; i < string.length(); i++) {
            strings[i] =string.charAt(i);
        }
        for (int i = 0; i < strings.length - 1 ; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j]) && strings[i] !=' ') {
                    strings1[temp] = strings[i];
                    temp++;
                    strings[j] = ' ';
                    break;
                }
            }
        }
        Character[] strings2 = new Character[temp];
        for (int i = 0; i < temp ; i++) {
            strings2[i] = strings1[i];

        }
        return strings2;

    }

    public static void main(String[] args) {
        main main2=new main();
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        System.out.println(Arrays.toString(main2.find(text)));
    }
}
