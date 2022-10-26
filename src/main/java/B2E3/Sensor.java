package B2E3;

import java.util.ArrayList;

public class Sensor
{
    // ATRIBUTOS
    private String id; //identificador del sensor
    private String tipo; // tipo de sensor
    private Estancia estancia; //nombre de la estancia donde esta el sensor
    private ArrayList<Float> datos; //conjunto de datos que ha capturado el sensor
    private Float[] rango; //rango de valores que puede tomar el sensor
    private Float precio; // precio del sensor


    // CONSTRUCTORES
    public Sensor(String id, String tipo, float[] rango, float precio)
    {
        if(id != null)
        {
            this.id = id;
        }
        if(tipo != null)
        {
            if(tipo.equals("temperatura") || tipo.equals("sonido") || tipo.equals("luz") || tipo.equals("humedad"))
            {
                this.tipo = tipo;
            }
        }
        //evitar aliasing en el rango
        if(rango != null)
        {
            Float[] listaRango = new Float[2];
            listaRango[0] = rango[0];
            listaRango[1] = rango[1];
            this.rango = listaRango;
        }
        if(precio != 0f)
        {
            this.precio = precio;
        }
    }


    //GETTERS Y SETTERS
    /** AÑADIR SETTER DE ESTANCIA !! **/

    /// id
    public String getId() {
        return id;
    }


    /// tipo
    public String getTipo() {
        return tipo;
    }

    /// datos
    public ArrayList<Float> getDatos() {
        return datos;
    }


    /// rango
    public void setRango(Float[] rango) {
        this.rango = rango;
    }

    /// precio
    public Float getPrecio() {
        return precio;
    }


    /// estancia

    public void setEstancia(Estancia estancia) {
        this.estancia = estancia;
    }

    public Estancia getEstancia() {
        return estancia;
    }

    // METODOS FUNCIONALES

    public float limiteInferior()  // devuelve el valor mínimo que puede tomar el sensor.
    {
        float limiteInf = 0f;
        limiteInf = rango[0];
        return limiteInf;
    }

    public float limiteSuperior()  // devuelve el valor maximo que puede tomar el sensor
    {
        float limiteSup = 0f;
        limiteSup = rango[1];
        return limiteSup;
    }

    public void nuevoDato(float dato)  //introduce un nuevo dato capturado por el sensor
    {
        if(datos != null) {
            if ((dato > limiteInferior()) && (dato < limiteSuperior())) {
                datos.add(dato);
            }
        }
        else
        {
            ArrayList<Float> datos = new ArrayList<>();
            this.datos = datos;
            if ((dato > limiteInferior()) && (dato < limiteSuperior())) {
                datos.add(dato);
            }
        }
    }

    public float media()  // devuelve la media de los valores del sensor
    {
        float media = 0f, suma = 0f;
        if(datos != null) {
            for (Float dato : datos) {
                suma = suma + dato;
            }
            media = suma / datos.size();
        }
        return media;
    }

    public float maximo() // devuelve el maximo de los valores del sensor
    {
        float maximo = 0;
        if(datos != null)
        {
            maximo = datos.get(0);
            for (Float dato : datos) {
                if (maximo < dato) {
                    maximo = dato;
                }
            }
        }
        return maximo;
    }

    public float minimo() // devuelve el minimo de los valores del sensor
    {
        float minimo = 0;
        if(datos != null)
        {
            minimo = datos.get(0);
            for (Float dato : datos) {
                if (minimo > dato) {
                    minimo = dato;
                }
            }
        }
        return minimo;
    }

    // @Override
    // son iguales solo si su id es igual
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
        final Sensor other = (Sensor) object;
        if(!this.id.equals(other.id))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        String respuesta = null;

        if(id != null)
        {
            respuesta = "id: " + getId() + "\n";
        }
        if(tipo != null)
        {
            respuesta += "tipo: " + getTipo() + "\n";
        }
        if(estancia != null)
        {
            respuesta += "estancia: " + getEstancia() + "\n";
        }
        if(rango != null)
        {
            respuesta = respuesta + "rango :  " ;
            respuesta = respuesta + "[";
            for (int i=0; i < rango.length; i++)
            {
                if (rango[i] != null)
                {
                    respuesta = respuesta + rango[i];
                    if(i != rango.length-1)
                    {
                        respuesta += ", ";
                    }
                }

            }
            respuesta +=  "]" + "\n";
        }
        if(datos != null)
        {
            respuesta = respuesta + "datos :  " ;
            respuesta = respuesta + "[";
            for (int i=datos.size()-1; i >= 0; i--)
            {
                if (datos.get(i) != null)
                {
                    respuesta = respuesta + datos.get(i);
                    if(i != 0)
                    {
                        respuesta += ", ";
                    }
                }

            }
            respuesta +=  "]" + "\n";

        }
        if(precio != 0f)
        {
            respuesta += "precio: " + getPrecio() + "\n";
        }
        if(minimo() != 0f)
        {
            respuesta += "minimo: " + minimo() + "\n";
        }
        if(maximo() != 0f)
        {
            respuesta += "maximo: " + maximo() + "\n";
        }
        if(media() != 0f)
        {
            respuesta += "media: " + media() + "\n";
        }
        return respuesta;
    }

}

