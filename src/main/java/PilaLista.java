import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PilaLista {

    public static void imprimir(String data){
        System.out.println(data);
    }

    public static String lea(String txt){
        String data = "";
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        try{
            imprimir(txt);
            data=teclado.readLine();
        }catch (IOException error){
            System.out.println("Se cometio el error "+error);
        }
        return data;
    }

    public static void impLista(Estudiante cabezaData){
        //  protejo a cabeza en otra variable
        Estudiante nodoSiguiente = cabezaData;
        if (cabezaData == null){
            imprimir("Lista vacia");
        }else {
        while(nodoSiguiente != null){
            imprimir("Nombre: "+nodoSiguiente.getNombre()+" Edad: "+ cabezaData.getEdad()+ " Nota: "+cabezaData.getNota());
            nodoSiguiente=nodoSiguiente.nodo;
            }
        }
    }

    public static void main(String[] args) {
        imprimir("PROGRAMA PILA CON LISTA DINAMICA");
        Estudiante cabeza = null;
        impLista(cabeza);
        Estudiante obj1 = new Estudiante("Sebastian",29,5.0);
        obj1.nodo = null;
        cabeza = obj1;
        Estudiante obj2 = new Estudiante("Fernanda",23,5.0);
        obj2.nodo = obj1;
        cabeza = obj2;
        impLista(cabeza);
    }
}

