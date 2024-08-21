import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a, b, j;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите начало диапозона");
        a = scan.nextInt();
        System.out.println("Ввидите конец диапозона");
        b = scan.nextInt();
        for (int i = a; i <= b; i++) {
            for (j = 2; i % j == 0; j++) {
//                if (i%j==0){
//                    System.out.println("непростое" +i);

//                }else {
                
            }System.out.println("простое" + i);


        }
    }
}
