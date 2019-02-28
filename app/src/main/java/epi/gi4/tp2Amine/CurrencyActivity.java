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

public class CurrencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
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
        final EditText editText =(EditText) findViewById(R.id.ETMonaie);
        final TextView result = (TextView) findViewById(R.id.ResTextMonai);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup RG, int id) {

                if(id == R.id.dinarToEuroRadio){

                    double dinars = Double.parseDouble(editText.getText().toString());
                    double res = dinars * 3.5 ;
                    result.setText(Double.toString(res));


                }

                else if(id == R.id.EuroToDinarRadio)
                {
                    double euros = Double.parseDouble(editText.getText().toString());
                    double res = euros / 3.5 ;
                    result.setText(Double.toString(res));
                }


            }
        });
        Button retour = ( Button) findViewById(R.id.retourButton);
        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent retour = new Intent(CurrencyActivity.this,MainActivity.class);
                startActivity(retour);
            }
        });
    }

}
