void main() {
    Scanner input = new Scanner(System.in);
    int horaInicial =  input.nextInt();
    int horaFinal = input.nextInt();

    /**
     * Hora inicial -> 14
     * Hora final -> 13 24 - (14-13) => 24 - 1 = 23
     *
     */
    int duracao = calculaDuracao(horaInicial, horaFinal);

    System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
}

int calculaDuracao(int horaInicial, int horaFinal) {
    if(horaInicial == horaFinal) {
        return 24;
    } if(horaFinal < horaInicial) {
        return 24 - (horaInicial - horaFinal);
    } else {
        return horaFinal - horaInicial;
    }
}