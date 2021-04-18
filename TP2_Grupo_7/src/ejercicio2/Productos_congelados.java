package ejercicio2;

public class Productos_congelados extends Producto {
	//atri
private int Temp;

//get y set

public int getTemp() {
	return Temp;
}

public void setTemp(int temp) {
	Temp = temp;
}

//constructor

public Productos_congelados() {
	super();
	this.Temp=999999;
}

public Productos_congelados(int num_lote,String fecha_caducidad,int temp) {
	super(fecha_caducidad, num_lote);
	this.Temp=temp;
}

@Override
public String toString() {
	return "Numero de lote: "+super.getNum_lote() +", "+"Fecha de caducidad: "+super.getFecha_caducidad()+", "+"°C: " + Temp;
}



}
