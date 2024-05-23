import geometriss.Segitiga;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sisi1: ");
        double sisi1 = input.nextDouble();
        System.out.print("Masukkan sisi2: ");
        double sisi2 = input.nextDouble();
        System.out.print("Masukkan sisi3: ");
        double sisi3 = input.nextDouble();
        
        System.out.print("Masukkan warna: ");
        String color = input.next();
        System.out.print("Apakah segitiga terisi (true/false): ");
        boolean filled = input.nextBoolean();
        
        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3, color, filled);
        
        System.out.println("\n" + segitiga.toString());
        System.out.printf("Luas: %.2f\n", segitiga.getArea());
        System.out.printf("Keliling: %.2f\n", segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getColor());
        System.out.println("Terisi: " + segitiga.isFilled());

    }
}
