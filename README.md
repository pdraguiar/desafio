# Desafio

Rest API que gerencia gastos com despesas no Recife em 2017.

# Pré-Requisitos

  - JDK 8

# Configuração

  - Após descompactar (ou clonar) o projeto dentro do seu worspace, será necessário executar o primeiro build do projeto, para que sejam baixadas as dependências, faça isso executando o seguinte comando na raiz do projeto:
  
     ```sh
     $ mvn clean package
     ```
     
     Caso utilize o build do eclipse, configure o mesmo para executar o comando:
     ```sh
     $ clean package
     ```

# Principais Arquivos

- Os pontos de entrada da aplicação, são os controllers, localizados dentro do pacote org.desafio.controllers.
- Existem 2 controllers na aplicação, o principal é o DespesasController.java, que é o que trata todo o CRUD relacionado às despesas em si. 
- O segundo controller (DominiosController.java) foi utilizado para facilitar o preenchimento dos combo-boxes do frontend, já que ele é utilizado para buscar os valores existentes nas tabelas que fazem parte do cadastro da despesa. Exemplo: para cadastrar uma despesa, tenho que escolher um órgão. Como a tabela de órgãos tem muitos registros, não fazia sentido utilizar valores mocados no front-end, para isso, utilizo o DominosController para me retornar todas as opções de órgãos.

# Fluxo Padrão do Serviço

- Toda chamada ao serviço, segue um padrão de chamadas entre as camadas, que é o seguinte:

Controller -> Facade -> Service (IService) -> Repository

Controller: ponto de entrada das requisições
Facade: Ponto de entrada único para a camada de negócio
IService: Interface com os métodos da cama de serviço.
Service: Implementação de regra de negócio
Repository: Acesso ao BD através de ORM


# Executando a aplicação

- Para subir o serviço, basta buscar a classe Boot.java (dentro do pacote org.desafio) , clicar com o botão direito, opção Run As > Java Application.
- O Spring Boot irá subir automaticamente a aplicação para a versão do Tomcat que já embutida nele.

# Operações disponíveis
1)  GET http://localhost:8080/despesas?pagina=0&porPagina=10 (lista todas as despesas, de acordo com a paginação)
2)  GET http://localhost:8080/despesas/1 (busca uma despesa específica)
3)  POST http://localhost:8080/despesas (cria uma despesa)
4)  PUT http://localhost:8080/despesas/1 (atualiza uma despesa)
5)  GET http://localhost:8080/despesas/mensais (lista os gastos com as despesas, agrupadas por mês)
6)  GET http://localhost:8080/despesas/categoria (lista os gastos com as despesas, agrupadas por categoria econômica)
7)  GET http://localhost:8080/despesas/fonteRecurso (lista os gastos com as despesas, agrupadas por fonte do recurso)

- A estrutura esperada para as operações de criar/atualizar despesa, segue o json abaixo (na criação, deve-se emitir o atributo codigoDespesa):

```json
{
   "codigoDespesa": 94178,
   "ano": 2017,
   "mes": 1,
   "valorEmpenhado": 2000,
   "valorLiquidado": 2000,
   "valorPago": 2000,
   "unidade": {
      "codigoUnidade": "10.01"
   },
   "categoriaEconomica": {
      "codigoCategoriaEconomica": 3
   },
   "grupoDespesa": {
      "codigoGrupoDespesa": 3
   },
   "fonteRecurso": {
      "codigoFonteRecurso": 100
   },
   "modalidadeAplicacao": {
      "codigoModalidadeAplicacao": 20
   },
   "modalidadeEmpenho": {
      "codigoModalidadeEmpenho": 1
   },
   "modalidadeLicitacao": {
      "codigoModalidadeLicitacao": 1
   },
   "credor": {
      "codigoCredor": 200006
   },
   "orgao": {
      "codigoOrgao": 1
   }
}
```



License
----

GPL
