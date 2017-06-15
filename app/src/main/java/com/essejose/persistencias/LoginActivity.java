package com.essejose.persistencias;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsuario;
    private EditText etSenha;
    private CheckBox cbContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsuario = (EditText) findViewById(R.id.etNome);
        etSenha = (EditText) findViewById(R.id.etPassword);
        cbContinuar = (CheckBox)  findViewById(R.id.cbContinuar);
        ler();

    }


    public void logar (View v){
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor e = sp.edit();
        if(cbContinuar.isChecked())
        {
            e.putString("usuario",etUsuario.getText().toString());
            e.putString("etSenha",etSenha.getText().toString());
            e.putBoolean("cbContinuar", cbContinuar.isChecked());
        }else{
            e.putString("usuario","");
            e.putString("etSenha","");
            e.putBoolean("cbContinuar", false);
        }

        e.apply();

    }

    private void ler(){
        SharedPreferences sp = getPreferences(MODE_PRIVATE);

        etUsuario.setText(sp.getString("usuario",""));
        etSenha.setText(sp.getString("etSenha",""));
        cbContinuar.setChecked(sp.getBoolean("cbContinuar",false));

    }
}
