import java.util.Scanner;

public class Main {
    static void main(String [] args) {

        Carro carro1 = new Carro("Porsche", "Cayanne", 2027, "hhh-8888", 2350, 4);
//        System.out.println(carro1.exibirDados());

        Moto moto1 = new Moto("Suzuki","Hayabusa",2005,"xxx-9999",190,1000);
//        System.out.println(moto1.exibirDados());

        Carro carro2 = new Carro("Volkswagen ", "Voyage", 2012, "jjj-9999", 150, 4);
        System.out.println(carro2.exibirDados());

        Moto moto2 = new Moto("Yamaha","Factor",2021,"yyy-9999",200,1000);
//        System.out.println(moto2.exibirDados());

        Locadora locadora = new Locadora();
        locadora.adicionarVeiculo(carro1);
        locadora.adicionarVeiculo(moto1);
        locadora.adicionarVeiculo(carro2);
        locadora.adicionarVeiculo(moto2);
        locadora.listarVeiculo();

        int tamanho = locadora.getFrota().size();
        Scanner sc = new Scanner(System.in);

        System.out.printf("Escolha o veiculo (1 a " + tamanho + " ): ");
        int veiculoSelecionado = sc.nextInt();

        System.out.println("Quantos dias você deseja ficar com o veículo: ");
        int dias = sc.nextInt();

        locadora.aluguelVeiculo(dias, veiculoSelecionado);
    }
}
