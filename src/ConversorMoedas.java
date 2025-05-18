import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoedas {

    public Valor ConverterMoedas(double base_value, String base_code, String target_code) {
        String apiKey = "Digite aqui sua api key de https://www.exchangerate-api.com/";
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + base_code + "/" + target_code + "/" + base_value);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Valor valor = new Gson().fromJson(response.body(), Valor.class);

            return new Valor(base_value, valor.conversion_result(), valor.base_code(), valor.target_code());

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível realizar a conversão de moedas. Verifique sua conexão e os códigos das moedas.");
        }
    }
}