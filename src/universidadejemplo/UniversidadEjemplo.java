/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class UniversidadEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/ulp", "root", "");

//            String sql = "insert into alumno (dni, apellido, nombre, fechaNacimiento, estado)"
//                    + "values (36577322,'Vera','Lucas','1992-01-22',true),"
//                    + "(16589266,'Vera','Gustavo','1964-01-22',true),"
//                    + "(37931523,'Vera','Martin','1993-10-26',true)";
//
//            PreparedStatement ps = conexion.prepareStatement(sql);
//            int filas = ps.executeUpdate();
//            if (filas > 0) {
//                JOptionPane.showMessageDialog(null, "Alumno agregado");
//            }
//String sql = "insert into materia (nombre, año, estado) "
//        + "values ('Programacion 1',2022,true),"
//        + "('Programacion 2',2023,true),"
//        + "('Base de datos',2023,true),"
//        + "('Historia del arte moderno',2023,true)";
//
//PreparedStatement ps = conexion.prepareStatement(sql);
//            int filas = ps.executeUpdate();
//            if (filas > 0) {
//                JOptionPane.showMessageDialog(null, "Materias agregadas");
//            }
//String sql = "insert into inscripcion (nota, idalumno, idmateria) "
//        + "values (9,1,1), (7,1,2), (10,2,1), (8,2,2), (5,3,1), (10,3,3)";
//
//PreparedStatement ps = conexion.prepareStatement(sql);
//            int filas = ps.executeUpdate();
//            if (filas > 0) {
//                JOptionPane.showMessageDialog(null, "Inscripciones realizadas");
//            }
//String sql = "select * from alumno join inscripcion on(alumno.idalumno=inscripcion.idalumno) where nota > 8";
//PreparedStatement ps = conexion.prepareStatement(sql);
//            ResultSet resultado=ps.executeQuery();
//            while   (resultado.next()){
//                
//                System.out.println("ID " +resultado.getInt("idalumno"));
//                System.out.println("DNI " +resultado.getInt("dni"));
//                System.out.println("APELLIDO " +resultado.getString("apellido"));
//                System.out.println("NOMBRE " +resultado.getString("nombre"));
//                System.out.println("FECHA DE NACIMIENTO " +resultado.getDate("fechaNacimiento"));
//                System.out.println("ESTADO " +resultado.getBoolean("estado"));
//            }
//            
            String sql = "delete from inscripcion where idinscripto = 2";
            PreparedStatement ps = conexion.prepareStatement(sql);

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error, driver no cargado correctamente");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión" + ex.getMessage());

        }
    }

}
