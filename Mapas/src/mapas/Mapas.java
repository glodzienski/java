package mapas;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.depositar(10000);

        Conta c2 = new Conta();
        c2.depositar(3000);

        // cria o mapa
        Map<String, Conta> mapaDeContas = new HashMap<>();
        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);
        // qual a conta do diretor? (sem casting!)
        Conta contaDoDiretor = mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());
    }

}
