void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int number = input.nextInt();

    String isNegative = (number < 0) ? "NEGATIVO" : "NAO NEGATIVO";

    System.out.println(isNegative);

}