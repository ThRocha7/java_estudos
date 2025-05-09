public class Produto{
    private String descProduto;
    private int codigo; 
    public int qntd;
    public double preco;

    public Produto (int codigo, String descProduto, double preco, int quantidade) {
        this.codigo = codigo;
        this.descProduto = descProduto;
        this.preco = preco;
        this.qntd = quantidade;
    }

    public void listarDados (){
        System.out.println("Código do Produto: " + this.codigo + ";");
        System.out.println("Produto: " + this.descProduto + ";");
        System.out.println("Preço: " + this.preco + ";");
        System.out.println("Quantidade: " + this.qntd + ";");
        System.out.println("---------------------------------------------");
    }
}
