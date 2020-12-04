package com.company;
import java.util.Scanner;
public class Main {

public static void main(String[] args) {
 Scanner rd = new Scanner(System.in);
 alumno al = new alumno("201910060216");
 al.setNombre("Erick");

  String info[]= new String[5];
  info[0]="Nombre,Edad,Sexo,Cuenta,Carrera";

            alumno alumnos[];
            alumnos = new alumno[5];

  alumnos[0]=al;
  alumnos[0].getNombre();
  Imprimirinfor(al);

    }
    public static void Imprimirinfor(alumno al){
        System.out.println("Cuentas:"+al.getCuenta()+"\nNombre:"+al.getNombre());
    }
}

