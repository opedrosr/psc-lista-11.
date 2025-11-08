public class Principal {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota", "Corolla", 2022, 8.5);
        Veiculo moto = new Moto("Honda", "CB 500", 2023);
        Veiculo caminhao = new Caminhao("Volvo", "FH 540", 2021);

        exibirVeiculo(carro);
        exibirVeiculo(moto);
        exibirVeiculo(caminhao);
    }

    
    public static void exibirVeiculo(Veiculo v) {
        System.out.println("========================");
        v.exibirDetalhes();
        v.acelerar();
        System.out.println();
    }
}
