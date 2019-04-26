package com.example.emma.labotarea3_00011417;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class New extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4;
    Button btn;
    String texto_aux,texto2,texto3,texto4,union;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        inicializar();

        String dato = getIntent().getStringExtra("dato");
        String dato2 = getIntent().getStringExtra("dato2");
        String dato3 = getIntent().getStringExtra("dato3");
        String dato4 = getIntent().getStringExtra("dato4");
        tv1.setText("Nombre: "+dato);
        tv2.setText("Contraseña: "+dato2);
        tv3.setText("Correo: "+dato3);
        tv4.setText("Sexo: "+dato4);

        texto_aux = tv1.getText().toString();
        texto2 = tv2.getText().toString();
        texto3 = tv3.getText().toString();
        texto4 = tv4.getText().toString();
        union = (""+texto_aux+"\n"+""+texto2+"\n"+texto3+"\n"+texto4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent3 = new Intent();
                m_intent3.setAction(Intent.ACTION_SEND);
                m_intent3.setType("text/plain");
                m_intent3.putExtra(Intent.EXTRA_TEXT,union);
                startActivity(m_intent3);
            }
        });
    }

    public void inicializar()
    {
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        btn = (Button)findViewById(R.id.btn);
    }
}
