public class Estudiantes {
    String cedula;
    String nombre;
    int b1;
    int b2;

    public Estudiantes() {
    }

    public Estudiantes(String cedula, int b2, String nombre, int b1) {
        this.cedula = cedula;
        this.b2 = b2;
        this.nombre = nombre;
        this.b1 = b1;
    }

    public String getNombre() {
        return nombre;
    }



    public String getCedula() {
        return cedula;
    }



    public int getB1() {
        return b1;
    }



    public int getB2() {
        return b2;
    }

    public int getPromedio() {
        return (b1+ b2) / 2;
    }


}
