package B2E3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Edificio {
    // ATRIBUTOS
    private String id; // identificador del edificio
    private int[] rango; //[pInferior>-2, pSuperior<6]
    private HashMap<Integer, Planta> plantas; // plantas que posee el edificio
    private float presupuesto; // suma del presupuesto de todas las plantas del edificio


    // CONSTRUCTORES
    public Edificio(String id, int[] rango, ArrayList<Planta> plantas) {
        if (id != null) {
            this.id = id;
        }
        if (rango != null) {
            if ((rango[0] > -2) && (rango[1] > 6)) {
                this.rango = rango;
            }
        }
        if (plantas != null) {
            /*** CORREGIR ***/
            //this.plantas = plantas;
        }
    }

    public Edificio(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    // GETTERS
    public String getId() {
        return id;
    }

    public int[] getRango() {
        return rango;
    }

    public HashMap<Integer, Planta> getPlantas() {
        return plantas;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    // SETTERS
    public void setRango(int[] rango) {
        if ((rango[0] > -2) && (rango[1] > 6)) {
            this.rango = rango;
        }
    }

    // METODOS FUNCIONALES

    // dar de alta una planta, teniendo
    //en cuenta las restricciones indicadas en los constructores.
    public boolean darAltaPlanta(Planta planta) {
        return false;
    }

    // devuelve los número de las plantas que aún no han sido
    //dadas de alta en el edificio.
    public int[] plantasNoAlta() {
        return null;
    }

    // obtiene las plantas que tienen un presupuesto mayor.
    public Set<Planta> plantasMasCaras() {
        return null;
    }

    // devuelve el conjunto de estancias que tiene un mayor número de problemas en cada planta, donde la clave será
    //el número de planta y los valores serán las estancias que cumplen con esa condición.
    public HashMap<String, Estancia> plantasMasProblemas() {
        return null;
    }

    @Override
    public String toString() {
        String respuesta = null;
        if (id != null) {
            respuesta = "id: " + getId() + "\n";
        }
        if (plantas != null) {
            respuesta += "plantas: ";
            respuesta += "[";
            int i = 0;
            for (Integer num : plantas.keySet()) {
                Planta planta = plantas.get(num);
                respuesta = respuesta + planta.getNumero();
                if (i != plantas.size() - 1) {
                    respuesta += ", ";
                }

                i++;
            }
            respuesta += "]" + "\n";

        }


        return respuesta;
    }


}
