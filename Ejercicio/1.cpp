#include <iostream>
#include <string>
#include <map> // Necesario para usar mapas en C++
using namespace std;

class Videojuego 
{
    private:
        string titulo;
        float precio;
        int lanzamiento;
    public:
        // Constructor para juego digital
        Videojuego(string _titulo, float _precio, int _lanzamiento, string _plataforma) 
        {
            titulo = _titulo;
            precio = _precio;
            lanzamiento = _lanzamiento;
            plataforma = _plataforma;
        }

        // Constructor para juego fisico
        Videojuego(string _titulo, float _precio, int _lanzamiento, float _peso) 
        {
            titulo = _titulo;
            precio = _precio;
            lanzamiento = _lanzamiento;
            peso = _peso;
        }


        void mostrarInfo() 
        {
            cout << "Titulo: " << titulo << endl;
            cout << "Precio: S/. " << precio << endl;
            cout << "Lanzamiento: " << lanzamiento << endl;
        }

        // Metodos adicionales para atributos especiales
        void mostrarInfoDigital() 
        {
            cout << "Plataforma: " << plataforma << endl;
        }

        void mostrarInfoFisico() 
        {
            cout << "Peso: " << peso << " kg" << endl;
        }

    private:
        string plataforma; // Solo para juegos digitales
        float peso; // Solo para juegos fisicos
};

void mostrarMenu() 
{
    cout << "Seleccione una opcion: " << endl;
    cout << "1) Mostrar info del videojuego digital" << endl;
    cout << "2) Mostrar info del videojuego fisico" << endl;
    cout << "3) Salir." << endl;
}

int main() 
{
    Videojuego juegoDigital01("Half-Life 2", 22.00, 2004, "Steam");
    Videojuego juegoFisico01("Outlast 2", 50.00, 2017, 0.2);

    int opcion;
   do {
        mostrarMenu();
        cin >> opcion;
        switch (opcion) 
        {
            case 1:
                cout << "Informacion del videojuego digital:" << endl;
                juegoDigital01.mostrarInfo();
                juegoDigital01.mostrarInfoDigital();
                break;
            case 2:
                cout << "Informacion del videojuego fisico:" << endl;
                juegoFisico01.mostrarInfo();
                juegoFisico01.mostrarInfoFisico();
                break;
            case 3:
                cout << "Saliendo..." << endl;
                break;
            default:
                cout << "Opcion invalida. Intentelo de nuevo." << endl;
                break;
        }
    } while (opcion != 3);


    return 0;
}
