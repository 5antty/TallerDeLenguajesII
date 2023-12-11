package ejercicio4;

import java.lang.reflect.Array;

public class TestHashSetCuentaAgregados {
    public static void main(String[] args) {
        HashSetCuentaAgregados<Integer> map = new HashSetCuentaAgregados<>();
        // Array nums; NO HACER, peras con peras y manzanas con manzanas
        map.addAll(map);
    }
}
