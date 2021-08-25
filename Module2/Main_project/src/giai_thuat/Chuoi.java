package giai_thuat;

import java.util.Arrays;
import java.util.Scanner;

public class Chuoi {
    public Character[] find(String string) {
            Character[] characters = new Character[string.length()];
            Character[] characters1 = new Character[string.length()];
            int temp = 0;




            for (int i = 0; i < string.length(); i++) {
                characters[i] = string.charAt(i);
            }
            for (int i = 0; i < characters.length - 1 ; i++) {
                int count = 0;

                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i].equals(characters[j]) && characters[i] !=' ') {

                        count++;
                        characters[j] = ' ';
                    }
                    if(count != 0 && j == characters.length -1 ){
                        characters1[temp] = characters[i];
                        temp++;
                    }
                }
            }
            Character[] characters2 = new Character[temp];
            for (int i = 0; i < temp ; i++) {
                characters2[i] = characters1[i];

            }
            return characters2;

        }


    public static void main(String[] args) {
        main main2=new main();
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        System.out.println(Arrays.toString(main2.find("nvhdkc ndoawk naqmkl nmmbzcxc nooiip nmhtd")));
    }
}
