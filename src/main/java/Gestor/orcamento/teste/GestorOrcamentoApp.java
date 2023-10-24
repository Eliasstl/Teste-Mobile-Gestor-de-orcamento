package Gestor.orcamento.teste;

import java.net.MalformedURLException;

import org.junit.Test;


import Gestor.orcamento.page.CadastroPage;
import Gestor.orcamento.page.LoginPage;

public class GestorOrcamentoApp extends Appium.Core.BaseTestes {

	private LoginPage login = new LoginPage();
	private CadastroPage cadastro = new CadastroPage();

	@Test
	public void Login() throws MalformedURLException, InterruptedException {

		login.EntrarApp();
		login.InserirEmailNaoAuten();
		login.InserirSenha();
		login.ValidarLogin();

	}
	@Test
	public void LoginDadosInvalido() throws MalformedURLException, InterruptedException {

		login.EntrarApp();
		login.InserirEmail();
		login.InserirSenhaErrada();
		login.ValidarSenhaErrada();

	}

	@Test
	public void CadastarEmailExistente() throws MalformedURLException, InterruptedException {
		cadastro.CliqueInscreverSE();
		cadastro.InserirEmail();
		cadastro.InserirSenha();
		cadastro.InserirSenha();
		cadastro.ValidarEmailExiste();
		

	}

}
