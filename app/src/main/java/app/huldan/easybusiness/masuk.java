package app.huldan.easybusiness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class masuk extends AppCompatActivity implements View.OnClickListener {

    TextView create;
    TextView masukmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);
        create = (TextView)findViewById(R.id.create);
        create.setOnClickListener(this);
        masukmenu = (TextView)findViewById(R.id.masukmenu);
        masukmenu.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.create:
                Intent belumpunyaacc = new Intent(masuk.this, daftar.class);
                startActivity(belumpunyaacc);
                break;
            case R.id.masukmenu:
                Intent menumasuk = new Intent(masuk.this, menu.class);
                startActivity(menumasuk);
                break;
            default:
                break;
        }

    }
}
