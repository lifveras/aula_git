import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Casa> listaCasas = new ArrayList<>();
        listaCasas.add(new Casa("casa1"));
        listaCasas.add(new Casa("casa2"));
        listaCasas.add(new Casa("casa3"));
        try {
           Iterator it = listaCasas.iterator();
           while(it.hasNext()){
                String casa = (String) it.next();
                // System.out.println(casa.getNomeCasa());
                System.out.println(casa);
           }
        } catch (ClassCastException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Programa Finalizado!");
    }
}
