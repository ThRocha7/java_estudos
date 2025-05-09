import java.util.ArrayList;
import java.util.List;

class CarrinhoCompra {
    private List<Produto> itens = new ArrayList<>();

    public void adicionarProduto(Produto prod) {
        itens.add(prod);
    }

    public void exibeCarrinho() {
        for (Produto p : itens) {
            p.listarDados();
        }
    }

    public double fecharCompra() {
        double total = 0;
        for (Produto p : itens) {
            total += p.preco * p.qntd;
        }
        return total;
    }
}