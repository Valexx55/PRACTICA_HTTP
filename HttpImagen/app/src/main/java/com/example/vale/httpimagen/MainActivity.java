package com.example.vale.httpimagen;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DescargaImagenes di = new DescargaImagenes(this);

       // GARBAGE COLLECTOR

        try
        {
            di.execute("http://www.hrsanroque.com/galeria/slider/18.jpg");
        }
        catch (Throwable t)
        {
            Log.e(getClass().getCanonicalName(), "Error descargando la imagen", t);
        }

       /* CalculaLetraDni cl = new CalculaLetraDni();


        try
        {
            cl.execute();
        }
        catch (Throwable t)
        {
            Log.e(getClass().getCanonicalName(), "Error", t);
        }*/


    }

    public void setImagen (Bitmap bitmap)
    {
        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageBitmap(bitmap);

    }

}
