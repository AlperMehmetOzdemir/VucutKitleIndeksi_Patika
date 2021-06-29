import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo, boy, vücutKitleİndeksi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = scanner.nextDouble();

        vücutKitleİndeksi = kilo /  Math.pow(boy, 2);

        System.out.println("Vücut Kitle İndeksiniz : " + vücutKitleİndeksi);
    }
}
