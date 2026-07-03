import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int d = input.nextInt();

    int diff = a*b-c*d;

    System.out.println("DIFERENCA = "+diff);
}

