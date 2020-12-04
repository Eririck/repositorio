package com.company;
class docente {
    private String telefono;
    private double clase;
    private String cuenta;
    private String nombre;

    public docente (String cuenta) {
        this.cuenta = cuenta;
        System.out.println("Constructor con parametros");
    }
    public docente (){
        System.out.println("Constructor sin parametros");
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getEstatura() {
        return clase;
    }
    public void setEstatura(double estatura) {
        this.clase = estatura;
    }
    public String getCuenta() {
        return cuenta;
    }
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
