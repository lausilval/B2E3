package B2E3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
            int[] listaRango = new int[2];
            if(rango[0] >= -2)
            {
                listaRango[0] = rango[0];
            }
            if(rango[1] <= 6)
            {
                listaRango[1] = rango[1];
            }
            this.rango = listaRango;
        }
        if (plantas != null) {
            HashMap<Integer, Planta> plantaMap = new HashMap<>();
            for(Planta plant : plantas)
            {
                plantaMap.put(plant.getNumero(), plant);
            }
            this.plantas = plantaMap;
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
        if ((rango[0] >= -2) && (rango[1] <= 6)) {
            this.rango = rango;
        }
    }

    // METODOS FUNCIONALES

    // dar de alta una planta, teniendo
    //en cuenta las restricciones indicadas en los constructores.
    public boolean darAltaPlanta(Planta planta)
    {
        if(plantas == null)
        {
            HashMap<Integer, Planta> plantaMap = new HashMap<>();
            if((planta.getNumero() >= -2) && (planta.getNumero() <= 6))
            {
                plantaMap.put(planta.getNumero(), planta);
                this.plantas = plantaMap;
                return true;
            }
        }
        else {
            for(Integer numero : plantas.keySet())
            {
                Planta planta1 = plantas.get(numero);
                if(planta1.getNumero() == planta.getNumero())
                {
                    return false;
                }

            }
            if((planta.getNumero() >= -2) && (planta.getNumero() <= 6))
            {
                this.plantas.put(planta.getNumero(), planta);
                return true;
            }
        }
        return false;
    }

    // devuelve los número de las plantas que aún no han sido
    //dadas de alta en el edificio.
    public int[] plantasNoAlta() {

        ArrayList<Integer> respuesta = new ArrayList<>();
        ArrayList<Integer> rangoAux = new ArrayList<>();

        // tienes un rango y tienes que ver que nº de ese rango no esta ocupado
        if(rango != null)
        {
            for(int r=rango[0]; r <= rango[1] ; r++)
            {
                rangoAux.add(r);
            }
            ArrayList<Integer> aux = new ArrayList<>(plantas.keySet());
            for(int j=0; j < rangoAux.size(); j++)
            {
                if(!aux.contains(rangoAux.get(j)))
                {
                    respuesta.add(rangoAux.get(j));
                }
            }
            int[] respuesta2 = new int[respuesta.size()];
            for(int k=0; k < respuesta.size();k++)
            {
                respuesta2[k] = respuesta.get(k);
            }
            return respuesta2;
        }
        return null;

    }

    // obtiene las plantas que tienen un presupuesto mayor.
    public Set<Planta> plantasMasCaras() {
        Set <Planta> respuesta = new HashSet<>();
        float MaxPresupuesto = 0f;
        int cont= 0;
        for(Integer num: plantas.keySet())
        {
            Planta planta1 = plantas.get(num);
            if(cont == 0)
            {
                if(planta1.getPresupuesto() != 0f)
                {
                    MaxPresupuesto = planta1.getPresupuesto();
                    cont++;
                }
            }
            if(planta1.getPresupuesto() != 0f)
            {
                if(MaxPresupuesto < planta1.getPresupuesto())
                {
                    MaxPresupuesto = planta1.getPresupuesto();
                    respuesta.add(planta1);
                }
            }
        }
        return respuesta;
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
            respuesta = "id edificio: " + getId() + "\n";
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
