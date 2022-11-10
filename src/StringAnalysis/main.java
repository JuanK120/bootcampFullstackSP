package StringAnalysis;

import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        Challenge1 st = new Challenge1();
        /*
            Pruebas para el metodo 2.a
         */
        try {
            System.out.println("Pruebas del metodo de generacion aleatoria de un String");
            System.out.println("String Tipo A: " + st.randomString("Tipo A"));
            System.out.println("String Tipo B: " + st.randomString("Tipo B"));
            System.out.println("String Tipo invalido (de mostrarse esto, la excepcion es incorrecta): " +
                                st.randomString("Tipo"));
        } catch (Exception e){
            System.out.println("Hubo un error durante la ejecucion");
            e.printStackTrace();
        }
        /*
            Pruebas para el metodo 2.b
         */
        List<String> sampleList = new ArrayList<>();
        sampleList.add("asdf");
        sampleList.add("fdgh");
        sampleList.add("tgbh");
        sampleList.add("nhjy");
        sampleList.add("lkhj");
        sampleList.add("iopu");
        System.out.println("Pruebas del metodo de Comprobacion de lista");
        System.out.println("string esta contenido: " + st.isNotInList(sampleList,"nhjy"));
        System.out.println("string NO esta contenido: " + st.isNotInList(sampleList,"df"));

    }
}
