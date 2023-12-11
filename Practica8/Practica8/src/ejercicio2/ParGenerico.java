package ejercicio2;

public class ParGenerico<X, Y> {
    private X a;
    private Y b;

    public ParGenerico(X a, Y b) {
        this.a = a;
        this.b = b;
    }

    public void mostrar() {
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
