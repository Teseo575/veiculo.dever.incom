package ElMundoacademico;

public class ArticuloCientifico extends Publicacion{

	
		private int cantCientificos;

		public ArticuloCientifico(String nombre, int fecha, String digital, int canPaginas, int cantCientificos) {
			super(nombre, fecha, digital, canPaginas);
			this.cantCientificos = cantCientificos;
		}

		public int getCantCientificos() {
			return cantCientificos;
		}

		public void setCantCientificos(int cantCientificos) {
			this.cantCientificos = cantCientificos;
		}
	    

	

}
