Descrição
Este projeto consiste em criar um formulário para o envio de currículos, com a validação dos campos de entrada e armazenamento das informações em um banco de dados. O formulário deve possuir os seguintes campos:

Nome
E-mail
Telefone
Cargo Desejado (Campo Texto Livre)
Escolaridade (Campo Select)
Observações (Campo Opcional)
Arquivo (para envio do currículo)

Requisitos do Projeto

Criação do Formulário
Campos obrigatórios: Nome, E-mail, Telefone, Cargo Desejado, Escolaridade, Arquivo.
Campo opcional: Observações.
Validação dos Campos

Apenas o campo Observações é opcional.
Aceitação de arquivos para o currículo apenas nos formatos: .doc, .docx ou .pdf.
Tamanho máximo do arquivo: 1MB.
Armazenamento dos Dados

Os dados do formulário devem ser armazenados em um banco de dados.
Além das informações dos campos, registrar o IP e a data e hora do envio.
Envio de E-mail

Um e-mail deve ser enviado com os dados do formulário, incluindo o arquivo do currículo.
Dependências

Para este projeto foi utilizado o Maven para gerenciar as dependências. As seguintes bibliotecas foram utilizadas:

Banco de dados (MySQL)
Para conexão com o banco de dados foi utilizado o mysql-connector-j:

<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.0.33</version>
</dependency>


Bibliotecas para envio de e-mails
Foram utilizadas as seguintes bibliotecas: commons-email e javax.mail.

<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-email</artifactId>
    <version>1.6.0</version>
    <type>jar</type>
</dependency>

<dependency>
    <groupId>javax.mail</groupId>
    <artifactId>mail</artifactId>
    <version>1.5.0-b01</version>
</dependency>

Como Rodar o Programa
 1 - Após baixar os arquivos e colocá-los nas suas respectivas pastas, abra o NetBeans.
 2 - Adicione as dependências mencionadas acima.
 3 - Configure seu Gmail e Token de acesso para o envio de e-mails funcionar corretamente.
 4 - Abra o pacote com o nome Interfaces.
 5 - Uma interface será aberta onde você preencherá todos os seus dados e enviará o formulário.
 6 - Após o envio, todos os seus dados serão direcionados para o banco de dados e também enviados para o seu e-mail configurado no pacote CapturaeEnviodeEmail.
 7 - Voce deve exporta o arquivo do MySQL para obter acesso a tabela (Curriculos) e tudo funcionar perfeitamente."arquivo do banco de dados se encontra no email junto com link do repositorio".
 
  Informações para Contato
  E-mail: erickrn010@gmail.com
  Telefone: 84987521106
