import java.util.Scanner;

public class PrintIntDoubleString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();


        System.out.println("String is :"+ s);
        System.out.println("Double is :"+ d);
        System.out.println("Integer is :"+ i);
        sc.close();
    }
}
