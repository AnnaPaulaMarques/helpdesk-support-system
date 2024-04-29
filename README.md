# Helpdesk Support System 💻 🖥️

O Helpdesk Support System foi desenvolvido para simplificar o gerenciamento de suporte técnico em Informática. É uma aplicação construída utilizando JavaSpring, permitindo aos usuários solicitar atendimento técnico em questões relacionadas à informática. Os chamados são registrados, atribuídos a técnicos e seu status é atualizado ao longo do processo de atendimento. Após a resolução do problema, o chamado é encerrado automaticamente.

## Funcionalidades Principais

- **Criação de chamados**: Usuários podem criar novos chamados informando os detalhes do problema ou solicitação.
- **Atribuição de chamados**: Técnicos podem visualizar os chamados disponíveis para atendimento e atribuir a si mesmos para resolução.
- **Atualização de status dos chamados**: Técnicos podem atualizar o status dos chamados conforme necessário durante o atendimento.
- **Monitoramento do tempo de resposta do chamado**: A aplicação monitora o tempo de resposta de cada chamado para garantir um atendimento eficiente. Esta funcionalidade ainda está em desenvolvimento como uma melhoria futura.
- **Operações de CRUD para chamados**: As operações de adicionar, atualizar, buscar por ID, buscar todos e deletar chamados também estão disponíveis para usuários e técnicos.

## Pacotes e Funcionalidades

- **Pacote "controllers"**: Contém classes responsáveis por receber requisições HTTP e enviar respostas adequadas. Fornece endpoints para adicionar, atualizar, buscar e deletar chamados, acessíveis tanto para usuários quanto para técnicos.
- **Pacote "models"**: Define as classes que representam as entidades do sistema, como Chamado e Técnico.
- **Pacote "service"**: Contém classes que implementam a lógica de negócios do sistema, como adicionar, atualizar, buscar e deletar entidades.
- **Pacote "repositories"**: Define interfaces que estendem JpaRepository para interagir com o banco de dados MySQL usando JPA.

## Como Usar

1. **Instalação do Projeto**: Clone ou baixe o projeto do repositório.
2. **Configuração do Banco de Dados**: Configure as propriedades do banco de dados no arquivo `application.properties` para se conectar ao seu banco MySQL.
3. **Execução do Projeto**: Execute o projeto em sua IDE preferida (por exemplo, IntelliJ IDEA) ou usando o Maven.
4. **Teste das Funcionalidades**: Utilize uma ferramenta como o Postman para enviar requisições HTTP aos endpoints fornecidos pelas classes do pacote "controllers".

### Exemplos de Requisições

- **Adicionar um Chamado**: Envie uma requisição POST para `/chamados` com os dados do chamado no corpo da requisição.
- **Atualizar um Chamado**: Envie uma requisição POST para `/chamados/atualizar` com os dados atualizados do chamado no corpo da requisição.
- **Buscar um Chamado por ID**: Envie uma requisição GET para `/chamados/{id}` para buscar um chamado específico pelo seu ID.
- **Buscar Todos os Chamados**: Envie uma requisição GET para `/chamados/todos` para obter uma lista de todos os chamados.
- **Deletar um Chamado por ID**: Envie uma requisição DELETE para `/chamados/{id}` para deletar um chamado específico pelo seu ID.

## Tecnologias Utilizadas

- Java Spring Boot
- MySQL
- Spring Data JPA
- Maven

## Contribuição

Sinta-se à vontade para contribuir com melhorias para o projeto. Basta fazer um fork do repositório, implementar as mudanças desejadas e enviar um pull request.

🛠️ 🚀 💻 🖥️