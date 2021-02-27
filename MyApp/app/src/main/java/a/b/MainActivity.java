package a.b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertCmToInches(View v){

        TextView textCm = findViewById(R.id.CmInput);
        String cmString = textCm.getText().toString();
        System.out.println(cmString);
        double cmDouble;
        try {
            cmDouble = Double.valueOf(cmString);
        }catch (Exception e){
            return;
        }
        double inchesDouble = cmDouble / 2.54;
        String inchesString = Double.toString(inchesDouble);
        TextView textInch = findViewById(R.id.InchesInput);
        textInch.setText(inchesString);
    }

    public void convertInchesToCm(View v){

        TextView textInches = findViewById(R.id.InchesInput);
        CharSequence inchesSequence = textInches.getText();
        String inchesString = inchesSequence.toString();
        double inchesDouble;
        try {
            inchesDouble = Double.valueOf(inchesString);
        }catch (Exception e){
            return;
        }
        double cmDouble = inchesDouble * 2.54;
        String cmString = Double.toString(cmDouble);
        TextView textCm = findViewById(R.id.CmInput);
        textCm.setText(cmString);
    }
}