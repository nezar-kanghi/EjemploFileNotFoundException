import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploFileNotFoundException {

    public static void main(String[] args) {

        try {
            // Intentar abrir un archivo que no existe
            File archivo = new File("archivo_inexistente.txt");
            Scanner lector = new Scanner(archivo);

            // Si el archivo existe, lee su contenido
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }

            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado.");
        }
    }
}

