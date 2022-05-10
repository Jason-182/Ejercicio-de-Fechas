
	import java.util.Date;
	public class EjercicioFechas{
	public static void main(String[]ar){
	int indice=0;
	DatoFecha[]fechas=new DatoFecha[100];
	java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("dd/MM/yyyy");
	String masVieja="01/01/01";
	Date fechaMasVieja=null;
	Date fechaMasNueva=new Date();
	boolean sigue=true;
	java.io.Console consola=System.console();
	while(sigue){
	System.out.println("Introduzca el nombre del evento:");
	String cadenaEvento=consola.readLine();
	System.out.println("Introduzca una fecha:");
	String cadena=consola.readLine();
	Date fecha=null;
	try{
	fecha=sdf.parse(cadena);
	}catch(Exception e){
	sigue=false;
	continue;
	}
	DatoFecha obj=new DatoFecha(fecha, cadenaEvento);
	fechas[indice]=obj;
	indice++;
	}
	fechaMasVieja=fechas[0].getFecha();
	fechaMasNueva=fechas[0].getFecha();
	System.out.println("se han metido "+indice+" datos");
	for(int i=0; i<indice;i++){
	Date tmpFecha=fechas[i].getFecha();
	//busco la fecha mas antigua
	if(tmpFecha.before(fechaMasVieja)){
	fechaMasVieja=tmpFecha;
	}
	//busco la fecha mas moderna
	if(tmpFecha.after(fechaMasNueva)){
	fechaMasNueva=tmpFecha;
	}
	//
	String iEvento=fechas[i].getEvento();
	Date iFecha=fechas[i].getFecha();
	System.out.println(iEvento+">>>>>>"+sdf.format(iFecha));
	}
	System.out.println("new="+sdf.format(fechaMasNueva));
	System.out.println("old="+sdf.format(fechaMasVieja));

	}

	}