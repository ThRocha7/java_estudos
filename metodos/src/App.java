public class App {
    static double calcularAreaCirc(double raio){
        double areaCirc = 3.14 * Math.pow(raio, 2);
        return areaCirc;
    }

    static double calcularVolumeCirc(double raio){
        double volumeCirc =  4 * 3.14 * Math.pow(raio, 3) / 3;
        return volumeCirc;
    }

    public static void main(String[] args){
        double raio = 3;
        
        double area = calcularAreaCirc(raio);
        System.out.println("A área do circulo de raio " + raio + "é: " + area);

        double volume = calcularVolumeCirc(raio);
        System.out.println("A volume do circulo de raio " + raio + "é: " + volume);
    }
}