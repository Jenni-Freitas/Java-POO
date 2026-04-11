//SISTEMA DE VEICULOS - 4 pilares da POO em Java
// Uma locadora de veiculos precisa calcular o valor da diaria
// De diferentes tipos de veiculos (Carros e Moto)
//Cada tipo tem seu proprio calculo


//PILAR 1 - ABSTRAÇÃO
//MODELAR APENAS O QUE IMPORTA: marca, modelo, ano, placa, preço base;
//METODO - CalcularDiaria()
//Abstrato pois cada veiculo terá sua própria diária (calculo).

abstract class Veiculo {

    //ATRIBUTOS PROTEGIDOS (ENCAPSULAMENTO)
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double precoBase;

    public Veiculo(String marca, String modelo, int ano, String placa, double precoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.precoBase = precoBase;
    }

    //Metodo Abstrato - CADA SUBTIPO DEFINE O CALCULO
    public abstract double calcularDiaria();

    //PILAR 2 - ENCAPSULAMENTO
    // MODIFICADORES VIA GETTERS E SETTERS
    //O SETTER DE PRECOBASE TEM VALIDAÇÃO: NÃO ACEITA VALORES NEGATIVOS
    //EXEMPLO GETTERS
    public String getMarca() {return marca;}

    public String getModelo() {return modelo;}

    public String getPlaca() {return placa;}

    public int getAno() {return ano;}

    public double getPrecoBase() {return precoBase;}

    //EXEMPLO SETTERS
    public void setPrecoBase(double precoBase) {
        if (precoBase < 0) {
            System.out.println("Erro: Preço não pode ser negativo!");
            return;
        }
        this.precoBase = precoBase;
    }

    public String exibirDados() {
        return marca + " " + modelo + " (" + ano + ")" + placa + " " + precoBase;
    }


//PILAR 3 - HERANÇA
//Carro e Moto herdam tudo de veiculo, mas cada um adiciona
//Seus próprios atributos e implementa calcularDiaria() do seu jeito

//CARRO - Qtd Portas (atributos)
//Metodo calcularDiaria - Se qtdePortas >= 4 então acréscimo de 20%

    }