package ejercicio2;

public class Producto {
//Atri
	private String Fecha_caducidad;
	private int Num_lote;
	
	//get y set
	public String getFecha_caducidad() {
		return Fecha_caducidad;
	}
	public void setFecha_caducidad(String fecha_caducidad) {
		Fecha_caducidad = fecha_caducidad;
	}
	public int getNum_lote() {
		return Num_lote;
	}
	public void setNum_lote(int num_lote) {
		Num_lote = num_lote;
	}
	//constructor
	public Producto() {
		this.Fecha_caducidad="99/99/99";
		this.Num_lote=999999;
	}
	public Producto(String fecha_caducidad, int num_lote) {
		this.Fecha_caducidad = fecha_caducidad;
		this.Num_lote = num_lote;
	}
	 
	@Override
	public String toString() {
		return "Fecha_caducidad=" + Fecha_caducidad + ", Numero de lote=" + Num_lote + "";
	}
	
	
}
