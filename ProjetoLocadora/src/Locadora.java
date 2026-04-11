import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Veiculo> frota;

    public Locadora (){
        this.frota = new ArrayList<>();
    }

    public void adicionarVeículo(Veiculo veiculo){
        frota.add(veiculo);
    }
    public void listarVeiculo(){
        for (int i = 0; i < frota.size(); i++) {
            Veiculo veiculo = frota.get(i);
        System.out.printf("[%d] %s %s | Diária: R$ %.2f\n", (i + 1), veiculo.getMarca(), veiculo.getModelo(), veiculo.calcularDiaria());
        }
    }


}

//Cadastrar Veículo
//Listar Veiculo
//Alugar
//Disponibilidade (Boolean)