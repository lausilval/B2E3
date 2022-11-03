package B2E3;

import java.util.ArrayList;
import java.util.Arrays;

public class PrincipalB2E3 {
    public static void main(String[] args) {
        // a. Crear los sensores indicados en el fichero Excel B2E3_instancias.xls.
        Sensor sensor1 = new Sensor("100", "temperatura", new float[]{-5f, 35f}, 54.0f);
        Sensor sensor2 = new Sensor("101", "temperatura", new float[]{-5f, 40}, 48.5f);
        Sensor sensor3 = new Sensor("102", "temperatura", new float[]{-5f, 40}, 80.0f);
        Sensor sensor4 = new Sensor("103", "temperatura", new float[]{-5f, 40}, 45.0f);
        Sensor sensor5 = new Sensor("104", "temperatura", new float[]{-5f, 40}, 67.0f);
        Sensor sensor6 = new Sensor("105", "temperatura", new float[]{-5f, 40}, 86.0f);
        Sensor sensor7 = new Sensor("106", "temperatura", new float[]{-10f, 50}, 34.0f);
        Sensor sensor8 = new Sensor("107", "temperatura", new float[]{-10, 50}, 35.0f);
        Sensor sensor9 = new Sensor("108", "temperatura", new float[]{-10, 50}, 78.0f);
        Sensor sensor10 = new Sensor("200", "sonido", new float[]{0, 118}, 67.6f);
        Sensor sensor11 = new Sensor("201", "sonido", new float[]{0, 118}, 56.0f);
        Sensor sensor12 = new Sensor("202", "sonido", new float[]{0, 118}, 57.0f);
        Sensor sensor13 = new Sensor("203", "sonido", new float[]{0, 130}, 57.0f);
        Sensor sensor14 = new Sensor("204", "sonido", new float[]{0, 150}, 60.0f);
        Sensor sensor15 = new Sensor("205", "sonido", new float[]{0, 120}, 70.0f);
        Sensor sensor16 = new Sensor("206", "sonido", new float[]{0, 120}, 70.0f);
        Sensor sensor17 = new Sensor("207", "sonido", new float[]{0, 120}, 70.0f);
        Sensor sensor18 = new Sensor("208", "sonido", new float[]{0, 120}, 70.0f);
        Sensor sensor19 = new Sensor("300", "humedad", new float[]{0, 100}, 44.0f);
        Sensor sensor20 = new Sensor("301", "humedad", new float[]{0, 100}, 50.0f);
        Sensor sensor21 = new Sensor("302", "humedad", new float[]{0, 100}, 45.0f);
        Sensor sensor22 = new Sensor("303", "humedad", new float[]{0, 100}, 45.0f);
        Sensor sensor23 = new Sensor("304", "humedad", new float[]{0, 100}, 45.0f);
        Sensor sensor24 = new Sensor("305", "humedad", new float[]{0, 80}, 5.0f);
        Sensor sensor25 = new Sensor("306", "humedad", new float[]{0, 80}, 0.0f);
        Sensor sensor26 = new Sensor("109", "temperatura", new float[]{-10, 50}, 56.0f);
        Sensor sensor27 = new Sensor("110", "temperatura", new float[]{-10, 50}, 45.0f);
        Sensor sensor28 = new Sensor("209", "sonido", new float[]{0, 120}, 89.0f);
        Sensor sensor29 = new Sensor("307", "humedad", new float[]{0, 80}, 4.0f);
        Sensor sensor30 = new Sensor("308", "humedad", new float[]{0, 80}, 5.0f);
        Sensor sensor31 = new Sensor("309", "humedad", new float[]{0, 80}, 4.0f);


        //b. Crear las plantas indicadas en el fichero Excel B2E3_instancias.xls usando el constructor que tiene
        //como argumentos el numero y el tipo.
        Planta planta_1 = new Planta(-1, "oficinas");
        Planta planta0 = new Planta(0, "administracion");
        Planta planta1 = new Planta(1, "oficinas");
        Planta planta2 = new Planta(2, "viviendas libres");

        //c. Mostrar por pantalla las características de las plantas creadas en (b).
        System.out.println("APARTADO C) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta_1.toString());
        System.out.println(planta0.toString());
        System.out.println(planta1.toString());
        System.out.println(planta2.toString());

        //d. Crear las estancias indicadas en el fichero Excel B2E3_instancias.xls, dando de alta los sensores que
        //van del sensor1 al sensor17 usando el método que permite dar de alta a un sensor a partir de
        //su instancia. Los otros sensores se darán de alta en subsiguientes apartados.
        System.out.println("APARTADO D) -----------------------------------------------------------------------------------------------------------");

        Estancia estancia1 = new Estancia("-100", planta_1);
        System.out.println("estancia " + estancia1.getNombre() + " sensor 10 --> " + estancia1.darAlta(sensor10));

        Estancia estancia2 = new Estancia("-101", planta_1);

        Estancia estancia3 = new Estancia("-102", planta_1);
        System.out.println("estancia " + estancia3.getNombre() + " sensor 11 --> " + estancia3.darAlta(sensor11));

        Estancia estancia4 = new Estancia("000", planta0);
        System.out.println("estancia  " + estancia4.getNombre() + " sensor  1 --> " + estancia4.darAlta(sensor1));

        Estancia estancia5 = new Estancia("001", planta0);
        System.out.println("estancia  " + estancia5.getNombre() + " sensor  2 --> " + estancia5.darAlta(sensor2));
        System.out.println("estancia  " + estancia5.getNombre() + " sensor 12 --> " + estancia5.darAlta(sensor12));

        Estancia estancia6 = new Estancia("002", planta0);
        System.out.println("estancia  " + estancia6.getNombre() + " sensor  3 --> " + estancia6.darAlta(sensor3));
        System.out.println("estancia  " + estancia6.getNombre() + " sensor 16 --> " + estancia6.darAlta(sensor16));

        Estancia estancia7 = new Estancia("003", planta0);
        System.out.println("estancia  " + estancia7.getNombre() + " sensor  4 --> " + estancia7.darAlta(sensor4));
        System.out.println("estancia  " + estancia7.getNombre() + " sensor 17 --> " + estancia7.darAlta(sensor17));

        Estancia estancia8 = new Estancia("100", planta1);
        System.out.println("estancia  " + estancia8.getNombre() + " sensor  5 --> " + estancia8.darAlta(sensor5));

        Estancia estancia9 = new Estancia("101", planta1);
        System.out.println("estancia  " + estancia9.getNombre() + " sensor  6 --> " + estancia9.darAlta(sensor6));

        Estancia estancia10 = new Estancia("102", planta1);
        System.out.println("estancia  " + estancia10.getNombre() + " sensor  7 --> " + estancia10.darAlta(sensor7));
        System.out.println("estancia  " + estancia10.getNombre() + " sensor 13 --> " + estancia10.darAlta(sensor13));


        Estancia estancia11 = new Estancia("200", planta2);
        System.out.println("estancia  " + estancia11.getNombre() + " sensor  8 --> " + estancia11.darAlta(sensor8));

        Estancia estancia12 = new Estancia("201", planta2);
        System.out.println("estancia  " + estancia12.getNombre() + " sensor  9 --> " + estancia12.darAlta(sensor9));
        System.out.println("estancia  " + estancia12.getNombre() + " sensor 14 --> " + estancia12.darAlta(sensor14));


        Estancia estancia13 = new Estancia("202", planta2);
        System.out.println("estancia  " + estancia13.getNombre() + " sensor 15 --> " + estancia13.darAlta(sensor15));


        //e. Mostrar por pantalla las características de las estancias creadas en (d).
        System.out.println("APARTADO E) -----------------------------------------------------------------------------------------------------------");
        System.out.println(estancia1.toString());
        System.out.println(estancia2.toString());
        System.out.println(estancia3.toString());
        System.out.println(estancia4.toString());
        System.out.println(estancia5.toString());
        System.out.println(estancia6.toString());
        System.out.println(estancia7.toString());
        System.out.println(estancia8.toString());
        System.out.println(estancia9.toString());
        System.out.println(estancia10.toString());
        System.out.println(estancia11.toString());
        System.out.println(estancia12.toString());
        System.out.println(estancia13.toString());

        //f. En las plantas planta_1, planta0 y planta1, dar de alta las estancias que van de
        //estancia1 a estancia10 usando para ello el método que acepta como argumentos un
        //ArrayList<Estancia>.
        System.out.println("APARTADO F) -----------------------------------------------------------------------------------------------------------");
        ArrayList<Estancia> estanciasF = new ArrayList<Estancia>() {{add(estancia1); add(estancia2); add(estancia3); add(estancia4); add(estancia5);
            add(estancia6); add(estancia7); add(estancia8); add(estancia9); add(estancia10);}};
        System.out.println("planta -1: " );
        planta_1.darAltaEstancia(estanciasF);
        System.out.println("planta  0: ");
        planta0.darAltaEstancia(estanciasF);
        System.out.println("planta  1: ");
        planta1.darAltaEstancia(estanciasF);


        //g. Mostrar por pantalla las características de las plantas creadas en (b).
        System.out.println("APARTADO G) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta_1.toString());
        System.out.println(planta0.toString());
        System.out.println(planta1.toString());
        System.out.println(planta2.toString());

        //h. En la planta planta1, dar de alta los sensores sensor18 y sensor23 usando el método que
        //tiene como argumentos el id de la estancia y ArrayList<Sensor>.
        System.out.println("APARTADO H) -----------------------------------------------------------------------------------------------------------");
        ArrayList<Sensor> planta1_1823 = new ArrayList<>();
        planta1_1823.add(sensor18);
        planta1_1823.add(sensor23);
        planta1.darAltaSensor(estancia8.getNombre(), planta1_1823);
        //System.out.println(estancia8.toString());

        //i. En la planta planta1, dar de alta el sensor sensor24 usando el método que tiene como
        //argumentos el id de la estancia y Sensor.
        System.out.println("APARTADO I) -----------------------------------------------------------------------------------------------------------");
        planta1.darAltaSensor("101", sensor24);
        //System.out.println(estancia9.toString());

        //j. Mostrar por pantalla las características de la planta1.
        System.out.println("APARTADO J) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta1.toString());

        //k. En la planta planta_1, dar de alta los sensores sensor19, sensor20 y sensor21 usando el
        //método que tiene como argumentos la instancia de Sensor.
        System.out.println("APARTADO K) -----------------------------------------------------------------------------------------------------------");
        planta_1.darAltaSensor("-100", sensor19);
        planta_1.darAltaSensor("-101", sensor20);
        planta_1.darAltaSensor("-102", sensor21);

        //l. Mostrar por pantalla las características de la planta_1.
        System.out.println("APARTADO L) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta_1.toString());


        //m. En la planta planta2, dar de alta las estancias estancia11, estancia12 y estancia13
        //usando el método que tiene como argumento una instancia de Estancia.
        System.out.println("APARTADO M) -----------------------------------------------------------------------------------------------------------");
        System.out.println("estancia 11 -> " + planta2.darAltaEstancia(estancia11));
        System.out.println("estancia 12 -> " + planta2.darAltaEstancia(estancia12));
        System.out.println("estancia 13 -> " + planta2.darAltaEstancia(estancia13));


        //n. En la planta planta2, dar de alta el sensor sensor25 usando el método que tiene como
        //argumentos la instancia de Sensor.
        System.out.println("APARTADO N) -----------------------------------------------------------------------------------------------------------");
        planta2.darAltaSensor("200", sensor25);

        //o. Mostrar por pantalla las características de la planta2.
        System.out.println("APARTADO O) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta2.toString());

        //p. En la planta planta0, dar de alta el sensor sensor22 usando el método que tiene como
        //argumentos la instancia de Sensor.
        System.out.println("APARTADO P) -----------------------------------------------------------------------------------------------------------");
        planta0.darAltaSensor("000", sensor22);

        //q. Mostrar por pantalla las características de la planta0.
        System.out.println("APARTADO Q) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta0.toString());

        //r. Crear una instancia de Edificio a partir del constructor con argumentos de identificador
        //edificio1, un rango de [-1, 2] y las plantas planta_1, planta1 y planta2.
        ArrayList<Planta> plantasR = new ArrayList<Planta>() {{add(planta_1); add(planta1); add(planta2); }};
        Edificio edificio1 = new Edificio("edificio1", new int[]{-1, 2}, plantasR);
        //System.out.println("APARTADO R) -----------------------------------------------------------------------------------------------------------");
        //System.out.println(edificio1.toString());

        //s. Mostrar por pantalla las plantas que aún no están asignadas en el edificio.
        System.out.println("APARTADO S) -----------------------------------------------------------------------------------------------------------");
        int[] plantasS = edificio1.plantasNoAlta();
        for (int i = 0; i< plantasS.length; i++)
        {
            if(plantasS[i] != 0) /////ESTA MAL !!!
            {
                System.out.println(plantasS[i]);
            }
        }

        //t. Mostrar por pantalla las características de la planta2.


        //u. Dar de baja el sensor8 de la planta2 y sustituirlo por sensor26.


        //v. Mostrar por pantalla las características de la planta2.


        //w. Dar de baja el sensor6 de la planta1 y substituirlo por sensor27.


        //x. Mostrar por pantalla las características de la planta1.


        //y. Dar de baja el sensor10 de la planta_1 y substituirlo por sensor28.


        //z. Mostrar por pantalla las características de la planta_1.


        //aa. Dar de baja el sensor22 de la planta0 y substituirlo por sensor29.


        //bb. Dar de baja el sensor29 de la planta0 y substituirlo por sensor30.


        //cc. Dar de baja el sensor30 de la planta0 y substituirlo por sensor31.


        //dd. Mostrar por pantalla las características de la planta0.


        //ee. Mostrar por pantalla los tipos de sensores más defectuosos de la planta0.


        //ff. Mostrar por pantalla los sensores de "humedad" que hay en la planta2.


        //gg. Mostrar por pantalla los sensores de "sonido" de la planta1.


        //hh. Dar de alta la planta0 en el edificio1.


        //ii. Mostrar por pantalla las plantas que aún no están asignadas en el edificio.


        //jj. Mostrar las plantas del edificio con más problemas.


        //kk. Mostrar las plantas del edificio más caras.


    }
}
