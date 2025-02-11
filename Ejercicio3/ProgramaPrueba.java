package Ejercicio3;

public class ProgramaPrueba {
    public static void main(String[] args) {
        PruebaArticulo prueba1=new PruebaArticulo(3);
        Articulo art1=new Articulo(23, "Luces Led");
        Articulo art2=new Articulo(42, "Camara");
        Articulo art3=new Articulo(10, "Patinete Electrico");

        prueba1.almacena(art1);
        prueba1.almacena(art2);
        prueba1.almacena(art3);
    }
}
