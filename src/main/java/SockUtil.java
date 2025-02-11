import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockUtil {

    public static class SockResult {
        private List<String> sinPareja;
        private int unpairedCount;

        public SockResult(List<String> sinPareja, int unpairedCount) {
            this.sinPareja = sinPareja;
            this.unpairedCount = unpairedCount;
        }

        public List<String> getSinPareja() {
            return sinPareja;
        }

        public int getUnpairedCount() {
            return unpairedCount;
        }
    }

    public static SockResult socksWithOutPair(List<SockModel> modelSocks) {
        Map<String, Integer> contador = new HashMap<>();

        // Contamos los calcetines por color
        for (SockModel sockModel : modelSocks) {
            String color = sockModel.getColor();
            contador.put(color, contador.getOrDefault(color, 0) + 1);
        }

        // Listado de calcetines sin pareja
        List<String> sinPareja = new ArrayList<>();
        int unpairedCount = 0;

        // Identificar los colores con cantidades impares y contar los calcetines sin pareja
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                sinPareja.add(entry.getKey());
                unpairedCount++;
            }
        }

        // Devolver el resultado en un objeto SockResult
        return new SockResult(sinPareja, unpairedCount);
    }
}
