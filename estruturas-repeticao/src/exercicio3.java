void main() {
    Scanner input = new Scanner(System.in);
    int selectedOption = 99;
    int exitOption = 4;
    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;

    do {
        selectedOption = input.nextInt();

        if(selectedOption == 1) {
            alcool++;
        }
        else if(selectedOption == 2) {
            gasolina++;
        }
        else if(selectedOption == 3) {
            diesel++;
        }
        else if(selectedOption == 4) {
            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("Diesel: " + diesel);
            return;
        }
    } while (selectedOption != exitOption);

}