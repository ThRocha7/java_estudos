public abstract class FiguraGeometrica{
    protected double area;

    protected abstract void calcularArea();

    public void exibirArea(){
        System.out.printf("A área é igual a  %.2f\n", this.area);
    }
}