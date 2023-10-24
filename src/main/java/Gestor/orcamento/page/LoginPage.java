package Gestor.orcamento.page;

import org.junit.Assert;

public class LoginPage extends Appium.Core.BasePage {

	public void EntrarApp() {
		cliqueId("Entrar");

	}

	public void InserirEmail() {
		escreverXpath("//*[@class='android.widget.EditText']", "testeeliasdatasales@gmail.com");
		String texto = textoXpath("//*[@class='android.widget.EditText']");
		Assert.assertEquals("testeeliasdatasales@gmail.com", texto);
		cliqueId("Próximo");
	}

	public void InserirEmailNaoAuten() {
		escreverXpath("//*[@class='android.widget.EditText']", "testeeliasdatasales@gmail.com");
		String texto = textoXpath("//*[@class='android.widget.EditText']");
		Assert.assertEquals("testeeliasdatasales@gmail.com", texto);
		cliqueId("Próximo");
	}

	public void InserirSenha() {
		escreverXpath("//*[@class='android.widget.EditText']", "806066");
		cliqueId("Próximo");
	}

	public void InserirSenhaErrada() {
		escreverXpath("//*[@class='android.widget.EditText']", "8060");
		cliqueId("Próximo");
	}

	public void ValidarLogin() {

		boolean elementoExiste = ElementoExiste(
				"//*[@content-desc='Seu e-mail não foi confirmado. Para confirmar, clique no link que foi enviado para o endereço de e-mail que você usou para se inscrever']");

		if (elementoExiste) {
			System.out.println("Acesso valido");

		} else {
			System.out.println("Teste falhou");

		}
	}

	public void ValidarSenhaErrada() {

		textoXpath("//*[@content-desc='Dados de autenticação inválidos']");
		boolean elementoExiste = ElementoExiste("//*[@content-desc='Dados de autenticação inválidos']");

		if (elementoExiste) {
			System.out.println("Email ou senha errado.");

		} else {
			System.out.println("Teste falhou");

		}
	}

}
