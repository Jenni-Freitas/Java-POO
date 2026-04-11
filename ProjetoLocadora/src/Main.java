public class Main {
    static void main(String [] args) {

        Carro carro1 = new Carro("Porsche", "Cayanne", 2027, "hhh-8888", 2350, 4);
//        System.out.println(carro1.exibirDados());

        Moto moto1 = new Moto("Suzuki","Hayabusa",2005,"xxx-9999",190,1000);
//        System.out.println(moto1.exibirDados());

        Locadora locadora = new Locadora();
        locadora.adicionarVeículo(carro1);
        locadora.adicionarVeículo(moto1);
        locadora.listarVeiculo();


    }
}
