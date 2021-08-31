package giai_thuat;
public class MangHaiChieu {
        public static void setMax(int[][] array){
            int[] intMaxArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                int max = array[i][0];

                for (int j = 0; j < array[i].length; j++) {

                    if(max < array[i][j]){
                        max = array[i][j];
                    }

                }
                intMaxArray[i] = max;
            }
            for (int i = 0; i < intMaxArray.length; i++) {
                System.out.println(intMaxArray[i]);
            }
        }

    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{2,3,4,5},{4,5,6,7}};
        MangHaiChieu.setMax(arr);


    }
}
