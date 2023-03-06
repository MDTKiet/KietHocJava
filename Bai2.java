import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so can kiem tra");
        n = scanner.nextInt();
        if(n%2 == 0){
            System.out.println("day la so chan");
        }
        else{
            System.out.println("day la so le");
        }
        scanner.close();
    }
}