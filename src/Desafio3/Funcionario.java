package Desafio3;

public class Funcionario {

        private String nome;
        double salarioBruto;
        private double taxa;

        public Funcionario(String nome, double salarioBruto, double taxa) {
            this.nome = nome;
            this.salarioBruto = salarioBruto;
            this.taxa = taxa;
        }

        public double getSalarioBruto() {
            return salarioBruto;
        }

        public double getTaxa() {
            return taxa;
        }

        public String getNome() {
            return nome;
        }
    }

