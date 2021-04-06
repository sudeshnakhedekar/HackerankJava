import java.util.Scanner;

public class PrintfFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0; i<3; i++){
            String s1 = sc.next();
            int x1 = sc.nextInt();

            System.out.println("%-15s%03d\n"+ s1+ " " +x1);

        }
        System.out.println("================================");
        sc.close();
    }
}
