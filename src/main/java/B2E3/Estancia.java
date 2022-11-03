package B2E3;

import java.util.*;

public class Estancia
{
    // ATRIBUTOS
    private String nombre;  // nombre de la estancia, que también es su identificador único.
    private Planta planta; // planta en la que se encuentra la estancia
    private HashMap<String, Sensor> sensores; // conjunto de sensores que estan instalados en la estancia
    private float coste;    // coste de la estancia, entendida como la suma del precio de todos los sensores de la estancia

    // CONSTRUCTORES
    public Estancia(String nombre, Planta planta) {
        if (nombre != null) {
            this.nombre = nombre;
        }
        this.planta = planta;

        this.sensores = null;   // new HashMap<>() ?
        this.coste = 0f;
    }

    // GETTERS && SETTERS

    public String getNombre() {
        return nombre;
    }



    public Planta getPlanta() {
        return planta;
    }

    public HashMap<String, Sensor> getSensores() {
        return sensores;
    }



    public float getCoste() {
        //actualizarCoste();
        return coste;
    }




    // METODOS FUNCIONALES


    public float actualizarCoste() {
        float res = 0f;
        if (this.sensores != null) {
            for (String senso : sensores.keySet())
            {
                Sensor sensor = sensores.get(senso);
                if(sensor.getPrecio() != null)
                {
                    res += sensor.getPrecio();
                }
            }
        }
        return res;
    }

    //  dar de alta un sensor, teniendo en cuenta
    //el criterio de igualdad definido en la clase Sensor.
    public boolean darAlta(Sensor sensor) {
        //tenemos que ir recorriendo el array de sensores viendo que no haya ninguno
        //igual en la misma estancia
        if (sensores == null) {
            HashMap<String, Sensor> sensores = new HashMap<String, Sensor>();
            this.sensores = sensores;
            sensores.put(sensor.getId(), sensor);
            coste = actualizarCoste();
        } else {
            for (String senso : sensores.keySet())
            {
                Sensor sensor1 = sensores.get(senso);
                if (sensor1 != null) {
                    if (sensor1.equals(sensor)) {
                        return false;
                    }
                }
            }
            sensores.put(sensor.getId(), sensor);
        }
        return true;
    }

    //dar de alta un sensor a partir de su id, tipo, rango y precio, teniendo en cuenta el
    //criterio de igualdad
    public boolean darAlta(String id, String tipo, float[] rango, float precio)
    {
        for (String senso : sensores.keySet())
        {
            Sensor sensor1 = sensores.get(senso);
            if (sensor1.getId().equals(id))
            {
                return false;
            }
        }
        Sensor nuevoSensor = new Sensor(id, tipo, rango, precio);
        sensores.put(id, nuevoSensor);
        return true;
    }

    //introducir un nuevo dato
    //capturado por el sensor que tiene un determinado identificador id, devolviendo true si ha sido
    //introducido correctamente o false, en caso contrario
    public boolean nuevoDato(String id, float dato) {
        if (sensores != null)
        {
            for (String senso : sensores.keySet())
            {
                Sensor sensor1 = sensores.get(senso);
                // en el caso en el que exista el id...
                if (sensor1.getId().equals(id))
                {
                    if ((sensor1.limiteInferior() < dato) && (sensor1.limiteSuperior() > dato)) {
                        sensor1.nuevoDato(dato);
                        return true;
                    }
                }
            }
        }
        //si no hay ningun sensor con ese id
        return false;
    }

    ////FUNCION PROPIA
    public Sensor sensorNombre(String id)
    {
        Sensor respuesta = null;
        for (String sensor: sensores.keySet())
        {
            Sensor sensor1 = sensores.get(sensor);
            if(sensor1.getId().equals(id))
            {
                respuesta = sensor1;
            }
        }
        return respuesta;
    }

    // devuelve el conjunto de sensores
    //de un determinado tipo que hay en la estancia.
    public Set<Sensor> sensoresTipo(String tipo) {
        Set<Sensor> respuesta = new HashSet<Sensor>();
        Iterator<String> value = sensores.keySet().iterator();
        while(value.hasNext())
        {
            String nombreSensor = value.next();
            Sensor sensor = sensores.get(nombreSensor);
            if(sensor.getTipo().equals(tipo))
            {
                respuesta.add(sensor);
            }
        }
        return respuesta;
    }

    // devuelve el sensor (o sensores) de
    //un determinado tipo que ha capturado el valor máximo.
    public Sensor[] sensorMaxValor(String tipo) {
        Set<Sensor> aux = sensoresTipo(tipo);  // todos los sensores que sean de ese tipo
        Sensor[] respuesta = new Sensor[aux.size()];    // donde se va a almacenar la respuesta
        float maxValor = 0;
        int i = 0, j = 0;

        Iterator<Sensor> value = aux.iterator();
        while(value.hasNext())
        {
            Sensor sensor = value.next();
            if (i == 0) {
                maxValor = sensor.maximo();
                i++;
            }
            if (maxValor <= sensor.maximo()) {
                maxValor = sensor.maximo();
                respuesta[j] = sensor;
                j++;
            }
        }
        return respuesta;
    }

