package app.huldan.easybusiness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView masuk;
    TextView daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        masuk = (TextView)findViewById(R.id.masuk);
        masuk.setOnClickListener(this);
        daftar = (TextView)findViewById(R.id.daftar);
        daftar.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.masuk:
                Intent explicit = new Intent(MainActivity.this, masuk.class);
                startActivity(explicit);
                break;
            case R.id.daftar:
                Intent mendaftar = new Intent(MainActivity.this, daftar.class);
                startActivity(mendaftar);
                break;
            default:
                break;
        }

    }



}