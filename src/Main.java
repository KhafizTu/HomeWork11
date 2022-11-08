import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tringle tringle = new Tringle();
        System.out.print("a: ");
        tringle.a = scanner.nextInt();
        System.out.print("\nb: ");
        tringle.b = scanner.nextInt();
        System.out.print("\nc: ");
        tringle.c = scanner.nextInt();
        System.out.println();

        System.out.println("area: " + tringle.area());

    }
}
