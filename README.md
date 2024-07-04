Descrição:

Este projeto consiste em criar um formulário para o envio de currículos, com a validação dos campos de entrada e armazenamento das informações em um banco de dados.

O formulário deve incluir os seguintes campos: 

Nome, E-mail, Telefone, Cargo Desejado (Campo Texto Livre), Escolaridade (Campo Select), Observações (Campo Opcional) e Arquivo (para envio do currículo).

Requisitos do Projeto:

O formulário deve ser criado com os seguintes campos obrigatórios: Nome, E-mail, Telefone, Cargo Desejado, Escolaridade e Arquivo. Há também um campo opcional: Observações. Os arquivos para o currículo devem ser aceitos apenas nos formatos .doc, .docx ou .pdf, com um tamanho máximo de 1MB. Os dados do formulário devem ser armazenados em um banco de dados. Além das informações dos campos, deve-se registrar o IP e a data e hora do envio. Um e-mail deve ser enviado com os dados do formulário, incluindo o arquivo do currículo.

Dependências:

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

Como Rodar o Programa:

Após baixar os arquivos e colocá-los nas suas respectivas pastas, abra o NetBeans. Adicione as dependências mencionadas anteriormente no seu projeto Maven. Configure seu Gmail e Token de acesso no pacote CapturaeEnviodeEmail para que o envio de e-mails funcione corretamente. Em seguida, abra o pacote com o nome Interface e execute. Uma interface será aberta onde você preencherá todos os seus dados e enviará o formulário. Após o envio, todos os seus dados serão direcionados para o banco de dados e também enviados para o seu e-mail configurado no pacote CapturaeEnviodeEmail. Você deve exportar o arquivo do MySQL para obter acesso à tabela Curriculos e garantir que tudo funcione perfeitamente. O arquivo do banco de dados se encontra no e-mail junto com o link do repositório.
 
  Informações para Contato
  E-mail: erickrn010@gmail.com
  Telefone: 84987521106
