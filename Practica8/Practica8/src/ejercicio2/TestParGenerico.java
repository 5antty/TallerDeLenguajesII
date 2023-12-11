package ejercicio2;

public class TestParGenerico {
    public static void main(String[] args) {
        ParGenerico<String, Integer> par;
        par = new ParGenerico<String, Integer>("Uno", 1);
        par.mostrar();
    }
}
