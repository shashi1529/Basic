public class ArrayOntLeft {

    static int[] n = {1, 4, 3, 5, 3, 6, 3, 7, 8};

    public static void main(String[] args) {

        int l = n.length - 1;
        int counter = 0;

        for (int i = l; i >= 0; i--) {

            if (n[i] == 3) {
                n[i] = n[i-1];
                counter++;
                for (int j=i; j>0; j--) {
                    n[j] = n[j-1];

                }

            }
        }

        // now add in the Start for array
        while (counter != 0) {
            counter--;
            n[0+counter] = 3;

        }

        for (int i = 0; i <= l; i++) {

            System.out.print(" "+n[i]);
        }

    }


}
