package org.example.actions;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
    private String nombre;
    private String apellidos;
    private String curso;

    // Métodos Getter y Setter
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

    @Override
    public String execute() {
        // Lógica para procesar los datos de inscripción (p. ej., guardar en BD)
        System.out.println("Datos recibidos: Nombre = " + nombre + ", Apellidos = " + apellidos + ", Curso = " + curso);
        return SUCCESS;
    }
}
