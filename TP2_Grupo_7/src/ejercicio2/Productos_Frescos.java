package ejercicio2;

public class Productos_Frescos extends Producto {
	//Atri
	private String Fecha_envasado;
    private String P_origen;
    
  //set y get
	public String getFecha_envasado() {
		return Fecha_envasado;
	}
	public void setFecha_envasado(String fecha_envasado) {
		Fecha_envasado = fecha_envasado;
	}
	public String getP_origen() {
		return P_origen;
	}
	public void setP_origen(String p_origen) {
		P_origen = p_origen;
	}
    
   //constructor
	public Productos_Frescos(){
		super();
		this.Fecha_envasado="99/99/99";
		this.P_origen="Sin nombre";
	}
	
	
	public Productos_Frescos(int num_lote,String fecha_caducidad,String Fecha_envasado,String P_origen){
		super(fecha_caducidad,num_lote);
		this.Fecha_envasado=Fecha_envasado;
		this.P_origen=P_origen;
	}
	@Override
	public String toString() {
		return "Numero de lote:"+super.getNum_lote() +", "+"Fecha de caducidad: "+super.getFecha_caducidad()+", "+"Fecha de envasado :" + Fecha_envasado +", "+ " Pais de origen:" + P_origen ;
	}
	






}
