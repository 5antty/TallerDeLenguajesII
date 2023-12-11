package ejercicio3;

import java.util.List;

public class SitioWeb {
    private String direc;
    private int contador;
    private String fechaCreacion;
    private List<Categorias> etiquetas;

    public String getDirec() {
        return direc;
    }

    public int getContador() {
        return contador;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public List<Categorias> getEtiquetas() {
        return etiquetas;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setEtiquetas(List<Categorias> etiquetas) {
        this.etiquetas = etiquetas;
    }

}
