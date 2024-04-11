package Desafio1_Exercicio3;

import javax.swing.*;

public class Exercicio3 {


        public static void main(String[] args) {
            int numeroInicial = 0;

            String input = JOptionPane.showInputDialog(null, "Digite um numero");

            numeroInicial = Integer.parseInt(input);
            int contador = 0;
            int contadorDois = 0;

            String texto = "";


            for (int i = 0; i < numeroInicial; i++) {
                texto += "for" + i + "\n";


            }

            while(contador <= numeroInicial){
                texto += "do-while: " + contador + "\n";
                contador++;

            }

            do{
                texto += "do-while: " + contadorDois + "\n";
                contadorDois++;


            } while (contadorDois <= numeroInicial);
            JOptionPane.showMessageDialog(null, texto);
        }

    }










