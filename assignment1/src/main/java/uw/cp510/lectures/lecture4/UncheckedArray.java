package uw.cp510.lectures.lecture4;

public class UncheckedArray {

    public static void main(String[] args) {
        int[] array = new int[10];
        int count = 0;
        int attempt = 21;
        while (count <= attempt) {
            try {
                System.out.println(array[count]);

            }
//            catch (Exception e) {
//                e.printStackTrace();
//            }

            finally {
                System.out.println("Count" + count);
                count++;
            }



        }
    }
}
