public class Circulo extends FiguraGeometrica{
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public void calcularArea(){
        this.area = Math.pow(this.raio, 2) * Math.PI;
    }

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }
}