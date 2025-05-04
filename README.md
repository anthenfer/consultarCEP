# Consulta de CEP em Java

Este projeto em Java permite ao usuário digitar um número de CEP e obter as informações de endereço correspondentes. Os dados retornados são salvos automaticamente em um arquivo `.json`.

## 📌 Funcionalidades

- Consulta de endereço a partir de um número de CEP.
- Exibição dos dados no terminal.
- Geração de arquivo `.json` com os dados do endereço.

## 🧪 Tecnologias Utilizadas

- Java 17+
- Biblioteca [Gson](https://github.com/google/gson) para serialização JSON
- API de consulta de CEP (como ViaCEP ou similar — *você pode ajustar conforme a API usada*)

## 📁 Estrutura do Projeto

📦 src/

┣ 📜 Principal.java # Classe principal com entrada do usuário
┣ 📜 Endereco.java # Classe record para armazenar os dados do endereço
┣ 📜 ConsultaCEP.java # Classe responsável por consultar o CEP via API
┗ 📜 GeradorDeArquivo.java # Classe para salvar os dados no formato JSON

## ▶️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/consulta-cep-java.git
   cd consulta-cep-java
2. Certifique-se de ter o Java instalado:
java -version

3. Compile o projeto (em um ambiente com Maven, Gradle ou diretamente via terminal):
javac -cp .:gson-2.10.1.jar src/*.java

4. Execute o programa:
java -cp .:gson-2.10.1.jar src.Principal

5. Digite o número de CEP solicitado e aguarde o resultado. 
Um arquivo .json será salvo com os dados do endereço.

⚠️ Tratamento de Erros

Caso o CEP informado seja inválido ou a API não responda, a aplicação exibirá uma mensagem de erro e será finalizada com segurança.

📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.