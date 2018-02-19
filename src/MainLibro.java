
public class MainLibro {

	public static void main(String[] args) {
		
		Libro L1 = new Libro("El Quijote de La Mancha", "Miguel de Cervantes" , 2);
		Libro L2 = new Libro("El Capit�n Alatriste", "Arturo P�rez Reverte", 1);
		Libro L3 = new Libro("Como Fuego en el Hielo", "Luz Gab�s", 1);
		
		//Pr�stamo1
		if(L1.prestamo("El Quijote de La Mancha"))
			System.out.println("El proceso de pr�stamo de " + L1.getLibro() + " se ha realizado correctamente");	
		else
			System.out.println(L1.getLibro() + " no se puede sacar, est�n todos sus ejemplares en pr�stamo");
				
		//Pr�stamo2
		if(L2.prestamo("El Capit�n Alatriste"))
			System.out.println("El proceso de pr�stamo de " + L2.getLibro() + " se ha realizado correctamente");	
		else
			System.out.println(L2.getLibro() + " no se puede sacar, est�n todos sus ejemplares en pr�stamo");
		
		//Pr�stamo3
		if(L2.prestamo("El Capit�n Alatriste"))
			System.out.println("El proceso de pr�stamo de " + L2.getLibro() + " se ha realizado correctamente");	
		else
			System.out.println(L2.getLibro() + " no se puede sacar, est�n todos sus ejemplares en pr�stamo");
		
		
		//Devoluci�n1
		if(L2.devolucion("El Capit�n Alatriste"))
			System.out.println("El proceso de devoluci�n de " + L2.getLibro() + " se ha realizado correctamente");	
		else
			System.out.println(L2.getLibro() + " no se puede devolver porque no se ha prestado");
		
		//Devoluci�n2
		if(L3.devolucion("Como Fuego en el Hielo"))
			System.out.println("El proceso de devoluci�n de " + L3.getLibro() + " se ha realizado correctamente");	
		else
			System.out.println(L3.getLibro() + " no se puede devolver porque no se ha prestado");
		
		
		
		//Impresi�n libros
		System.out.println(L1.toString());
		System.out.println(L2.toString());
		System.out.println(L3.toString());
		
	}

}
