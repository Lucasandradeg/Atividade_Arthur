package Desafio4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Solicitar informações para criar a conta bancária
        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da conta:"));
        String nomeTitular = JOptionPane.showInputDialog("Insira o titular da conta:");

        // Criar uma instância da classe ContaBancaria
        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular);

        // Verificar se há depósito inicial
        int opcaoDeposito = JOptionPane.showConfirmDialog(null, "Existe depósito inicial?", "Depósito Inicial", JOptionPane.YES_NO_OPTION);

        if (opcaoDeposito == JOptionPane.YES_OPTION) {
            double valorInicial = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor inicial:"));
            conta.depositar(valorInicial);
        }

        // Exibir dados da conta
        JOptionPane.showMessageDialog(null, conta.getInfo(), "Dados da Conta", JOptionPane.INFORMATION_MESSAGE);


        // Exibir dados da conta atualizados após o depósito
        JOptionPane.showMessageDialog(null, conta.getInfo(), "Dados da Conta Atualizado", JOptionPane.INFORMATION_MESSAGE);

        // Realizar um saque
        int opcaoSaque = JOptionPane.showConfirmDialog(null, "Deseja realizar um saque?", "Saque", JOptionPane.YES_NO_OPTION);

        if (opcaoSaque == JOptionPane.YES_OPTION) {
            double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor de saque:"));
            conta.sacar(valorSaque);
        }

        // Exibir dados da conta atualizados após o saque
        JOptionPane.showMessageDialog(null, conta.getInfo(), "Dados da Conta Atualizado", JOptionPane.INFORMATION_MESSAGE);
    }

}


