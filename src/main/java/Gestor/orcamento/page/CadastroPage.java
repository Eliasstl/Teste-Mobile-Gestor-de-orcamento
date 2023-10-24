package Gestor.orcamento.page;



public class CadastroPage extends Appium.Core.BasePage {

	public void CliqueInscreverSE() {
		cliqueXpath("//*[@content-desc='Inscrever-se']");

	}

	public void InserirEmail() {
		escreverXpath("//*[@class='android.widget.EditText']", "test@gmail.com");
		cliqueXpath("//*[@content-desc='Próximo']");

	}

	public void InserirSenha() {
		escreverXpath("//*[@class='android.widget.EditText']", "806066");
		cliqueXpath("//*[@content-desc='Próximo']");

	}

	public void ValidarEmailExiste() {

		textoXpath("//*[@content-desc='Este endereço de e-mail já está registrado']");
		boolean elementoExiste = ElementoExiste("//*[@content-desc='Este endereço de e-mail já está registrado']");

		if (elementoExiste) {
			System.out.println("Email cadastrado existe no banco.");

		} else {
			System.out.println("Teste falhou");

		}
	}

}
