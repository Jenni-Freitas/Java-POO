//Conter um novo atributo (cilindrada)
//Se cilindrada > 300 : Acréscimo de 15%

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, String placa, double precoBase, int cilindrada) {
        super(marca, modelo, ano, placa, precoBase);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public double calcularDiaria(){
        if (cilindrada > 300){
            return getPrecoBase() * 1.15; //(1.15 de 15%)
        }
        return getPrecoBase();
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + " " +cilindrada;
    }
}
