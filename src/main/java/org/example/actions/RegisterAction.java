package org.example.actions;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

    private String nombre;
    private String apellidos;
    private String curso;

    // Getters and setters for all properties
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String execute() {
        // Logic to process form data (can be replaced with database persistence)
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Curso: " + curso);

        // You could potentially store the data in a database here

        return SUCCESS;
    }
}