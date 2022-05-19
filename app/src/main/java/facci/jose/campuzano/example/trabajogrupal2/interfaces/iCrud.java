package facci.jose.campuzano.example.trabajogrupal2.interfaces;

public interface iCrud {
    void Guardar(String cedula, String apellidos, String nombres);
    void ConsultaGeneral();
    void editar();
    void eliminar();
}
