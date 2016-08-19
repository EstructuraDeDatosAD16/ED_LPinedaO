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
public class BusquedasSecuenciales extends Busquedas{

    @Override
    protected String buscar(int x) {
        boolean flag=true;
        for (int i=0; i<this.vector.length; i++){
            if (this.vector[i]==x){
                flag=false;
                return ("El número " + x + " se encuentra en la posicion " + i + " en el ciclo numero " + (i+1));
            }
        }
        if (flag){ return "No se encontro el numero";}
        return "";
    }
    
}
