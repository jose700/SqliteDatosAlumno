package facci.jose.campuzano.example.trabajogrupal2.crud;

import android.util.Log;

import facci.jose.campuzano.example.trabajogrupal2.interfaces.iCrud;
import facci.jose.campuzano.example.trabajogrupal2.models.Alumno;

public class AlumnoCRUD implements iCrud {


    @Override
    public void Guardar(String cedula, String apellidos, String nombres) {
        Alumno alumno = new Alumno(
                cedula,
                apellidos,
                nombres);
        alumno.save();
        Log.e("","Se guardo con exito");
    }

    @Override
    public void ConsultaGeneral() {

    }

    @Override
    public void editar() {

    }

    @Override
    public void eliminar() {

    }
}
