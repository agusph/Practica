package ejercicio2;

public class mainEjercicio2 {

	public static void main(String[] args) {
		
		System.out.println("Productos Congelados");
		
		Productos_congelados[] pc =new Productos_congelados[3];
 pc[0] = new Productos_congelados();
 pc[1] = new Productos_congelados(30215,"10/02/2021",5);
 pc[2] = new Productos_congelados(45951,"15/04/2021",3);
 
 for (Productos_congelados i : pc) {
	 System.out.println(i.toString());
	}	
 
 System.out.println("Productos Frescos");
 
 Productos_Frescos[] pf =new Productos_Frescos[3];
 pf[0] = new Productos_Frescos(56785,"10/03/2021","05/01/2018","Brasil");
 pf[1] = new Productos_Frescos();
 pf[2] = new Productos_Frescos(30254,"06/03/2021","01/02/2019","Argentina");
 
 for (Productos_Frescos i : pf) {
	 System.out.println(i.toString());
	}	
 
 System.out.println("Productos Refrigerados");
 
 Productos_refrigerados[] pr =new Productos_refrigerados[3];
 pr[0] = new Productos_refrigerados(13568,"29/12/2021","Q5456");
 pr[1] = new Productos_refrigerados(56482,"10/02/2021","L0354");
 pr[2] = new Productos_refrigerados();
 
 for (Productos_refrigerados i : pr) {
	 System.out.println(i.toString());
	}	
}
	}
