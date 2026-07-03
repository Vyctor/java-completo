void main() {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o raio do círculo: ");
    double raio = input.nextFloat();
    double area = Math.PI * Math.pow(raio, 2);
    System.out.println(area);
}