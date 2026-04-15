import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Veiculo> frota;

    public Locadora (){
        this.frota = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo){
        frota.add(veiculo);
    }
    public void listarVeiculo(){
        for (int i = 0; i < frota.size(); i++) {
            Veiculo veiculo = frota.get(i);
        System.out.printf("[%d] %s %s | Diária: R$ %.2f\n", (i + 1), veiculo.getMarca(), veiculo.getModelo(), veiculo.calcularDiaria());
        }

        System.out.println("============");
    }
    public List<Veiculo> getFrota(){
        return frota;
    }

    public void aluguelVeiculo (int dias, int idVeiculo){
        //Implementar a lógica para alugar um carro/moto.
      Veiculo veiculo = frota.get(idVeiculo - 1);

      double total = veiculo.calcularDiaria() * dias;

        System.out.println("=== Resumo do aluguel veiculo: ===");
        System.out.println("Veiculo" + veiculo.exibirDados());
        System.out.println("Quantidade de dias: " + dias);
        System.out.printf("Valor diário: %.2f", veiculo.calcularDiaria());
        System.out.printf("\nTotal do período da regência: %.2f ", total);
        }
    }

//Cadastrar Veículo
//Listar Veiculo
//Alugar
//Disponibilidade (Boolean)