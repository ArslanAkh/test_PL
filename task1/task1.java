import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int c = 1;

        do {
            System.out.print(c);
            c = c + m - 1;
            while (c > n) {
                c = c - n;
            }
        } while (c != 1);
        System.out.println();

        scan.close();
    }
}
