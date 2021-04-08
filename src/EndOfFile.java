import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //USING FOR LOOP STATEMENT........
        for(int i=1; sc.hasNext(); i++){
            String str = sc.nextLine();
            System.out.println(i+" "+str);

        }
        //USING WHILE LOOP STATEMENT.......
//        int counter = 1;
//        while(sc.hasNext()){
//            String str= sc.nextLine();
//            System.out.println(counter+" "+str);
//            counter++;
//        }


        sc.close();
    }
}


