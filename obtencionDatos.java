import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class obtencionDatos {
    static JsonObject obtenerCambio() {
        try {
            String dirApi = "https://v6.exchangerate-api.com/v6/5de22a6b5823cb04389d3b2b/latest/USD";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(dirApi))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject gson = JsonParser.parseString(response.body()).getAsJsonObject();

            if (gson.get("result").getAsString().equals("success")) {
                return gson.getAsJsonObject("conversion_rates");
            } else {
                System.out.println("Error al obtener las tasas de cambio.");
                return null;
            }

        } catch (Exception e) {
            System.out.println("Error al conectar con la API: " + e.getMessage());
            return null;
        }
    }

}
