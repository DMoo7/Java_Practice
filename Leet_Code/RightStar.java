public class RightStar {


    public static void main (String[] args) {
        int n = 10;
        int i,j,k,e;
        for (i = 0; i < n; i++) {

            for (j = 0; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }

        for (k = n + 1; k >= 0 ; k--) {

            for (e = 0; e < k; e++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}