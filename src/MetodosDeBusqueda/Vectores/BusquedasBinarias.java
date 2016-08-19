/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosDeBusqueda.Vectores;

/**
 *
 * @author luisa
 */
public class BusquedasBinarias extends Busquedas {

    @Override
    protected String buscar(int x) {
        int start=0;
        int end=this.vector.length-1;
        int center, contador=0;
        boolean flag=true;
        while (start<=end){ //ES IMPORTANTE EL IGUAL PARA EVALUAR LA ULTIMA OPCION
            ++contador;
            center=(start+end)/2;
            if (this.vector[center]==x){
                flag=false;
                return ("El numero " + x + " se encuentra en la posicion " + center + "en el ciclo numero " + contador);
            } else if (x>this.vector[center]){
                start=center+1;
            } else {
                end=center-1;
            }
        }
        if (flag){ return "No se encontro el numero, numero total de ciclos " + contador;}        
        return "";
    }
    
}
