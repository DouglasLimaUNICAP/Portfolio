public class Main1 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo ="Uno";
        carro1.montadora = "Fiat";
        carro1.ano = 1992;
        carro1.potencia = 200;

        Carro carro2 = new Carro("Accent", "Hyundai", 2024, 50);

        Carro carro3 = new Carro("Creta", "Hyundai", 50);

        Carro carro4 = new Carro("Creta");

        System.out.println(carro2.modelo + carro2.montadora + carro2.ano + carro2.potencia);
        System.out.println(carro1.ano + carro1.modelo + carro1.montadora + carro1.potencia);
        System.out.println(carro3.ano + carro3.potencia + carro3.modelo + carro3.montadora);
        System.out.println(carro4.modelo);


    }
}
