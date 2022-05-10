
import java.util.Date;
public class DatoFecha{

		private Date fecha;
		private String evento;
		public DatoFecha(Date fecha, String evento){
		this.evento=evento;
		this.fecha=fecha;
		}

		public String getEvento(){
		return this.evento;
		}
		public void setEvento(String evento){
		this.evento=evento;
		}


		 public void setFecha(Date fecha){
		this.fecha=fecha;
		}
		public Date getFecha(){
		return this.fecha;
		}

		}