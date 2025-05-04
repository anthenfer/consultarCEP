import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCEP {
    public Endereco buscaEndereco(String cep) {
        URI enderecoAPI = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(enderecoAPI)
                .build();

        HttpClient client = HttpClient.newHttpClient();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            if (json.contains("\"erro\": true")) {
                throw new RuntimeException("CEP não encontrado.");
            }

            return new com.google.gson.Gson().fromJson(json, Endereco.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao buscar o CEP: " + e.getMessage());
        }
    }
}
