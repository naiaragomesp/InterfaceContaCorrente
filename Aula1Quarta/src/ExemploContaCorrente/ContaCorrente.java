package ExemploContaCorrente;

import javax.swing.JOptionPane;

public class ContaCorrente {

	private int numero;
	private double saldo;
	private Correntista correntista;

	public ContaCorrente(int nro, Correntista correntista) {
		numero = nro;
		this.correntista = correntista;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void sacar(double valor) {
		if (maiorQueZero(valor) && existeSaldoSuficiente(valor))
			saldo = saldo - valor;
		else
			JOptionPane.showMessageDialog(null, "Seu burro");
	}

	public void depositar(double valor){
		if (maiorQueZero(valor))
			saldo = saldo + valor;
		else
			JOptionPane.showMessageDialog(null, "Seu pobre");
	}
	
	private boolean maiorQueZero(double valor) {
		if (valor > 0)
			return true;
		else
			return false;
	}

	private boolean existeSaldoSuficiente(double valor) {
		if (saldo >= valor)
			return true;
		else
			return false;
	}
	
	public void transferir(ContaCorrente destino, double valor) {
		if (maiorQueZero(valor) && existeSaldoSuficiente(valor)) {
			sacar(valor);
			destino.saldo = destino.saldo + valor;
		} else {
			JOptionPane.showMessageDialog(null, "Seu pobre");
		}

	}

}
