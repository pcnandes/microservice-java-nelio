https://github.com/acenelio/ms-course

Primeiro execute o projeto hr-eureka-serve, pois ele é necessário para fornecer as portas que serão usadas pelos servicos

Descricao dos servicos
- Ribbon - balanceamento de carga
- eureka - distribui portas
- zuul - api gateway - resolve nomes dentro outras coisas
- Configuração centralizada


Configuração centralizada

Quando um microsserviço é levantado, antes de se registrar no Eureka, ele busca as configurações no repositório central de configurações.

Actuator - Permite aplicar configuracoes sem reiniciar o servidor


## Autorizacao Oauth 2
HTTP 401 - credenciais inválidas
HTTP 403 - não autorizado
