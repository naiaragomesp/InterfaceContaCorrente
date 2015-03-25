package ExemploContaCorrente;

import javax.swing.JOptionPane;

public class Testador {

	public static void main(String[] args) {

		Correntista cor1 = new Correntista("Luke", "12345");
		ContaCorrente cc1 = new ContaCorrente(2345, cor1);

		Correntista cor2 = new Correntista("Mike", "12346");
		ContaCorrente cc2 = new ContaCorrente(2346, cor2);

		for (int i = 1; i > 0; i++) {
			int resposta = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a opção desejada : \n 1 - Depositar \n 2 - Sacar \n 3 - Transferir \n 4 - Sair"));

			if (resposta == 1) {
				int resp = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Digite a quantia desejada : "));
				cc1.depositar(resp);
				JOptionPane.showMessageDialog(null, "O seu saldo agora é: " + cc1.getSaldo());

			} else if (resposta == 2) {
				int resp = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Digite a quantia desejada : "));
				cc1.sacar(resp);
				JOptionPane.showMessageDialog(null, "O seu saldo agora é: "
						+ cc1.getSaldo());

			} else if (resposta == 3) {
				int contaDestino = Integer.parseInt(JOptionPane
						.showInputDialog("Digite a conta destino : "));
				if (contaDestino == 2) {
					int resp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantia desejada : "));
					cc1.transferir(cc2, resp);
					JOptionPane.showMessageDialog(null, "O seu saldo agora é: " + cc1.getSaldo());					
				}
				
			} else if (resposta == 4) {
				break;
			}
		}

		/*
		 * System.out.println(cc1.getSaldo());
		 * 
		 * cc1.transferir(cc2,510);
		 * 
		 * System.out.println(cc1.getCorrentista().getNome());
		 * System.out.println(cc1.getSaldo());
		 * System.out.println(cc2.getCorrentista().getNome());
		 * System.out.println(cc2.getSaldo());
		 */
	}
}
