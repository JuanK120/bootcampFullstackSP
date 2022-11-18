package StringAnalysis;

import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        /*
            Pruebas para el metodo 2.a
         */
        try {
            System.out.println("Pruebas del metodo de generacion aleatoria de un String");
            System.out.println("String Tipo A: " + Challenge1.randomString("Tipo A"));
            System.out.println("String Tipo B: " + Challenge1.randomString("Tipo B"));
            System.out.println("String Tipo invalido (de mostrarse esto, la excepcion es incorrecta): " +
                    Challenge1.randomString("Tipo"));
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
        System.out.println("string esta contenido: " + Challenge1.isNotInList(sampleList,"nhjy"));
        System.out.println("string NO esta contenido: " + Challenge1.isNotInList(sampleList,"df"));

    }
}
