import java.util.Scanner;

public class Recursive5Kurali {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısını girin: ");
        int n = scanner.nextInt(); // Kullanıcıdan n sayısını alır

        recursiveMethod(n); // recursiveMethod'u çağırır
    }

    public static void recursiveMethod(int n) {
        System.out.print(n + " "); // Sayıyı ekrana yazdırır

        if (n <= 0) {
            return; // Sayı 0 veya negatifse metottan çıkar ve geri döner
        }

        recursiveMethod(n - 5); // Sayıdan 5 çıkararak recursiveMethod'u tekrar çağırır

        System.out.print(n + " "); // Sayıyı tekrar ekrana yazdırır
    }
}
