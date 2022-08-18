package maladireta;

import contato.ContatosXML;
import contato.interfaces.IContatos;

public class MalaDiretaXML extends MalaDireta {

	private String nomeArquivo;

	public MalaDiretaXML(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	protected IContatos criarContatos() {
		return new ContatosXML(nomeArquivo);
	}

}
