package apps.mudrak.androidapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Activity2 extends AppCompatActivity {
    //Required variables
    ToggleButton toggleButton1;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);

        //toggleButton1 OnClickListener code
        toggleButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getApplicationContext(), "Toggled ON...\nBringing TextView...", Toast.LENGTH_SHORT).show();
                    textView2 = (TextView) findViewById(R.id.textView2);
                    textView2.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(getApplicationContext(), "Toggled OFF...\nHiding TextView...", Toast.LENGTH_SHORT).show();
                    textView2 = (TextView) findViewById(R.id.textView2);
                    textView2.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
    /**
     * @method textView2OnClick
     * @param view
     */
    public void textView2OnClick(View view){
        Toast.makeText(getApplicationContext(), "Starting new activity..." ,Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(), Activity1.class));
    }
}
