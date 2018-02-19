
public class Libro {

	private String libro;
	private String autor;
	private int numLibros;
	private int numLibPrest = 0;
	
	//Constructores
	public Libro() {
		this.libro = "";
		this.autor = "";
		this.numLibros = 0;
		this.numLibPrest = 0;
	}

	public Libro(String libro, String autor, int numLibros) {
		this.libro = libro;
		this.autor = autor;
		this.numLibros = numLibros;
	}

	//Métodos
	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumLibros() {
		return numLibros;
	}

	public void setNumLibros(int numLibros) {
		this.numLibros = numLibros;
	}

	public int getNumLibPrest() {
		return numLibPrest;
	}

	public void setNumLibPrest(int numLibPrest) {
		this.numLibPrest = numLibPrest;
	}
	
	public boolean prestamo() {
			if (numLibPrest < numLibros) {
				//numLibPrest =+ numLibPrest;
				numLibPrest++;
				return true;
			}	
			else 
				return false;
	}
	
	public boolean devolucion() {
		if (numLibPrest == 0) {
			return false;
		}
		else {
			numLibPrest--;
			return true;
		}
	}

	@Override
	public String toString() {
		return "El libro " + libro + " de " + autor + " con " + numLibros + " ejemplares de los cuales hay prestados " + numLibPrest + " ejemplares.";
	}
	
}
