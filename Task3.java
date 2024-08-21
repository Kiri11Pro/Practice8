import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника");
        a = scan.nextInt();
        System.out.println("Введите ширину прямоугольника");
        b = scan.nextInt();
        for (int i = 1; i <= a; i++){
            for (int j = 1; j < b; j++){
                if (i == 1 || i == a){
                    System.out.print("*");
                }else {
                    if (j == 1){
                        System.out.print("*");
                    }else {
                        System.out.print("-");
                    }
                }
            }
            System.out.println("*");
        }
    }
}
