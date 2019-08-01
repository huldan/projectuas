package app.huldan.easybusiness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class daftar extends AppCompatActivity implements View.OnClickListener {

    TextView acc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        acc = (TextView)findViewById(R.id.acc);
        acc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.acc:
                Intent sudahpunyaacc = new Intent(daftar.this, masuk.class);
                startActivity(sudahpunyaacc);
                break;
            default:
                break;
        }

    }
}
