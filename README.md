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
