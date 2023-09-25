package edu.alisson.iphone.aplicativos;

import edu.alisson.iphone.funcoes.NavegadorInternet;

public class Safari implements NavegadorInternet {

	private String url;

	private int idAba;

	public void irPara(String url) {
		this.url = url;
		System.out.println("Abrindo o endereço " + url);
	}

	protected void guardarCookies() {
		System.out.println("Guardando cookies.");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo a página.");
	}

	@Override
	public void adicionarNovaAba(int idAba) {
		this.idAba = idAba;
		System.out.println("Abrindo aba " + idAba);
	}

	@Override
	public void atualizarPagina(boolean atualizar) {
		if (atualizar) { System.out.println("Página atualizada."); }
	}
}
