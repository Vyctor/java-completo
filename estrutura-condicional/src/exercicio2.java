void main() {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    int num = input.nextInt();
    String isOddOrEven = num % 2 == 0 ? "PAR" : "IMPAR";
    System.out.println(isOddOrEven);
}