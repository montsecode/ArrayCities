
//Exercici Noms Ciutats



/**Objectiu: Practicar funcionalitats bàsiques com variables, bucles i arrays.

 * L’exercici consisteix en mostrar per consola diferents
 * noms de ciutats partint d’un array i modificar els noms
 * canviant lletres.

 * 
 * 
 * 
 */


package cities.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Ciutats {

    // Crea sis variables tipu string buides.
    static List<String> arrayCiutats = new ArrayList<String>();

    public static void main(String[] args) {

        Fase1();
        Fase2();
        Fase3();
        Fase4();

    }
    
    // Recursos: 
    //https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=596:interface-collection-api-java-add-remove-size-ejemplo-arraylist-diferencia-con-list-streams-cu00917c&catid=58&Itemid=180
    //https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=603:interface-list-del-api-java-clases-arraylist-linkedlist-stack-vector-ejemplo-con-arraylist-cu00920c&catid=58&Itemid=180
    //https://aprenderaprogramar.es/index.php?option=com_content&view=article&id=631:clase-arraylist-del-api-java-metodos-add-size-etc-concepto-de-clase-generica-o-parametrizada-cu00665b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
    
    //https://www.tutorialspoint.com/can-we-have-a-private-method-or-private-static-method-in-an-interface-in-java-9
    //https://www.adictosaltrabajo.com/2015/09/17/la-directiva-static-en-java/
    //https://javadesdecero.es/basico/puntos-interesantes-null-java/
    //https://examples.javacodegeeks.com/core-java/util/collections/java-util-collections-example/
    // Videos píldoras informáticas: Curso Java. Colecciones . Vídeos 179 a 189

    private static void Fase1() {
        // Demana per consola que s’introdueixin els noms.
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introdueix els noms de les 6 ciutats per teclat (" + arrayCiutats.size() + "/6): ");
            // Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga,
            // Cadis, Santander) per teclat.
            arrayCiutats.add(sc.nextLine());
        } while (arrayCiutats.size() < 6);
        sc.close();

        // Mostra per consola el nom de les 6 ciutats
        showCities(arrayCiutats);
    }

    private static void Fase2() {
        // Un cop tenim els noms de les ciutats guardats en variables haurem de pasar
        // l’informacio a un array (arrayCiutats)

        // Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats
        // ordenadas per ordre alfabetic.
        Collections.sort(arrayCiutats);
        showCities(arrayCiutats);
    }

    private static void showCities(List<String> arrayCiutats) {

        System.out.println("Mostrar per consola el nom de les ciutats: ");
        System.out.println("************************************");
        for (String city : arrayCiutats) {
            System.out.println(city);
        }
        System.out.println("************************************");

    }

    private static void Fase3() {
    	//Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els noms modificats en un nou
    	//array(ArrayCiutatsModificades)
    	//Mostreu per consola l’array modificat i ordenat per ordre alfabetic.
        List<String> arrayCiutatsModificades = new ArrayList<String>();
        for (String ciutat : arrayCiutats) {
            arrayCiutatsModificades.add(ciutat.replaceAll("a", "4"));
        }
        showCities(arrayCiutatsModificades);
    }

    private static void Fase4() {

        // Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous
        // arrays sera la llargada de cada string ( string nomCiutat.Length). (0,5 punts
        List<String> citiesReversed = new ArrayList<String>();
        for (String city : arrayCiutats) {
            char[] arrCityReverse = new char[city.length()];
            int cont = 0;
            // Ompliu els nous arrays lletra per lletra
            for (int i = city.length(); i > 0; i--) {
                arrCityReverse[cont] = city.charAt(i-1);
                cont++;
            }
            citiesReversed.add(new String(arrCityReverse));
        }

        // Mostreu per consola els nous arrays amb els noms invertits
        // (Ex: Barcelona - anolecraB
        for (int i = 0; i < arrayCiutats.size(); i++) {
            System.out.println(arrayCiutats.get(i) + " - " + citiesReversed.get(i));
        }
    }

}