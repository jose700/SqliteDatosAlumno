package facci.jose.campuzano.example.trabajogrupal2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import facci.jose.campuzano.example.trabajogrupal2.crud.AlumnoCRUD;
import facci.jose.campuzano.example.trabajogrupal2.models.Alumno;

public class MainActivity extends AppCompatActivity {

    EditText cedula,apellidos,nombres;
    Button btnGuardar, btnVerDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        cedula =findViewById(R.id.cedula);
        apellidos= findViewById(R.id.apellidos);
        nombres= findViewById(R.id.nombres);
        btnGuardar=findViewById(R.id.btnGuardar);
        btnVerDatos=findViewById( R.id.btnVerDatos );

btnGuardar.setOnClickListener( new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        AlumnoCRUD alumnoCRUD = new AlumnoCRUD();
        alumnoCRUD.Guardar(
                cedula.getText().toString(),
                apellidos.getText().toString(),
                nombres.getText().toString());
    }
        } );
    }
}