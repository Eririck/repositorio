package com.company;
class alumno {
                private String telefono;
                private double estatura;
                private String cuenta;
                private String nombre;
                private int edad;

public alumno(String cuenta) {
      this.cuenta = cuenta;
      System.out.println("Constructor con parametros");
}
    public alumno(){
       System.out.println("Constructor sin parametros");
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
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
