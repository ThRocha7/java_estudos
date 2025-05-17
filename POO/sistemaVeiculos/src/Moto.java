public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String marca, String modelo, int cilindradas){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Cilindradas: " + this.cilindradas + " CC");
    }

    public int getCilindradas(){
        return this.cilindradas;
    }

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }
}