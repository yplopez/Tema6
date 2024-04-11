package ejercicio5;

public class Lista {
	
	Poligono[] lista = new Poligono [10];
	
	int contador = 0;
	
	public void insertar(Poligono p) {
		this.lista[contador]= p;
		contador++;
	}
	
	public void imprimirLista () {
		for(Poligono p: lista) {
			if (p!= null) {
				System.out.println(p);
			}
		}
	}

}
