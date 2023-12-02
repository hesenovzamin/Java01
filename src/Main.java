import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    /*

        boolean f = true;

        for ( int i = 3; i <= 100  ; i ++) {
            f = true;
            for (int j = 2 ; j < i/2 ; j++){
                if(i % j == 0) {
                    f = false;
                    break;
                }
            }
            if(f){
                System.out.println(i);
            }
        }

     */
        /*

        int n =  0 ;
        int m = 0 ;

        for ( int i = 0; i <= 100  ; i ++) {
            if(i % 2 == 0){
                n = n + i;
            }else{
                m = m + i;
            }
        }
        System.out.println(n + "   " + m);


         */

        /*

        int n =  0 ;
        int  m = 1 ;

        for ( int i = 0; i <= 10 ; i ++) {

            System.out.println(n);
            int sum = n + m ;
            n =m;
            m = sum;
        }

         */

        /*

        Scanner scanner = new Scanner(System.in);
        int m = 651;
        int n = scanner.nextInt();
        boolean f = true;
        while (f){
            if(n == m){
                System.out.println("Duz tapdiniz");
                f = false;
            } else if (n > m) {

                System.out.println("Asagi deyer teyin edin ");
                n = scanner.nextInt();
            }else {
                System.out.println("Yuxari deyer teyin edin ");
                n = scanner.nextInt();
            }
        }

         */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for ( int i = 1; i <= 9 ; i ++) {

            System.out.println(n + " * " + i + " = " + i*n);
        }






       /*

        int a = 10;
        int b = 1;

        for ( int i = 2; i <= a  ; i ++) {
            System.out.print(b + " * ");
            b = b * i;
            System.out.println(i + " = " + b);
        }

        */




    }
}