    //  devuelve el sensor (o sensores) de
    //un determinado tipo que ha capturado el valor mínimo.
    public Sensor[] sensorMinValor(String tipo) {
        Set<Sensor> aux = sensoresTipo(tipo);  // todos los sensores que sean de ese tipo
        Sensor[] respuesta = new Sensor[aux.size()];    // donde se va a almacenar la respuesta
        float minValor = 0;
        int i = 0, j = 0;
        Iterator<Sensor> value = aux.iterator();
        while(value.hasNext())
        {
            Sensor sensor = value.next();
            if (i == 0) {
                minValor = sensor.minimo();
                i++;
            }
            if (minValor > sensor.minimo()) {
                minValor = sensor.minimo();
                respuesta[j] = sensor;
                j++;
            }
        }
        return respuesta;
    }

    // devuelve el conjunto de valores de un sensor con identificador id que superan un determinado
    //valor.
    public ArrayList<Float> valoresSuperiores(String id, float valor) {
        ArrayList<Float> respuesta = new ArrayList<>();

        for (String senso : sensores.keySet())
        {
            Sensor sensor1 = sensores.get(senso);
            if (sensor1.getId().equals(id))
            {
                ArrayList<Float> sensorDatos = sensor1.getDatos();
                for (Float d : sensorDatos)
                {
                    if (d > valor)
                    {
                        respuesta.add(d);
                    }
                }
            }

        }
        return respuesta;
    }

    //// METODOS DEL B2E2

    // devuelve el conjunto de valores de todos los sensores de un determinado tipo, donde la
    //clave es el id del señor y los datos son los valores de dicho sensor. El conjunto de sensores se debe
    //recorrer usando un iterator sobre las claves.
    public HashMap<String, ArrayList<Float>> valoresSensoresTipo(String tipo)
    {
        HashMap<String, ArrayList<Float>> respuesta = new HashMap<>();  // donde se van a almacenar todos los sensores de ese tipo con sus respectivos datos
        Set<Sensor> aux = sensoresTipo(tipo);   // almacenados los sensores del tipo que queremos

        Iterator<String> value = sensores.keySet().iterator();   // iterator
        while(value.hasNext())
        {
            String nombreSensor = value.next();
            Sensor sensor = sensores.get(nombreSensor);
            if(aux.contains(sensor))
            {
                respuesta.put(nombreSensor, sensor.getDatos());
            }
            //Sensor sensor = aux.iterator().next();
            //respuesta.put(sensor.getId(), sensor.getDatos());
        }
        return respuesta;
    }


    // devuelve el conjunto de sensores de que tienen un coste mayor que un determinado valor. El conjunto de
    //sensores de Estancia se debe recorrer usando un iterator sobre los Map.Entry<String,
    //Sensor>.
    public ArrayList<Sensor> sensoresCosteMayor(float valor) {
        ArrayList<Sensor> respuesta = new ArrayList<>();

        Set<Map.Entry<String, Sensor>> mapSensor = sensores.entrySet();
        Iterator<Map.Entry<String,Sensor>> value = mapSensor.iterator();
        while (value.hasNext()) {
            Map.Entry<String, Sensor> nombreSensor = value.next();
            Sensor sensor =  nombreSensor.getValue();
            if (sensor.getPrecio() > valor)
            {
                respuesta.add(sensor);
            }
        }
        return respuesta;
    }


    // METODO FUNCIONAL B2E3

    // da de baja al sensor con identificador id, de modo
    //que si se da de baja exitosamente, es decir, existe un sensor con ese id, se devuelve true, en caso
    //contrario, se devolverá false.
    public boolean darBaja(String id)
    {
        if (sensores == null) {
            return false;
        } else {
            for (String senso : sensores.keySet())
            {
                Sensor sensor1 = sensores.get(senso);
                if (sensor1.getId() != null) {
                    if (sensor1.getId().equals(id))
                    {
                        sensores.remove(sensor1.getId());   // eliminamos ese sensor del HashMap
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // donde se considera que dos estancias son
    //iguales si sus nombres son iguales y si la planta en la que se encuentran es la misma
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        final Estancia other = (Estancia) object;
        if (!this.nombre.equals(other.nombre)) {
            return false;
        }
        if (this.planta != other.planta) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        String respuesta = null;
        if (nombre != null) {
            respuesta = "nombre estancia: " + getNombre() + "\n";
        }
        respuesta += "planta: " + "\n" + planta.toString();
        if (sensores != null) {
            respuesta = respuesta + "sensores:  ";
            respuesta = respuesta + "[";
            int i = 0;
            for (String sensor : sensores.keySet())
            {
                Sensor sensor1 = sensores.get(sensor);
                if (sensor1.getId() != null) {
                    respuesta = respuesta + sensor1.getId();
                    if (i != sensores.size() - 1) {
                        respuesta += ", ";
                    }
                }
                i++;
            }
            respuesta += "]" + "\n";
        }
        if (coste != 0f) {
            respuesta += "coste: " + getCoste() + "\n";

        }
        if (sensores != null) {
            respuesta = respuesta + "sensores_media:  ";
            respuesta = respuesta + "[";
            int i = 0;
            for (String sensor : sensores.keySet())
            {
                Sensor sensor1 = sensores.get(sensor);
                if (sensor1.getId() != null) {
                    respuesta += "{";
                    respuesta = respuesta + sensor1.getId();
                    if (i != sensores.size()) {
                        respuesta += ", ";
                    }
                }
                if (sensor1.media() != 0f) {
                    respuesta = respuesta + sensor1.media();
                }
                respuesta += "} ";
                if (i != sensores.size() - 1) {
                    respuesta += ", ";
                }
                i++;
            }
            respuesta += "]" + "\n";
        }
        return respuesta;
    }


}
