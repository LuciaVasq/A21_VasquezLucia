/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import DTO.ProfileDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erika
 */
public class PerfilDAO {
    private final String URL = "jdbc:mysql://localhost:3306/matchmaker";
    private final String USER = "root";
    private final String PASS = "itson";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public void insertar(ProfileDTO p) {
        String sql = "INSERT INTO perfiles (nombre, apellido, segundo_nombre, fecha_nacimiento, foto, correo, genero, pais, telefono, identificacion, direccion, edad) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, p.getNombre());
            ps.setString(2, p.getApelldoPaterno());
            ps.setString(3, p.getApellidoMaterno());
            ps.setDate(4, new java.sql.Date(p.getFechaNacimiento().getTimeInMillis()));
            ps.setString(5, p.getFoto());
            ps.setString(6, p.getCorreo());
            ps.setString(7, p.getGenero());
            ps.setString(8, p.getPais());
            ps.setString(9, p.getTelefono());
            ps.setString(10, p.getCelular());
            ps.setString(11, p.getDireccion());
            ps.setInt(12, p.getEdad());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<ProfileDTO> buscarPorFiltros(String genero, String pais, int edad) {

        String sql = "SELECT * FROM perfiles WHERE genero = ? AND pais = ? AND edad = ?";

        List<ProfileDTO> lista = new ArrayList<>();

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, genero);
            ps.setString(2, pais);
            ps.setInt(3, edad);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ProfileDTO p = new ProfileDTO(
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("segundo_nombre"),
                    null, 
                    rs.getString("foto"),
                    rs.getString("correo"),
                    rs.getString("genero"),
                    rs.getString("pais"),
                    rs.getString("telefono"),
                    rs.getString("identificacion"),
                    rs.getString("direccion"),
                    rs.getInt("edad")
                );
                lista.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}

