import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double angle, r, pi=3.14, area;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapı girin: ");
        r = input.nextDouble();

        System.out.print("Daire diliminin merkez açısını girin: ");
        angle = input.nextDouble();
        area = (pi * r * r * angle)/360;

        System.out.println("Daire diliminin alanını: " + area);
        }
    }