
Feature: Login no aplicativo de gestão de orçamento

  @login
  Scenario: Login bem-sucedido com email e senha válidos
    Given o usuário está na tela de login do aplicativo
    When o usuário clica no botão "Entrar"
    And o usuário insere o email "encartepronto@gmail.com"
    And o usuário clica no botão "Próximo"
    And o usuário insere a senha "806066"
    And o usuário clica no botão "Próximo"
    Then o usuário deve ser direcionado para a tela inicial do aplicativo de gestão de orçamento

  @email
  Scenario: Email inválido
    Given o usuário está na tela de login do aplicativo
    When o usuário clica no botão "Entrar"
    And o usuário insere um email inválido
    And o usuário clica no botão "Próximo"
    Then o aplicativo deve exibir a mensagem de erro "Dados de autenticação inválidos"

  @senha
  Scenario: Senha incorreta
    Given o usuário está na tela de login do aplicativo
    When o usuário clica no botão "Entrar"
    And o usuário insere o email "encartepronto@gmail.com"
    And o usuário clica no botão "Próximo"
    And o usuário insere uma senha incorreta
    And o usuário clica no botão "Próximo"
    Then o aplicativo deve exibir a mensagem de erro "Dados de autenticação inválidos"
