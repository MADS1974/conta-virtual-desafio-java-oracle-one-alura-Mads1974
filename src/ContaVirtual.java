import javax.swing.JOptionPane;

public class ContaVirtual {
    public static void main(String[] args) {
        String nome = "Márcio Adriano";
        var tipoConta = "Corrente";
        double saldo = 9599.99;
        int opcao = 0;

        String menu = """
                || Bem-vindo a sua conta Márcio! ||
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        while (opcao != 4) {
            String opcaoStr = JOptionPane.showInputDialog(null, menu, "Menu", JOptionPane.PLAIN_MESSAGE);
            opcao = Integer.parseInt(opcaoStr);

            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "O saldo atualizado é " + saldo, "Saldo", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    String valorTransferenciaStr = JOptionPane.showInputDialog(null, "Qual o valor que deseja transferir?", "Transferência", JOptionPane.QUESTION_MESSAGE);
                    double valorTransferencia = Double.parseDouble(valorTransferenciaStr);
                    if (valorTransferencia > saldo) {
                        JOptionPane.showMessageDialog(null, "Não há saldo suficiente para realizar a transferência.", "Erro", JOptionPane.ERROR_MESSAGE);
                    } else {
                        saldo -= valorTransferencia;
                        JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso. Novo saldo: " + saldo, "Transferência", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 3:
                    String valorRecebidoStr = JOptionPane.showInputDialog(null, "Valor recebido:", "Recebimento", JOptionPane.QUESTION_MESSAGE);
                    double valorRecebido = Double.parseDouble(valorRecebidoStr);
                    saldo += valorRecebido;
                    JOptionPane.showMessageDialog(null, "Valor recebido. Novo saldo: " + saldo, "Recebimento", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Obrigado por usar nossos serviços, saindo...", "Sair", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
