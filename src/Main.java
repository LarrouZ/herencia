public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.nombre = "Florentino Perez";
        cliente.edad = 55;
        cliente.telefono = 891345678;
        cliente.credito = 5000;

        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);


        Trabajador trabajador = new Trabajador();

        trabajador.nombre = "Karim Benzema";
        trabajador.edad = 30;
        trabajador.telefono = 893324452;
        trabajador.salario = 500000;

        System.out.println(trabajador.nombre);
        System.out.println(trabajador.edad);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;

    public Cliente() {
        System.out.println("estoy  en el constructor de Cliente");
    }
}

class Trabajador extends Persona {
    int salario;

    public Trabajador() {
        System.out.println("estoy en el constructor de la clase Trabajador");
    }
}


