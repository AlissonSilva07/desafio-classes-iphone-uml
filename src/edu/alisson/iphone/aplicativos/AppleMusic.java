package edu.alisson.iphone.aplicativos;

import edu.alisson.iphone.funcoes.ReprodutorMusical;

public class AppleMusic implements ReprodutorMusical {

	private String idMusica;

	private String idMusicaAtual;

	private String idMusicaAnterior;

	private String idMusicaProxima;

	private int volumeAtual;

	public void selecionarMusica(String idMusica) {
		System.out.println("Você selecionou a música " + idMusica);
	};

	protected void girarTela() {
		System.out.println("Tela virada.");
	};

	@Override
	public void tocar() {
		System.out.println("Você está reproduzindo uma música agora.");
	}

	@Override
	public void pausar() {
		System.out.println("A musica parou.");
	}

	@Override
	public void volumeUp() {
		this.volumeAtual ++;
		System.out.println("O volume foi aumentado para " + volumeAtual);
	}

	@Override
	public void volumeDown() {
		this.volumeAtual --;
		System.out.println("O volume foi diminuido para " + volumeAtual);
	}

}
