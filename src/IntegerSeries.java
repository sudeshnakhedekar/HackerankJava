import java.util.Scanner;

public class IntegerSeries {

    public static void main (String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int i = 0; i < testcase; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();


            for (int j = 0; j < n; j++) {
                a = a + b;
                System.out.println(a + "");
                b = b * 2;


            }
            System.out.println();

        }
        sc.close();
    }

}
