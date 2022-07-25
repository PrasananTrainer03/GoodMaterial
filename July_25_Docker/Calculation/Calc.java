import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();
	c = a+b;
	System.out.println("Sum is   " +c);
    }
}