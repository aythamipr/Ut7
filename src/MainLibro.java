
public class MainLibro {

	public static void main(String[] args) {
		
		Libro L1 = new Libro("El Quijote de La Mancha", "Miguel de Cervantes" , 2);
		Libro L2 = new Libro("El Capitán Alatriste", "Arturo Pérez Reverte", 1);
		Libro L3 = new Libro("Como Fuego en el Hielo", "Luz Gabás", 1);
		
		//Préstamo1
		if(L1.prestamo("El Quijote de La Mancha"))
			System.out.println("El proceso de préstamo de " + L1.getLibro() + " se ha realizado correctamente");	
		else
			System.out.println(L1.getLibro() + " no se puede sacar, están todos sus ejemplares en préstamo");
				
		//Préstamo2
		if(L2.prestamo("El Capitán Alatriste"))
			System.out.println("El proceso de préstamo de " + L2.getLibro() + " se ha realizado correctamente");	
		else
			System.out.println(L2.getLibro() + " no se puede sacar, están todos sus ejemplares en préstamo");
		
		//Préstamo3
		if(L2.prestamo("El Capitán Alatriste"))
			System.out.println("El proceso de préstamo de " + L2.getLibro() + " se ha realizado correctamente");	
		else
			System.out.println(L2.getLibro() + " no se puede sacar, están todos sus ejemplares en préstamo");
		
		
		//Devolución1
		if(L2.devolucion("El Capitán Alatriste"))
			System.out.println("El proceso de devolución de " + L2.getLibro() + " se ha realizado correctamente");	
		else
			System.out.println(L2.getLibro() + " no se puede devolver porque no se ha prestado");
		
		//Devolución2
		if(L3.devolucion("Como Fuego en el Hielo"))
			System.out.println("El proceso de devolución de " + L3.getLibro() + " se ha realizado correctamente");	
		else
			System.out.println(L3.getLibro() + " no se puede devolver porque no se ha prestado");
		
		
		
		//Impresión libros
		System.out.println(L1.toString());
		System.out.println(L2.toString());
		System.out.println(L3.toString());
		
	}

}
