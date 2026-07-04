void main() {
    Scanner input = new Scanner(System.in);
    Product[] products = buildProductList();
    int codigo = input.nextInt();
    int quantidade = input.nextInt();

    double total = products[codigo-1].preco * quantidade;

    System.out.println("Total: R$ " + total);
}

class Product {
    int codigo;
    String descricao;
    double preco;

    Product(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }
}

Product[] buildProductList() {
    Product[] products = new Product[5];
    products[0] = new Product(1, "Cachorro Quente", 4.00);
    products[1] = new Product(2, "X-Salada", 4.50);
    products[2] = new Product(3, "X-Bacon", 5.00);
    products[3] = new Product(4, "Torrada simples", 2.00);
    products[4] = new Product(5, "Refrigerante", 1.50);

    return products;
}
