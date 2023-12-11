package ejercicio1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DiccionarioDeSinonimos {

    private Map<String, List<String>> diccionario = new HashMap<String, List<String>>();

    public DiccionarioDeSinonimos() {

        List<String> list = new LinkedList<String>();
        list.add("asiento");
        list.add("butaca");
        list.add("silla");
        diccionario.put("Sillon", list);
        List<String> list2 = new LinkedList<String>();
        list2.add("edificacion");
        list2.add("inmueble");
        list2.add("hogar");
        list2.add("obra");
        diccionario.put("Casa", list2);
        List<String> list3 = new LinkedList<String>();
        list3.add("ejemplar");
        list3.add("manual");
        list3.add("tecto");
        list3.add("obra");
        diccionario.put("Libro", list3);
        List<String> list4 = new LinkedList<String>();
        list4.add("equipo");
        list4.add("ordenador");
        list4.add("pc");
        diccionario.put("Computador", list4);
    }

    public void getSinonimos(String p) {
        System.out.println(diccionario.get(p));
    }

    public void imprimirClaves() {
        System.out.println(diccionario.keySet());
    }
}
