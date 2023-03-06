import java.util.Scanner;
public class Bai1{
    public static void main(String[] args) {
        float a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao hai so duong bat ki:");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        System.out.println("Tong cua hai so la: " + (a + b));
        System.out.println("Hieu cua hai so la: " + (a - b));
        System.out.println("Tich cua hai so la: " + (a * b));
        System.out.println("Thuong cua hai so la: " + (a / b));
        if(a > b){ 
            System.out.println("a lon hon b");
        }
        else if(a == b){
            System.out.println("a bang b");
        }
        else{
            System.out.println("a nho hon b");
        }
        scanner.close();
    }
}