public class Quadrado extends FiguraGeometrica{
    private double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public void calcularArea(){
        this.area = Math.pow(this.lado, 2);
    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }
}