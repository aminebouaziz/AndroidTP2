package epi.gi4.tp2Amine;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class TemperatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        RadioGroup radioGroup =(RadioGroup)findViewById(R.id.radioGroup);
        final EditText editText =(EditText) findViewById(R.id.ETTemp);
        final TextView result = (TextView) findViewById(R.id.resTextTemp);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup RG, int id) {

                if(id == R.id.CToFRadio){

                    double cel = Double.parseDouble(editText.getText().toString());
                    double res = (9/5)*cel +32 ;
                    result.setText(Double.toString(res));


                }

                else if(id == R.id.FToCRadio)
                {
                    double far = Double.parseDouble(editText.getText().toString());
                    double res = (5/9) * far-32 ;
                    result.setText(Double.toString(res));
                }


            }
        });
        Button retour = ( Button) findViewById(R.id.retourButton2);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retour = new Intent(TemperatureActivity.this,MainActivity.class);
                startActivity(retour);
            }
        });

    }

}
