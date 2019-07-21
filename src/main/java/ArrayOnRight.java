public class ArrayOnRight {


    public static void main(String[] args) {

        int l = n.length - 1;
        int counter = 0;

        for (int i = 0; i <= l; i++) {

            if (n[i] == 3) {
                n[i] = n[i + 1];
                counter++;
                for (int j = i + 1; j < l; j++) {
                    n[j] = n[j + 1];

                }

            }
        }

        // now add in the end for array
        while (counter != 0) {

            n[n.length - counter] = 3;
            counter--;
        }

        for (int i = 0; i <= l; i++) {

            System.out.print(" "+n[i]);
        }

    }

    static int[] n = {1, 4, 3, 5, 3, 6, 3, 7, 8};

}


