# Conversor de Moedas

## 📝 Descrição

O Conversor de Moedas é uma aplicação Java desenvolvida para facilitar a conversão entre diferentes moedas internacionais. Atualmente, o sistema suporta a conversão entre:
- Dólar (USD) ↔️ Peso Argentino (ARS)
- Dólar (USD) ↔️ Real Brasileiro (BRL)
- Dólar (USD) ↔️ Peso Colombiano (COP)

A aplicação utiliza a [Exchange Rate API](https://www.exchangerate-api.com/) para obter taxas de câmbio atualizadas em tempo real.

## 🛠️ Tecnologias Utilizadas

- Java 17
- Gson (para processamento de JSON)
- HttpClient (para requisições à API)

## 📋 Pré-requisitos

- JDK 17 ou superior
- Conexão com a internet
- Uma chave de API do [Exchange Rate API](https://www.exchangerate-api.com/)

## ⚙️ Configuração

1. Clone este repositório:
   ```
   git clone https://github.com/Andrevictor20/Conversor-moedas.git
   ```

2. Navegue até o arquivo `ConversorMoedas.java` e substitua a string de API key:
   ```java
   String apiKey = "SUA_API_KEY_AQUI";
   ```

## 🚀 Como Executar
### Linux/Mac
1. Compile os arquivos Java:
   ```
   javac -cp "lib/*" src/*.java
   ```

2. Execute a aplicação:
   ```
   java -cp "src:lib/*" Main
   ```

### Windows

1. Compile os arquivos Java:
   ```
   javac -cp "lib/*" src\*.java
   ```

2. Execute a aplicação:
   ```
   java -cp "src;lib/*" Main
   ```

## 📊 Exemplos de Uso

### Conversão de Dólar para Real Brasileiro

1. Execute a aplicação
2. Selecione a opção 3 (Dólar --> Real brasileiro)
3. Digite o valor em dólar (exemplo: 100)
4. O resultado será exibido no formato:
   ```
   O valor convertido de 100.0 [USD] ==>> 498.52 [BRL]
   ```

### Conversão de Peso Colombiano para Dólar

1. Execute a aplicação
2. Selecione a opção 6 (Peso colombiano --> Dólar)
3. Digite o valor em peso colombiano (exemplo: 50000)
4. O resultado será exibido no formato:
   ```
   O valor convertido de 50000.0 [COP] ==>> 12.37 [USD]
   ```

## 🧩 Estrutura do Projeto

- `Main.java` - Ponto de entrada da aplicação, gerencia a interface do usuário
- `Menu.java` - Exibe o menu de opções para o usuário
- `ConversorMoedas.java` - Realiza a integração com a API de conversão de moedas
- `Valor.java` - Classe de registro (record) que armazena os dados da conversão

## 📡 API Utilizada

Este projeto utiliza a [Exchange Rate API](https://www.exchangerate-api.com/) para obter taxas de câmbio em tempo real. Para usar a aplicação, você precisa se registrar no site e obter sua própria chave de API gratuita.

## 🚨 Tratamento de Erros

A aplicação inclui tratamento básico de erros para:
- Opções inválidas do menu
- Falhas na conexão com a API
- Códigos de moeda inválidos

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests com melhorias.

