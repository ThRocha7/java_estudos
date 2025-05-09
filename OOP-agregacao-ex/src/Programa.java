public class Programa {
    public static void main(String[] args) {
        CarrinhoCompra carrinho = new CarrinhoCompra();

        Produto prod1 = new Produto(1, "Shampoo", 11.99, 2);
        Produto prod2 = new Produto(2, "Sabão", 2.50, 5);
        Produto prod3 = new Produto(3, "Coca-cola", 6.99, 3);
        Produto prod4 = new Produto(4, "Arroz", 25.00, 1);
        Produto prod5 = new Produto(5, "Feijão", 8.75, 2);
        Produto prod6 = new Produto(6, "Creme dental", 4.40, 5);
        Produto prod7 = new Produto(7, "Detergente", 2.30, 4);
        Produto prod8 = new Produto(8, "Perfume", 190.30, 1);
        Produto prod9 = new Produto(9, "Carne Moída", 20.30, 1);
        Produto prod10 = new Produto(10, "Chocolate", 4.90, 2);
        

        carrinho.adicionarProduto(prod1);
        carrinho.adicionarProduto(prod2);
        carrinho.adicionarProduto(prod3);
        carrinho.adicionarProduto(prod4);
        carrinho.adicionarProduto(prod5);
        carrinho.adicionarProduto(prod6);
        carrinho.adicionarProduto(prod7);
        carrinho.adicionarProduto(prod8);
        carrinho.adicionarProduto(prod9);
        carrinho.adicionarProduto(prod10);

        System.out.println("Produtos no carrinho:");
        carrinho.exibeCarrinho();

        double totalCompra = carrinho.fecharCompra();
        System.out.println("Total da compra: R$ " + totalCompra);
    }
}
