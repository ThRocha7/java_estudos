public class App{
    public static void main(String[] args){
        Circulo c1 = new Circulo(5);
        c1.calcularArea();
        c1.exibirArea();
        System.out.println("------------------------");

        Retangulo r1 = new Retangulo(30, 18);
        r1.calcularArea();
        r1.exibirArea();
        System.out.println("------------------------");

        Quadrado q1 = new Quadrado(19);
        q1.calcularArea();
        q1.exibirArea();
    }
}