package com.example.makingdevs.mobile.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import groovy.transform.CompileStatic

import java.util.Random

class MainActivity extends AppCompatActivity {

    ImageView mImageView
    TextView mTextView
    Button mButtonFalse
    Button mButtonTrue
    List<String> names = ["Arturito", "C2pio", "Mejores Amigos", "Vader Cara de Papa"]
    List<Integer> photos = [R.drawable.r2d2, R.drawable.c3po, R.drawable.r2c3, R.drawable.papa]
    Integer currentName = 0
    Integer currentPhoto = 0

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (ImageView) findViewById(R.id.photo);
        mTextView = (TextView) findViewById(R.id.photoName);
        mButtonFalse = (Button) findViewById(R.id.button_false);
        mButtonTrue = (Button) findViewById(R.id.button_true);

        mButtonFalse.onClickListener={ View v ->
            println "Jelouu, it's false <---- !!!! ${v.properties}"
            Toast.makeText(this, "You said false", Toast.LENGTH_SHORT).show()
            updatePhoto()
        }

        mButtonTrue.onClickListener={ View v ->
            println "Jelouu, it's True <---- !!!! ${v.properties}"
            Toast.makeText(this, "You said true", Toast.LENGTH_SHORT).show()
            updatePhoto()
        }

    }

    private void updatePhoto(){
        Integer randomPhoto = new Random().nextInt(3)
        mImageView.setImageResource(photos[randomPhoto])
        Integer randonName= new Random().nextInt(3)
        mTextView.setText(names[randonName])
    }
}
