package Desafio1_Exercicio1;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            String input = JOptionPane.showInputDialog(null, "Digite um numero: ");
            int numero = Integer.parseInt(input);

            if ( numero > 0){
                JOptionPane.showMessageDialog(null, " o numero e positivo");
            }
            else if ( numero < 0){
                JOptionPane.showMessageDialog(null,"O numero e negativo");
            }
            else{
                JOptionPane.showMessageDialog(null, "O numero e neutro");
            } sc.close();

        }
    }

