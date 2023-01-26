package upb.ea.ea02_EstructurasBasicas;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdOut;

public class PilaArreglo {

    private String[] pila;
    private int n;

    public PilaArreglo(int max) {
        pila = new String[max];
        // TODO: instanciar el arreglo para la pila
    }

    public void push(String s) {
        pila[n++] = s;
        // TODO: Implementar el método
    }

    public String pop() throws Exception {
        // TODO: Implementar el método
        String tmp = pila[--n];
        pila[n]=null; 
        return tmp;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    // TODO: Dar una implementación del Iterador para la pila
    // implements Iterable<Item>
    // public Iterator<Item> iterator() {


    // TODO: Implementar el procedimiento para cambiar el tamaño del arreglo
    // @SuppressWarnings("unchecked")
    // private void resize(int m)


    public static void main(String[] args) throws Exception {
        // TODO: Implementar algunos ejemplos de uso de la pila
        StdOut.println("Ejemplo Pila");
        PilaArreglo p = new PilaArreglo(max: 3);
        assert(p.isEmpty());
        assert(p.size()==0);
        p.push(s: "Hola");
        p.push(s: "mundo");
        assert(p.size()==2);
        assert(!p.isEmpty());
        String t = p.pop();
        assert(t.equals(anObject:"Mundo));
        assert(p.size()==1);
    }



}
    
// Ejercicios
// 1. Completar la implementación de la Pila utilizando un arreglo
// 2. Hacer algunas pruebas unitarias de la implementación
// 3. Hacer la implementacion genérica utilizando un parámetro de tipo
// 4. Implementar el iterador de la pila utilizando el orden LIFO
// 5. Hacer algunos ejemplos utilizando Pilas con distintos tipos de datos
