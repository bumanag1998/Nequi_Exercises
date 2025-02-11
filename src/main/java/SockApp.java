import java.util.ArrayList;
import java.util.List;

public class SockApp {

    public static void main(String[] args) {
        System.out.println("____Looking_For_Socks____");
        List<SockModel> socks = new ArrayList<>();
        socks.add(new SockModel("azul"));
        socks.add(new SockModel("rojo"));
        socks.add(new SockModel("azul"));
        socks.add(new SockModel("verde"));
        socks.add(new SockModel("rojo"));
        socks.add(new SockModel("azul"));
        socks.add(new SockModel("amarillo"));

        // Llamar a la función optimizada
        SockUtil.SockResult result = SockUtil.socksWithOutPair(socks);

        // Mostrar los resultados
        System.out.println("Colores sin pareja: " + result.getSinPareja());
        System.out.println("Cantidad de calcetines sin pareja: " + result.getUnpairedCount());

    }
}



