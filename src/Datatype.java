import java.util.Scanner;

public class Datatype {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc . nextInt();
        for(int i=0; i< t; i++){


            try{

                long x = sc.nextLong();
                System.out.println(x+ "can be fiiteed in:");
                if(x>= Byte.MIN_VALUE && x<= Byte.MAX_VALUE)
                    System.out.println("* Byte");
                if(x>= Short.MIN_VALUE && x<= Short.MAX_VALUE)
                    System.out.println("* Short");
                if(x>= Integer.MIN_VALUE && x<= Integer.MAX_VALUE)
                    System.out.println("* Integer");
//               Condition 'x>= Long.MIN_VALUE' is always 'true'
//                Condition 'x>= Long.MIN_VALUE && x<= Long.MAX_VALUE' is always 'true'
       //.so,

//                if(x>= Long.MIN_VALUE && x<= Long.MAX_VALUE)
                    System.out.println("* Long");
            }
            catch (Exception e){

                System.out.println(sc.next()+ "Cannot be fitted anywhere .");
            }
        }
sc .close();
    }
}
