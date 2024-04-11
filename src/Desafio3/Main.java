package Desafio3;

import javax.swing.*;

public class Main {

        public static void main(String[] args) {
            // Criando objetos Funcionario
            Funcionario funcionario1 = new Funcionario("João", 3000, 0.1);
            Funcionario funcionario2 = new Funcionario("Maria", 3500, 0.15);

            // Exibindo detalhes dos funcionários antes do aumento
            JOptionPane.showMessageDialog(null, "Detalhes dos Funcionários antes do aumento:\n\n" +
                    "Funcionário 1:\nNome: " + funcionario1.getNome() + "\nSalário Bruto: R$" + funcionario1.getSalarioBruto() +
                    "\n\nFuncionário 2:\nNome: " + funcionario2.getNome() + "\nSalário Bruto: R$" + funcionario2.getSalarioBruto());

            // Aplicando aumento salarial de 10% para um dos funcionários
            FuncionarioService service1 = new FuncionarioService(funcionario1);
            service1.aumentoSalario(10);

            // Exibindo detalhes dos funcionários após o aumento
            JOptionPane.showMessageDialog(null, "Detalhes dos Funcionários após o aumento:\n\n" +
                    "Funcionário 1:\nNome: " + funcionario1.getNome() + "\nSalário Bruto: R$" + funcionario1.getSalarioBruto() +
                    "\nSalário Líquido: R$" + service1.obterSalarioLiquido() +
                    "\n\nFuncionário 2:\nNome: " + funcionario2.getNome() + "\nSalário Bruto: R$" + funcionario2.getSalarioBruto() +
                    "\nSalário Líquido: R$" + new FuncionarioService(funcionario2).obterSalarioLiquido());

            // Calculando e exibindo os salários líquidos dos funcionários
            JOptionPane.showMessageDialog(null, "Salários líquidos dos Funcionários:\n\n" +
                    "Salário líquido de " + funcionario1.getNome() + ": R$" + service1.obterSalarioLiquido() +
                    "\nSalário líquido de " + funcionario2.getNome() + ": R$" + new FuncionarioService(funcionario2).obterSalarioLiquido());
        }

    }

