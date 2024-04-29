class Videojuego:
    def __init__(self, titulo, precio, lanzamiento, plataforma=None, peso=None):
        self.titulo = titulo
        self.precio = precio
        self.lanzamiento = lanzamiento
        self.plataforma = plataforma
        self.peso = peso

    def mostrarInfo(self):
        print("Titulo:", self.titulo)
        print("Precio: S/. ", self.precio)
        print("Lanzamiento:", self.lanzamiento)

    def mostrarInfoDigital(self):
        print("Plataforma:", self.plataforma)

    def mostrarInfoFisico(self):
        print("Peso:", self.peso, "kg")


def mostrarMenu():
    print("Seleccione una opcion: ")
    print("1) Mostrar info del videojuego digital")
    print("2) Mostrar info del videojuego fisico")
    print("3) Salir")


juegoDigital01 = Videojuego("Half-Life 2", 22.00, 2004, "Steam")
juegoFisico01 = Videojuego("Outlast 2", 50.00, 2017, peso=0.2)

opcion = 0
while opcion != 3:
    mostrarMenu()
    opcion = int(input())
    if opcion == 1:
        print("Informacion del videojuego digital: ")
        juegoDigital01.mostrarInfo()
        juegoDigital01.mostrarInfoDigital()
    elif opcion == 2:
        print("Informacion del videojuego fisico: ")
        juegoFisico01.mostrarInfo()
        juegoFisico01.mostrarInfoFisico()
    elif opcion == 3:
        print("Saliendo...")
    else:
        print("Opcion invalida, intentelo de nuevo")
