public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.nombre = "Florentino Perez";
        cliente.edad = 55;
        cliente.telefono = 891345678;
        cliente.credito = 5000;

        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono
                + " y mi credito disponible es " + cliente.credito + "€");


        Trabajador trabajador = new Trabajador();

        trabajador.nombre = "Karim Benzema";
        trabajador.edad = 30;
        trabajador.telefono = 893324452;
        trabajador.salario = 500000;

        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "€");
    }
}
class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}


