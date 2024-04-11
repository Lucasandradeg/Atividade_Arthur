package Desafio2;

import javax.swing.*;
import java.util.List;

public class Main {

        private static final int ADICIONAR = 1;
        private static final int VISUALIZAR = 2;
        private static final int REMOVER = 3;
        private static final int SAIR = 4;

        public static void main(String[] args) {
            ServicoTarefa servico = new ServicoTarefa();

            int opcao;
            do {
                String menu = "Escolha uma opção:\n" +
                        "1. Adicionar Tarefa\n" +
                        "2. Visualizar Tarefas\n" +
                        "3. Remover Tarefa\n" +
                        "4. Sair";

                try {
                    opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

                    switch (opcao) {
                        case ADICIONAR:
                            String nome = JOptionPane.showInputDialog("Digite o nome da tarefa:");
                            String descricao = JOptionPane.showInputDialog("Digite a descrição da tarefa:");
                            Tarefa novaTarefa = new Tarefa(nome, descricao);
                            servico.adicionarTarefa(novaTarefa);
                            break;
                        case VISUALIZAR:
                            String tarefas = "Tarefas:\n";
                            List<Tarefa> listaTarefas = (List<Tarefa>) servico.getListaTarefas();
                            for (Tarefa tarefa : listaTarefas) {
                                tarefas += tarefa + "\n";
                            }
                            JOptionPane.showMessageDialog(null, tarefas);
                            break;
                        case REMOVER:
                            String nomeTarefaRemover = JOptionPane.showInputDialog("Digite o nome da tarefa a ser removida:");
                            servico.removerTarefa(nomeTarefaRemover);
                            break;
                        case SAIR:
                            JOptionPane.showMessageDialog(null, "Saindo...");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida, por favor digite uma opção válida.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
                    opcao = 0; // Reinicia o loop para exibir o menu novamente
                }
            } while (opcao != SAIR);
        }
    }

