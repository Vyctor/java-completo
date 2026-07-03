import java.util.Scanner;

void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o primeiro  número: ");
    int a = scanner.nextInt();
    System.out.print("Digite o segundo  número: ");
    int b = scanner.nextInt();
    String result = "SOMA = " + (a+b);
    System.out.print(result);
}
