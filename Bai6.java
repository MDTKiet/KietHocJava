import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args){
        int number, temp = 1;
        long giaithua = 1;
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("Nhap vao so: ");
        number = scanner.nextInt();
        }
        while((number <= 0) || (number > 10));
        while(temp <= number){
            giaithua *= temp;
            temp ++;
        }
        System.out.println(number + "! = " + giaithua);
    scanner.close();
    }
}
