import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String extension, nombre, tipo, nombreSinEsp;
        int ultimoPunto;
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingresa el nombre del archivo");
        nombre = scr.nextLine();
        nombreSinEsp = nombre.trim();

        ultimoPunto = nombreSinEsp.lastIndexOf(".");
        extension = nombreSinEsp.substring(ultimoPunto+1);

        switch (extension.trim()){
            case "jpg", "png", "gif":
                tipo = "Imagen";
                break;
            case "pdf", "doc", "txt":
                tipo = "Texto";
                break;
            case "mp3", "wav":
                tipo = "Audio";
                break;
            case "mp4", "avi":
                tipo = "Video";
                break;
            default:
                tipo = "No encontrado";
                break;
        }
        System.out.println("Nombre de archivo: " + nombre);
        System.out.println("Tipo de archivo: " + tipo);
        System.out.println("Extension: ." + extension);
    }
}
