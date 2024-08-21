import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину стороны квадрата");
        a = scan.nextInt();
        for (int i = 1; i <= a; i++){
            for (int j = 1; j < a; j++){
                if (i == 1 || i == a){
                    System.out.print("*");
                }else{
                    if (j==1){
                        System.out.print("*");
                    }else {
                    System.out.print("-");}
                }
            }
            System.out.println("*");
        }
    }
}
