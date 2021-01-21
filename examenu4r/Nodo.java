
package examenu4r;

public class Nodo {

	public Nodo izquierda;
	public Nodo derecha;
	public int elemento; 
	public int nivel;
				 
	public Nodo(int elemento) {
		this.elemento = elemento;
		this.izquierda = null;
		this.derecha = null;
		this.nivel = 0;
	}

}
