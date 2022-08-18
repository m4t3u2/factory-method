package maladireta;

import java.util.List;

import contato.entities.Contato;
import contato.interfaces.IContatos;

public abstract class MalaDireta {

	protected abstract IContatos criarContatos();

	public boolean enviarEmail(String mensagem) {
		List<Contato> contatos = criarContatos().todos();

		System.out.println("Conectando no servidor SMTP...");
		System.out.println("Mensagem a ser enviada: " + mensagem);
		System.out.println();

		for (Contato contato : contatos) {
			System.out.println("From: <contato@algaworks.com>");
			System.out.printf("To: [%s] <%s>\n", contato.getNome(), contato.getEmail());
			System.out.println(mensagem);
			System.out.println();
		}

		return true;
	}
}
