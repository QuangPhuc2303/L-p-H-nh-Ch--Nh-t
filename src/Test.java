import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap cac canh cua hinh chu nhat ...");
        System.out.println("Nhap chieu rong : ");
        double width = scanner.nextDouble();
        System.out.println("Nhap chieu dai : ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Dien Tich = " + rectangle.getArea());
        System.out.println("Chu Vi = " + rectangle.getPerimeter());
    }
}
