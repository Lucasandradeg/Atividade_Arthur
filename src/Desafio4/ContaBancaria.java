package Desafio4;

public class ContaBancaria {
    private int NumeroConta;
    private String nomeTitular;
    private double saldo;


    // Construtor para inicializar a conta
    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.NumeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        saldo -= (valor + 5); // Cobre a taxa de saque de R$5.00
    }

    // Método para obter informações da conta
    public String getInfo() {
        return "\n Numero Da conta:"  + NumeroConta + "\n Titular: " + nomeTitular + "\n Saldo: " + saldo;
    }
}
