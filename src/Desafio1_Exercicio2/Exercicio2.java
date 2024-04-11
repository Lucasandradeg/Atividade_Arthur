package Desafio1_Exercicio2;

import javax.swing.*;

public class Exercicio2 {

        public static void main(String[] args) {
            String input = JOptionPane.showInputDialog("Digite um número de 1 a 7: ");
            int numero = Integer.parseInt(input);

            String dia = determinarDia(numero);

            JOptionPane.showMessageDialog(null, "O dia correspondente é: " + dia);
        }

        public static String determinarDia(int numero){
            String dia;
            switch (numero){
                case 1:
                    dia = "Domingo";
                    break;
                case 2:
                    dia = "Segunda";
                    break;
                case 3:
                    dia = "Terça";
                    break;
                case 4:
                    dia = "Quarta";
                    break;
                case 5:
                    dia = "Quinta";
                    break;
                case 6:
                    dia = "Sexta";
                    break;
                case 7:
                    dia = "Sábado";
                default:
                    dia = "Dia inválido!";
            }
            return dia;
        }
    }

