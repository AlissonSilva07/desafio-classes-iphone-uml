package edu.alisson.iphone.aplicativos;

import edu.alisson.iphone.funcoes.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

	private long numeroRemetente;

	private long numeroDestinatario;

	private boolean mudo;

	public void mutarDesmutar(boolean mutarDesmutar) {
        this.mudo = mutarDesmutar;
	};

	@Override
	public void ligar(long numeroDestinatario) {
		System.out.println("Ligando para o número " + numeroDestinatario);
	}

	@Override
	public void atender() {
		System.out.println("Chamada em andamento.");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciado o correio de voz.");
	}

}
