package clientes;

import javax.swing.JOptionPane;

import maladireta.MalaDireta;
import maladireta.MalaDiretaXML;

public class RelacionamentoClienteB {

	// Cliente que envia em XML.
	public static void main(String[] args) {
		MalaDireta malaDireta = new MalaDiretaXML("contatos.xml");
		String mensagem = JOptionPane.showInputDialog("Mensagem");

		boolean status = malaDireta.enviarEmail(mensagem);

		JOptionPane.showConfirmDialog(null, "E-mails enviados! > " + status);
	}

}
