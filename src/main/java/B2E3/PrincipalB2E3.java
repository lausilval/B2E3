package B2E3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class PrincipalB2E3 {
    public static void main(String[] args) {
        // a. Crear los sensores indicados en el fichero Excel B2E3_instancias.xls.
        Sensor sensor1 = new Sensor("100", "temperatura", new float[]{-5f, 35f}, 54.4f);
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
        Sensor sensor24 = new Sensor("305", "humedad", new float[]{0, 80}, 45.0f);
        Sensor sensor25 = new Sensor("306", "humedad", new float[]{0, 80}, 60.0f);
        Sensor sensor26 = new Sensor("109", "temperatura", new float[]{-10, 50}, 56.0f);
        Sensor sensor27 = new Sensor("110", "temperatura", new float[]{-10, 50}, 45.0f);
        Sensor sensor28 = new Sensor("209", "sonido", new float[]{0, 120}, 89.0f);
        Sensor sensor29 = new Sensor("307", "humedad", new float[]{0, 80}, 34.0f);
        Sensor sensor30 = new Sensor("308", "humedad", new float[]{0, 80}, 45.0f);
        Sensor sensor31 = new Sensor("309", "humedad", new float[]{0, 80}, 34.0f);


        //b. Crear las plantas indicadas en el fichero Excel B2E3_instancias.xls usando el constructor que tiene
        //como argumentos el numero y el tipo.
        Planta planta_1 = new Planta(-1, "oficinas");
        Planta planta0 = new Planta(0, "administracion");
        Planta planta1 = new Planta(1, "oficinas");
        Planta planta2 = new Planta(2, "viviendas libres");

        //c. Mostrar por pantalla las caracter??sticas de las plantas creadas en (b).
        System.out.println("APARTADO C) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta_1.toString());
        System.out.println(planta0.toString());
        System.out.println(planta1.toString());
        System.out.println(planta2.toString());

        //d. Crear las estancias indicadas en el fichero Excel B2E3_instancias.xls, dando de alta los sensores que
        //van del sensor1 al sensor17 usando el m??todo que permite dar de alta a un sensor a partir de
        //su instancia. Los otros sensores se dar??n de alta en subsiguientes apartados.
        System.out.println("APARTADO D) -----------------------------------------------------------------------------------------------------------");

        Estancia estancia1 = new Estancia("-100", planta_1);
        System.out.println("estancia " + estancia1.getNombre() + " sensor 10 --> " + estancia1.darAlta(sensor10));
        sensor10.setEstancia(estancia1);

        Estancia estancia2 = new Estancia("-101", planta_1);

        Estancia estancia3 = new Estancia("-102", planta_1);
        System.out.println("estancia " + estancia3.getNombre() + " sensor 11 --> " + estancia3.darAlta(sensor11));
        sensor11.setEstancia(estancia3);

        Estancia estancia4 = new Estancia("000", planta0);
        System.out.println("estancia  " + estancia4.getNombre() + " sensor  1 --> " + estancia4.darAlta(sensor1));
        sensor1.setEstancia(estancia4);

        Estancia estancia5 = new Estancia("001", planta0);
        System.out.println("estancia  " + estancia5.getNombre() + " sensor  2 --> " + estancia5.darAlta(sensor2));
        System.out.println("estancia  " + estancia5.getNombre() + " sensor 12 --> " + estancia5.darAlta(sensor12));
        sensor2.setEstancia(estancia5);
        sensor12.setEstancia(estancia5);

        Estancia estancia6 = new Estancia("002", planta0);
        System.out.println("estancia  " + estancia6.getNombre() + " sensor  3 --> " + estancia6.darAlta(sensor3));
        System.out.println("estancia  " + estancia6.getNombre() + " sensor 16 --> " + estancia6.darAlta(sensor16));
        sensor3.setEstancia(estancia6);
        sensor16.setEstancia(estancia6);

        Estancia estancia7 = new Estancia("003", planta0);
        System.out.println("estancia  " + estancia7.getNombre() + " sensor  4 --> " + estancia7.darAlta(sensor4));
        System.out.println("estancia  " + estancia7.getNombre() + " sensor 17 --> " + estancia7.darAlta(sensor17));
        sensor4.setEstancia(estancia7);
        sensor17.setEstancia(estancia7);

        Estancia estancia8 = new Estancia("100", planta1);
        System.out.println("estancia  " + estancia8.getNombre() + " sensor  5 --> " + estancia8.darAlta(sensor5));
        sensor5.setEstancia(estancia8);

        Estancia estancia9 = new Estancia("101", planta1);
        System.out.println("estancia  " + estancia9.getNombre() + " sensor  6 --> " + estancia9.darAlta(sensor6));
        sensor6.setEstancia(estancia9);

        Estancia estancia10 = new Estancia("102", planta1);
        System.out.println("estancia  " + estancia10.getNombre() + " sensor  7 --> " + estancia10.darAlta(sensor7));
        System.out.println("estancia  " + estancia10.getNombre() + " sensor 13 --> " + estancia10.darAlta(sensor13));
        sensor7.setEstancia(estancia10);
        sensor13.setEstancia(estancia10);


        Estancia estancia11 = new Estancia("200", planta2);
        System.out.println("estancia  " + estancia11.getNombre() + " sensor  8 --> " + estancia11.darAlta(sensor8));
        sensor8.setEstancia(estancia11);

        Estancia estancia12 = new Estancia("201", planta2);
        System.out.println("estancia  " + estancia12.getNombre() + " sensor  9 --> " + estancia12.darAlta(sensor9));
        System.out.println("estancia  " + estancia12.getNombre() + " sensor 14 --> " + estancia12.darAlta(sensor14));
        sensor9.setEstancia(estancia12);
        sensor14.setEstancia(estancia12);


        Estancia estancia13 = new Estancia("202", planta2);
        System.out.println("estancia  " + estancia13.getNombre() + " sensor 15 --> " + estancia13.darAlta(sensor15));
        sensor15.setEstancia(estancia13);


        //e. Mostrar por pantalla las caracter??sticas de las estancias creadas en (d).
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
        //estancia1 a estancia10 usando para ello el m??todo que acepta como argumentos un
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


        //g. Mostrar por pantalla las caracter??sticas de las plantas creadas en (b).
        System.out.println("APARTADO G) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta_1.toString());
        System.out.println(planta0.toString());
        System.out.println(planta1.toString());
        System.out.println(planta2.toString());

        //h. En la planta planta1, dar de alta los sensores sensor18 y sensor23 usando el m??todo que
        //tiene como argumentos el id de la estancia y ArrayList<Sensor>.
        System.out.println("APARTADO H) -----------------------------------------------------------------------------------------------------------");
        ArrayList<Sensor> planta1_1823 = new ArrayList<>();
        planta1_1823.add(sensor18);
        planta1_1823.add(sensor23);
        sensor18.setEstancia(estancia8);
        sensor23.setEstancia(estancia8);
        planta1.darAltaSensor(estancia8.getNombre(), planta1_1823);
        //System.out.println(estancia8.toString());

        //i. En la planta planta1, dar de alta el sensor sensor24 usando el m??todo que tiene como
        //argumentos el id de la estancia y Sensor.
        System.out.println("APARTADO I) -----------------------------------------------------------------------------------------------------------");
        planta1.darAltaSensor("101", sensor24);
        sensor24.setEstancia(estancia9);
        //System.out.println(estancia9.toString());

        //j. Mostrar por pantalla las caracter??sticas de la planta1.
        System.out.println("APARTADO J) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta1.toString());

        //k. En la planta planta_1, dar de alta los sensores sensor19, sensor20 y sensor21 usando el
        //m??todo que tiene como argumentos la instancia de Sensor.
        System.out.println("APARTADO K) -----------------------------------------------------------------------------------------------------------");
        planta_1.darAltaSensor("-100", sensor19);
        planta_1.darAltaSensor("-101", sensor20);
        planta_1.darAltaSensor("-102", sensor21);

        sensor19.setEstancia(estancia1);
        sensor20.setEstancia(estancia2);
        sensor21.setEstancia(estancia3);
        //l. Mostrar por pantalla las caracter??sticas de la planta_1.
        System.out.println("APARTADO L) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta_1.toString());


        //m. En la planta planta2, dar de alta las estancias estancia11, estancia12 y estancia13
        //usando el m??todo que tiene como argumento una instancia de Estancia.
        System.out.println("APARTADO M) -----------------------------------------------------------------------------------------------------------");
        System.out.println("estancia 11 -> " + planta2.darAltaEstancia(estancia11));
        System.out.println("estancia 12 -> " + planta2.darAltaEstancia(estancia12));
        System.out.println("estancia 13 -> " + planta2.darAltaEstancia(estancia13));


        //n. En la planta planta2, dar de alta el sensor sensor25 usando el m??todo que tiene como
        //argumentos la instancia de Sensor.
        System.out.println("APARTADO N) -----------------------------------------------------------------------------------------------------------");
        planta2.darAltaSensor("200", sensor25);
        sensor25.setEstancia(estancia11);

        //o. Mostrar por pantalla las caracter??sticas de la planta2.
        System.out.println("APARTADO O) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta2.toString());

        //p. En la planta planta0, dar de alta el sensor sensor22 usando el m??todo que tiene como
        //argumentos la instancia de Sensor.
        System.out.println("APARTADO P) -----------------------------------------------------------------------------------------------------------");
        planta0.darAltaSensor("000", sensor22);
        sensor22.setEstancia(estancia4);

        //q. Mostrar por pantalla las caracter??sticas de la planta0.
        System.out.println("APARTADO Q) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta0.toString());

        //r. Crear una instancia de Edificio a partir del constructor con argumentos de identificador
        //edificio1, un rango de [-1, 2] y las plantas planta_1, planta1 y planta2.
        ArrayList<Planta> plantasR = new ArrayList<Planta>() {{add(planta_1); add(planta1); add(planta2); }};
        Edificio edificio1 = new Edificio("edificio1", new int[]{-1, 2}, plantasR);
        //System.out.println("APARTADO R) -----------------------------------------------------------------------------------------------------------");
        //System.out.println(edificio1.toString());

        //s. Mostrar por pantalla las plantas que a??n no est??n asignadas en el edificio.
        System.out.println("APARTADO S) -----------------------------------------------------------------------------------------------------------");
        int[] plantasS = edificio1.plantasNoAlta();
        System.out.println("Las plantas que aun no han sido dadas de alta son: " + Arrays.toString(plantasS));

        //t. Mostrar por pantalla las caracter??sticas de la planta2.
        System.out.println("APARTADO T) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta2.toString());

        //u. Dar de baja el sensor8 de la planta2 y sustituirlo por sensor26.
        System.out.println("APARTADO U) -----------------------------------------------------------------------------------------------------------");
        System.out.println("La estancia en la que se encuentra el sensor8('107') es la 11 ('200')");
        System.out.println(estancia11.toString());

        planta2.darBajaSensor("107", sensor26);
        sensor26.setEstancia(estancia11);

        System.out.println("Despues de cambiar el sensor '107'(sensor8) por el '109'(sensor26)...");
        System.out.println(estancia11.toString());
        //v. Mostrar por pantalla las caracter??sticas de la planta2.
        System.out.println("APARTADO V) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta2.toString());


        //w. Dar de baja el sensor6 de la planta1 y substituirlo por sensor27.
        System.out.println("APARTADO W) -----------------------------------------------------------------------------------------------------------");
        System.out.println("La estancia en la que se encuentra el sensor6('105') es la 9 ('101')");
        System.out.println(estancia9.toString());

        planta1.darBajaSensor("105", sensor27);
        sensor27.setEstancia(estancia9);

        System.out.println("Despues de cambiar el sensor '105'(sensor6) por el '110'(sensor27)...");
        System.out.println(estancia9.toString());

        //x. Mostrar por pantalla las caracter??sticas de la planta1.
        System.out.println("APARTADO X) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta1.toString());

        //y. Dar de baja el sensor10 de la planta_1 y substituirlo por sensor28.
        System.out.println("APARTADO Y) -----------------------------------------------------------------------------------------------------------");
        System.out.println("La estancia en la que se encuentra el sensor10('200') es la 1 ('-100')");
        System.out.println(estancia1.toString());

        planta_1.darBajaSensor("200", sensor28);
        sensor28.setEstancia(estancia1);

        System.out.println("Despues de cambiar el sensor '200'(sensor10) por el '209'(sensor28)...");
        System.out.println(estancia1.toString());


        //z. Mostrar por pantalla las caracter??sticas de la planta_1.
        System.out.println("APARTADO Z) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta_1.toString());


        //aa. Dar de baja el sensor22 de la planta0 y substituirlo por sensor29.
        System.out.println("APARTADO AA) -----------------------------------------------------------------------------------------------------------");
        System.out.println("La estancia en la que se encuentra el sensor22('303') es la 4 ('000')");
        System.out.println(estancia4.toString());

        planta0.darBajaSensor("303", sensor29);

        sensor29.setEstancia(estancia4);

        System.out.println("Despues de cambiar el sensor '303'(sensor22) por el '307'(sensor29)...");
        System.out.println(estancia4.toString());

        //bb. Dar de baja el sensor29 de la planta0 y substituirlo por sensor30.
        System.out.println("APARTADO BB) -----------------------------------------------------------------------------------------------------------");
        System.out.println("La estancia en la que se encuentra el sensor29('307') es la 4 ('000')");
        System.out.println(estancia4.toString());

        planta0.darBajaSensor("307", sensor30);
        sensor30.setEstancia(estancia4);

        System.out.println("Despues de cambiar el sensor '307'(sensor29) por el '308'(sensor30)...");
        System.out.println(estancia4.toString());

        //cc. Dar de baja el sensor30 de la planta0 y substituirlo por sensor31.
        System.out.println("APARTADO CC) -----------------------------------------------------------------------------------------------------------");
        System.out.println("La estancia en la que se encuentra el sensor30('308') es la 4 ('000')");
        System.out.println(estancia4.toString());

        planta0.darBajaSensor("308", sensor31);
        sensor31.setEstancia(estancia4);

        System.out.println("Despues de cambiar el sensor '308'(sensor29) por el '309'(sensor30)...");
        System.out.println(estancia4.toString());

        //dd. Mostrar por pantalla las caracter??sticas de la planta0.
        System.out.println("APARTADO DD) -----------------------------------------------------------------------------------------------------------");
        System.out.println(planta0.toString());

        //ee. Mostrar por pantalla los tipos de sensores m??s defectuosos de la planta0.
        System.out.println("APARTADO EE) -----------------------------------------------------------------------------------------------------------");
        Set<String> sensoresMasDesfectuososP0 = planta0.tipoSensoresMasDefectuosos();
        System.out.println("Los tipos de sensores mas defectuosos son: " + sensoresMasDesfectuososP0);

        //ff. Mostrar por pantalla los sensores de "humedad" que hay en la planta2.
        System.out.println("APARTADO FF) -----------------------------------------------------------------------------------------------------------");
        System.out.println("Los sensores de 'humedad' que hay en la planta 2 son: " + planta2.sensoresTipo("humedad"));

        //gg. Mostrar por pantalla los sensores de "sonido" de la planta1.
        System.out.println("APARTADO GG) -----------------------------------------------------------------------------------------------------------");
        System.out.println("Los sensores de 'sonido' que hay en la planta 1 son: " + planta1.sensoresTipo("sonido"));


        //hh. Dar de alta la planta0 en el edificio1.
        System.out.println("APARTADO HH) -----------------------------------------------------------------------------------------------------------");
        System.out.println("planta0 en edificio1 -> " + edificio1.darAltaPlanta(planta0));

        //ii. Mostrar por pantalla las plantas que a??n no est??n asignadas en el edificio.
        System.out.println("APARTADO II) -----------------------------------------------------------------------------------------------------------");
        int[] plantasII = edificio1.plantasNoAlta();
        System.out.println("Las plantas que aun no han sido dadas de alta son: " + Arrays.toString(plantasII));

        //jj. Mostrar las plantas del edificio con m??s problemas.
        System.out.println("APARTADO JJ) -----------------------------------------------------------------------------------------------------------");
        HashMap<Integer, Set<Estancia>> plantasProblemasJJ = edificio1.plantasMasProblemas();
        System.out.println("Las plantas con mas problemas del edificio son: " );
        for(Integer numPlanta : plantasProblemasJJ.keySet())
        {
            System.out.println("Planta: " + numPlanta);
            Set<Estancia> estanciasPlanta = plantasProblemasJJ.get(numPlanta);
            for(Estancia estan: estanciasPlanta)
            {
                System.out.println("\t" + estan);
            }
        }

        //kk. Mostrar las plantas del edificio m??s caras.
        System.out.println("APARTADO KK) -----------------------------------------------------------------------------------------------------------");
        System.out.println("Las plantas del edificio mas caras son: " + edificio1.plantasMasCaras());


    }
}
