package clientes;

import javax.swing.JOptionPane;

import maladireta.MalaDireta;
import maladireta.MalaDiretaCSV;

public class RelacionamentoClienteA {

	// Cliente que envia em CSV.
	public static void main(String[] args) {
		MalaDireta malaDireta = new MalaDiretaCSV("contatos.csv");
		String mensagem = JOptionPane.showInputDialog("Mensagem");

		boolean status = malaDireta.enviarEmail(mensagem);

		JOptionPane.showConfirmDialog(null, "E-mails enviados! > " + status);
	}

}
