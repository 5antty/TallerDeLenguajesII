package practica3;

public abstract class MagnitudFisica {
	private String magnitud;
	private double cifra;
	private String unidad;
	
	
	public String getMagnitud() {
		return this.magnitud;
	}
	public void setMagnitud(String magnitud) {
		this.magnitud = magnitud;
	}
	public double getCifra() {
		return cifra;
	}
	public void setCifra(double cifra) {
		this.cifra = cifra;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	
}
