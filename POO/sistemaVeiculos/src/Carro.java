public class Carro extends Veiculo {
    private int portas;

    public Carro(String placa, String marca, String modelo, int portas){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.portas = portas;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Portas: " + this.portas);
    }

    public int getPortas(){
        return this.portas;
    }

    public void setPortas(int portas){
        this.portas = portas;
    }
}