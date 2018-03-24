package com.example.salomoncastro.labo02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView puntoJugador1;
    TextView puntoJugador2;

    TextView setJugador1;
    TextView setJugador2;

    TextView juegoJugador1;
    TextView juegoJugador2;

    Button botonJugador1;
    Button botonJugador2;

    Button reset;

    int pj1=0;
    int pj2=0;

    int sj1=0;
    int sj2=0;

    int jj1=0;
    int jj2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        puntoJugador1=(TextView)findViewById(R.id.puntoJugador1);
        puntoJugador2=(TextView)findViewById(R.id.puntoJugador2);

        setJugador1=(TextView)findViewById(R.id.setJugador1);
        setJugador2=(TextView)findViewById(R.id.setJugador2);

        juegoJugador1=(TextView)findViewById(R.id.juegoJugador1);
        juegoJugador2=(TextView)findViewById(R.id.juegoJugador2);

        botonJugador1=(Button)findViewById(R.id.botonJugador1);
        botonJugador2=(Button)findViewById(R.id.botonJugador2);

        reset=(Button)findViewById(R.id.reset);


        botonJugador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                puntoJugador1.setVisibility(view.VISIBLE);

                puntaje1();
            }
        });
        botonJugador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                puntoJugador2.setVisibility(view.VISIBLE);

                puntaje2();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                puntoJugador1.setVisibility(view.VISIBLE);
                puntoJugador2.setVisibility(view.VISIBLE);

                setJugador1.setVisibility(view.VISIBLE);
                setJugador2.setVisibility(view.VISIBLE);

                juegoJugador1.setVisibility(view.VISIBLE);
                juegoJugador2.setVisibility(view.VISIBLE);

                reset();
            }
        });

    }

    public void puntaje1() {
        if (pj1 < 30) {
            pj1 = pj1 + 15;
        }
        else {
            pj1 = pj1 + 10;
        }
        puntoJugador1.setText(pj1+"");

        if (pj1 > 40){
            jj1 ++;
            pj1 = 0;
        }

        if (jj1 >= 6){
            sj1 ++;
            jj1 = 0;
            pj1 = 0;
        }
        puntoJugador1.setText(pj1+"");
        juegoJugador1.setText(jj1+"");
        setJugador1.setText(sj1+"");
    }

    public void puntaje2() {
        if (pj2 < 30) {
            pj2 = pj2 + 15;
        }
        else {
            pj2 = pj2 + 10;
        }
        puntoJugador2.setText(pj2+"");

        if (pj2 > 40){
            jj2 ++;
            pj2 = 0;
        }

        if (jj2 >= 6){
            sj2 ++;
            jj2 = 0;
            pj2 = 0;
        }
        puntoJugador2.setText(pj2+"");
        juegoJugador2.setText(jj2+"");
        setJugador2.setText(sj2+"");
    }



    public void reset() {
        pj1 = 0;
        pj2 = 0;

        sj1 = 0;
        sj2 = 0;

        jj1 = 0;
        jj2 = 0;

        puntoJugador1.setText(pj1+"");
        puntoJugador2.setText(pj2+"");

        setJugador1.setText(sj1+"");
        setJugador2.setText(sj2+"");

        juegoJugador1.setText(jj1+"");
        juegoJugador2.setText(jj2+"");
    }
}


