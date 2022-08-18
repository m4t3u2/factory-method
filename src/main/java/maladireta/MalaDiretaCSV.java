package maladireta;

import contato.ContatosCSV;
import contato.interfaces.IContatos;

public class MalaDiretaCSV extends MalaDireta {

	private String nomeArquivo;

	public MalaDiretaCSV(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	protected IContatos criarContatos() {
		return new ContatosCSV(nomeArquivo);
	}

}
