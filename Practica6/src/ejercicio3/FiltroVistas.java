package ejercicio3;

public class FiltroVistas implements Filtrator {
    @Override
    public boolean filtrar(SitioWeb s, Object o) {
        Integer num = 0;
        if (o.getClass() == num.getClass()) {
            num = (Integer) o;
        }
        boolean cond = false;
        if (s.getContador() > num) {
            cond = true;
        }
        return cond;
    }
}
