import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.*;
import java.security.PublicKey;
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/estudiantes2024a";
        String user = "root";
        String password = "2004";

        List<Estudiantes> estudiantes = new ArrayList<>();

        String query = "SELECT * FROM estudiantes";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conectado a la base de datos");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                String cedula = resultSet.getString("cedula");
                int bimestreUno = resultSet.getInt("b1");
                int bimestreDos = resultSet.getInt("b2");

                Estudiantes estudiante = new Estudiantes(cedula,bimestreDos,nombre,bimestreUno);
                estudiantes.add(estudiante);
            }

            for (Estudiantes estudiante : estudiantes) {
                System.out.println("Nombre: " + estudiante.getNombre() +
                        ", Cedula: " + estudiante.getCedula() +
                        ", Bimestre 1: " + estudiante.getB1() +
                        ", Bimestre 2: " + estudiante.getB2() +
                        ", Promedio: " + estudiante.getPromedio());
            }
        } catch (SQLException ex) {
            System.out.println("Error de los datos!." + ex.getMessage());
        }




    }
}