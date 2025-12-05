/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.GregorianCalendar;

/**
 *
 * @author erika
 */
public class ProfileDTO {
    private String nombre;
    private String apelldoPaterno;
    private String apellidoMaterno;
    private GregorianCalendar fechaNacimiento;
    private String foto;
    private String correo;
    private String genero;
    private String pais;
    private String telefono;
    private String celular;
    private String direccion;
    private int edad;

    public ProfileDTO(String nombre, String apelldoPaterno, String apellidoMaterno, GregorianCalendar fechaNacimiento, String foto, String correo, String genero, String pais, String telefono, String celular, String direccion, int edad) {
        this.nombre = nombre;
        this.apelldoPaterno = apelldoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.foto = foto;
        this.correo = correo;
        this.genero = genero;
        this.pais = pais;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.edad = edad;
    }

    public ProfileDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldoPaterno() {
        return apelldoPaterno;
    }

    public void setApelldoPaterno(String apelldoPaterno) {
        this.apelldoPaterno = apelldoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
