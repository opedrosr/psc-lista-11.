public class Carro extends Veiculo {
    private double tempoAceleracao; // tempo de 0 a 100 km/h

    public Carro(String marca, String modelo, int ano, double tempoAceleracao) {
        super(marca, modelo, ano);
        this.tempoAceleracao = tempoAceleracao;
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " " + marca + 
            " está acelerando de 0 a 100 km/h em " + tempoAceleracao + " segundos.");
    }
}
