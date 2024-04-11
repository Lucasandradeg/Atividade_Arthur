package Desafio3;

public class FuncionarioService {

        private Funcionario funcionario;

        public FuncionarioService(Funcionario funcionario) {
            this.funcionario = funcionario;
        }

        public double obterSalarioLiquido() {
            return funcionario.getSalarioBruto() * (1 - funcionario.getTaxa());
        }

        public void aumentoSalario(double percentage) {
            double aumento = funcionario.getSalarioBruto() * (percentage / 100);
            funcionario.salarioBruto += aumento;
        }

        @Override
        public String toString() {
            return "Funcionário: " + funcionario.getNome() +
                    "\nSalário bruto: R$" + funcionario.getSalarioBruto() +
                    "\nSalário líquido: R$" + obterSalarioLiquido();
        }
    }

