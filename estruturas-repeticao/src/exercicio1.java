void main() {
    Scanner input = new Scanner(System.in);
    boolean isValidPassword = false;
    int providedPassword;
    int validPassword=  2002;
    while (!isValidPassword) {
        providedPassword = input.nextInt();
        if(providedPassword == validPassword) {
            isValidPassword = true;
            System.out.println("Acesso Permitido");

        } else {
            System.out.println("Senha Invalida");
        }
    }
}