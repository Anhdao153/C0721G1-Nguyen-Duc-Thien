package giai_thuat;

public class bt4 {
    public static String[] arrayString(String[] array){
        String[] array1 = new String[array.length];

        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 1;

            if(array[i] != null){
                for (int j = i + 1; j < array.length ; j++) {
                    if (array[i]==array[j]){
                        count++;
                        array[j] = null;
                    }
                }
                array1[temp] = (array[i] + ":" + count);
                temp++;
            }

        }
        return array1;
    }

    public static void main(String[] args) {

    }
}

