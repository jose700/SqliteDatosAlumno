package facci.jose.campuzano.example.trabajogrupal2.models;

import com.orm.SugarRecord;

public class Alumno extends SugarRecord<Alumno> {

    String Cedula;
    String Apellidos;
    String Nombres;

    public Alumno(){
    }

    public Alumno(String cedula, String apellidos, String nombres){
       this.Cedula = cedula;
       this.Apellidos = apellidos;
        this.Nombres= nombres;

    }
}