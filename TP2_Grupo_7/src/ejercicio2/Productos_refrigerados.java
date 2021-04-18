package ejercicio2;

public class Productos_refrigerados extends Producto {
	
private String c_organimo;

public String getC_organimo() {
	return c_organimo;
}

public void setC_organimo(String c_organimo) {
	this.c_organimo = c_organimo;
}

public Productos_refrigerados() {
	super();
	this.c_organimo="9999999";
}
public Productos_refrigerados(int num_lote,String fecha_caducidad,String c_organimos) {
	super(fecha_caducidad,num_lote);
	this.c_organimo=c_organimos;
}

@Override
public String toString() {
	return "Numero de lote: "+super.getNum_lote() +", "+"Fecha de caducidad: "+super.getFecha_caducidad()+", "+"Código del organismo de supervisión alimentaria=" + c_organimo ;
}

}
