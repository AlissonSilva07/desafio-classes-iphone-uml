package edu.alisson.iphone.funcoes;

public interface AparelhoTelefonico {

	public void ligar(long numeroDestinatario);

	abstract void atender();

	abstract void iniciarCorreioVoz();

}
