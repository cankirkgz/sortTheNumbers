import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sıralamak için birbirine eşit olmayan 3 tam sayı giriniz.");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a == b || a == c || b == c) {
            System.out.println("Hatalı giriş! Sayılar birbirine eşit olamaz.");
            System.exit(0);
        }
        
        if(a < b){
            if (a < c){
                System.out.print(a + " < ");
                if (b < c)
                    System.out.print(b + " < " + c);
                else
                    System.out.print(c + " < " + b);
            }
            else
                System.out.print(c + " < " + a + " < " + b);
        } else if (b < c) {
            System.out.print(b + " < ");
            if (a < c)
                System.out.print(a + " < " + c);
            else
                System.out.print(c + " < " + a);
        } else
            System.out.print(c + " < " + b + " < " + a);

    }
}