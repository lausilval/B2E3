package B2E3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Planta
{
    // ATRIBUTOS
    private int numero; // numero de la planta
    private String tipo; // tipo de planta
    private Edificio edificio; // edificio en el que se encuentra una planta
    private HashMap<String, Estancia> estancias; // conjunto de estancias de la planta
    private float presupuesto;  //la suma de los costes de los sensores + un 10%
    private HashMap<String, Sensor> sensoresConProblemas;   // conjunto de sensores que han tenido problemas y que fueron substituidos por otros
    //clave -> sensor que ha tenido problemas
    //dato ->  sensor por el cual se ha substituido


    // CONSTRUCTORES
    public Planta(int numero, String tipo, Edificio edificio, HashMap<String, Estancia> estancias)
    {
        this.numero = numero;
        if(tipo != null)
        {
            if(tipo.equals("oficinas") || tipo.equals("viviendas libres") || tipo.equals("viviendas de proteccion oficial") || tipo.equals("administracion"))
            {
                this.tipo = tipo;
            }
        }
        if(edificio != null)
        {
            this.edificio = edificio;
        }
        if(estancias != null)
        {
            this.estancias = estancias;
        }

    }
    public Planta(int numero, String tipo)
    {
        this.numero = numero;
        if(tipo != null)
        {
            if(tipo.equals("oficinas") || tipo.equals("viviendas libres") || tipo.equals("viviendas de proteccion oficial") || tipo.equals("administracion"))
            {
                this.tipo = tipo;
            }
        }
    }


    // GETTERS

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public HashMap<String, Estancia> getEstancias() {
        return estancias;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public HashMap<String, Sensor> getSensoresConProblemas() {
        return sensoresConProblemas;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    // SETTERS

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public void setTipo(String tipo) {
        if(tipo.equals("oficinas") || tipo.equals("viviendas libres") || tipo.equals("viviendas de proteccion oficial") || tipo.equals("administracion"))
        {
            this.tipo = tipo;
        }
    }

    public void setEstancias(HashMap<String, Estancia> estancias) {
        this.estancias = estancias;
    }


    // METODOS FUNCIONALES

    // dar de alta un conjunto de estancias estancias. Se deberá comprobar si el número de planta coincide
    //con el identificador la planta en la que se dará de alta. En caso de que no sea así, se devolverá
    //false.
    public boolean darAltaEstancia(ArrayList<Estancia> estancias)
    {
        if(estancias != null)
        {
            this.estancias = new HashMap<>();
            for(Estancia estan: estancias)
            {
                /*** NO SE ***/
                /*int numPlanta = (int) estan.getPlanta();
                if(estan.getPlanta() != (Planta) this.numero)
                {

                }*/
            }
        }
        return false;
    }


    // dar de alta una estancia. Se deberá comprobar si el número de planta coincide con el identificador la planta en
    //la que se dará de alta. En caso de que no sea así, se devolverá false.
    public boolean darAltaEstancia(Estancia estancia)
    {
        return false;
    }

    // dar de alta un sensor
    //en la estancia con identificador id. Hay que tener en cuenta que al dar de alta un sensor es necesario
    //actualizar el presupuesto de la planta
    public void darAltaSensor(String id, Sensor sensor)
    {
        return;
    }

    // dar de alta un conjunto de sensores en la estancia con identificador id. Hay que tener en cuenta que
    //al dar de alta un sensor es necesario actualizar el presupuesto.
    public void darAltaSensor(String id, ArrayList<Sensor> sensores)
    {
        return;
    }

    //dar de baja a un sensor
    //con identificador id y substituirlo por otro sensor sensor. Hay que tener en cuenta que es
    //necesario actualizar tanto el conjunto de sensores con problemas como presupuesto de la planta.
    public void darBajaSensor(String id, Sensor sensor)
    {
        return;
    }


    // devuelve el conjunto de sensores
    //de un determinado tipo que hay en la planta. Todas las iteraciones sobre los datos deben hacerse
    //usando un iterator sobre los valores.
    public Set<Sensor> sensoresTipo(String tipo)
    {
        return null;
    }

    // devuelve los tipos de
    //sensores que han tenido que ser substituidos con mayor frecuencia en la planta, es decir, los tipos
    //de sensores que son más defectuosos. Todas las iteraciones sobre los datos deben hacerse usando
    //un iterator sobre las claves.
    public Set<String> tipoSensoresMasDefectuosos()
    {
        return null;
    }

    @Override
    // donde se considera que dos plantas son
    //iguales si sus números son iguales y si el edificio en el que se encuentra es el mismo.
    public boolean equals(Object object)
    {
        if(this == object)
        {
            return true;
        }
        if (object == null)
        {
            return false;
        }
        if(getClass() != object.getClass())
        {
            return false;
        }
        final Planta other = (Planta) object;
        if(this.numero != other.numero)
        {
            return false;
        }
        if(!this.edificio.equals(other.edificio))
        {
            return false;
        }
        return true;
    }


    @Override
    public String toString()
    {
        String respuesta = null;

        respuesta = "numero: " + getNumero() + "\n";
        if(tipo != null)
        {
            respuesta += "tipo: " + getTipo() + "\n";
        }
        if(edificio != null)
        {
            respuesta += "edificio: " + getEdificio() + "\n";
        }
        if(estancias != null)
        {
            respuesta += "estancias: ";
            respuesta += "[";
            int i = 0;
            for (String estancia : estancias.keySet())
            {
                Estancia estancia1 = estancias.get(estancia);
                if (estancia1.getNombre() != null) {
                    respuesta = respuesta + estancia1.getNombre();
                    if (i != estancias.size() - 1) {
                        respuesta += ", ";
                    }
                }
                i++;
            }
            respuesta += "]" + "\n";
        }
        respuesta += "presupuesto: " + getPresupuesto() + "\n";
        if (sensoresConProblemas != null)
        {
            respuesta += "sensoresConProblemas: ";
            respuesta += "[";
            int i = 0;
            for (String sensor : sensoresConProblemas.keySet())
            {
                Sensor sensor1 = sensoresConProblemas.get(sensor);
                if (sensor1.getId() != null) {
                    respuesta = respuesta + sensor1.getId();
                    if (i != sensoresConProblemas.size() - 1) {
                        respuesta += ", ";
                    }
                }
                i++;
            }
            respuesta += "]" + "\n";

        }
        return respuesta;
    }


}
