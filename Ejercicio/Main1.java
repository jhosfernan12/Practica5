import java.util.Scanner;

class Videojuego 
{
    private String titulo;
    private float precio;
    private int lanzamiento;
    private String plataforma; // Solo para juegos digitales
    private float peso; // Solo para juegos fisicos

    // Constructor para juego digital
    public Videojuego(String titulo, float precio, int lanzamiento, String plataforma) 
    {
        this.titulo = titulo;
        this.precio = precio;
        this.lanzamiento = lanzamiento;
        this.plataforma = plataforma;
    }

    // Constructor para juego fisico
    public Videojuego(String titulo, float precio, int lanzamiento, float peso) 
    {
        this.titulo = titulo;
        this.precio = precio;
        this.lanzamiento = lanzamiento;
        this.peso = peso;
    }

    public void mostrarInfo() 
    {
        System.out.println("Titulo: " + titulo);
        System.out.println("Precio: S/. " + precio);
        System.out.println("Lanzamiento: " + lanzamiento);
    }

    // Metodos adicionales para atributos especiales
    public void mostrarInfoDigital() 
    {
        System.out.println("Plataforma: " + plataforma);
    }

    public void mostrarInfoFisico() 
    {
        System.out.println("Peso: " + peso + " kg");
    }
}

public class Main1 
{
    public static void mostrarMenu() 
    {
        System.out.println("Seleccione una opcion:");
        System.out.println("1) Mostrar info del videojuego digital.");
        System.out.println("2) Mostrar info del videojuego fisico.");
        System.out.println("3) Salir.");
    }

    public static void main(String[] args) 
    {
        Videojuego juegoDigital01 = new Videojuego("Half-Life 2", 22.00f, 2004, "Steam");
        Videojuego juegoFisico01 = new Videojuego("Outlast 2", 50.00f, 2017, 0.2f);

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) 
            {
                case 1:
                    System.out.println("Informacion del videojuego digital:");
                    juegoDigital01.mostrarInfo();
                    juegoDigital01.mostrarInfoDigital();
                    break;
                case 2:
                    System.out.println("Informacion del videojuego fisico:");
                    juegoFisico01.mostrarInfo();
                    juegoFisico01.mostrarInfoFisico();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intentelo de nuevo.");
                    break;
            }
        } while (opcion != 3);
    }
}
