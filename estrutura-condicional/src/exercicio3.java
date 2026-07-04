void main() {
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();

    String result = "Nao sao Multiplos";

    if(a%b == 0 || b%a == 0){
        result = "Sao Multiplos";
    }

    System.out.println(result);
}