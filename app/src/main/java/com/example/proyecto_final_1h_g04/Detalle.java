package com.example.proyecto_final_1h_g04;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String matrix[][]=MainActivity.matriz;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        String usuario=Listar.user;
        System.out.println("clap: "+ usuario);
        String usu[]=new String[2];

        for (int i=0;i<matrix.length;i++){
            if (usuario.equals(matrix[i][0])){
                usu=matrix[i];
            }
        }

        TextView txt_user=findViewById(R.id.txt_detalle_usuario);
        txt_user.setText(usu[0]);
        //PASSWORD
        TextView txt_pass=findViewById(R.id.txt_detalle_nombre);
        txt_pass.setText(usu[2]);
        TextView txt_ape=findViewById(R.id.txt_detalle_apellido);
        txt_ape.setText(usu[3]);
        TextView txt_email=findViewById(R.id.txt_detalle_email);
        txt_email.setText(usu[4]);
        TextView txt_celu=findViewById(R.id.txt_detalle_celular);
        txt_celu.setText(usu[5]);
        //FOTO
        TextView txt_sexo=findViewById(R.id.txt_detalle_sexo);
        txt_sexo.setText(usu[7]);
        TextView txt_fechaN=findViewById(R.id.txt_detalle_fechaNacimiento);
        txt_fechaN.setText(usu[8]);
        TextView txt_asign=findViewById(R.id.txt_detalle_asignaturas);
        txt_asign.setText(usu[9]);
        TextView txt_beca=findViewById(R.id.txt_detalle_becado);
        txt_beca.setText(usu[10]);
        getPeticion();

    }

    public void getPeticion(){
        TextView msgGrupo = findViewById(R.id.txtMsgMain);
        MainActivity.getMensaje(msgGrupo);
    }
    public void regresar(View v){
        Intent listar = new Intent(this, Listar.class);
        startActivity(listar);

    }
}
