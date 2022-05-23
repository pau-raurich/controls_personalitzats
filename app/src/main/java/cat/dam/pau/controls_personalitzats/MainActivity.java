package cat.dam.pau.controls_personalitzats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    public LinearLayout llayout_content;
    public ToggleButton tgbtn_dayNight;
    public Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout llayout_content = (LinearLayout) findViewById(R.id.llayout_content);
        ToggleButton tgbtn_dayNight = (ToggleButton) findViewById(R.id.tgbtn_dayNight);
        
        tgbtn_dayNight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(tgbtn_dayNight.isChecked()){
                    llayout_content.setBackgroundColor(0xff000000 + Integer.parseInt(intToHex(16777215),16));
                }else{
                    //(color negre)
                    llayout_content.setBackgroundColor(0xff000000 + Integer.parseInt(intToHex(0),16));
                }
            }
        });

    }

    public String intToHex(int value){
        String hexVal = Integer.toHexString(value);

        return hexVal;
    }
}