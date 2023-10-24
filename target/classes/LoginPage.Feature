**Descrição**: Verificar se um usuário pode fazer login com um email e senha válidos no aplicativo de gestão de orçamento.

**Quando** o usuário está na tela de login do aplicativo
**E** o usuário clica no botão "Entrar"
**E** o usuário insere o email "encartepronto@gmail.com"
**E** o usuário clica no botão "Próximo"
**E** o usuário insere a senha "806066"
**E** o usuário clica no botão "Próximo"
**Então** o usuário deve ser direcionado para a tela inicial do aplicativo de gestão de orçamento.

## Cenário: Email inválido

**Descrição**: Verificar se o aplicativo exibe uma mensagem de erro ao inserir um email inválido no login.

**Quando** o usuário está na tela de login do aplicativo
**E** o usuário clica no botão "Entrar"
**E** o usuário insere um email inválido
**E** o usuário clica no botão "Próximo"
**Então** o aplicativo deve exibir a mensagem de erro "Dados de autenticação inválidos".

## Cenário: Senha incorreta

**Descrição**: Verificar se o aplicativo exibe uma mensagem de erro ao inserir uma senha incorreta no login.

**Quando** o usuário está na tela de login do aplicativo
**E** o usuário clica no botão "Entrar"
**E** o usuário insere o email "encartepronto@gmail.com"
**E** o usuário clica no botão "Próximo"
**E** o usuário insere uma senha incorreta
**E** o usuário clica no botão "Próximo"
**Então** o aplicativo deve exibir a mensagem de erro "Dados de autenticação inválidos".