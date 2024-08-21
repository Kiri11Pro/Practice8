import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину стороны квадрата");
        a = scan.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j < a; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
