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
    /*ToggleButton toggleButton1;*/
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_2);
            /*toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);*/
            textView2 = (TextView) findViewById(R.id.textView2);
            Intent intent = getIntent();
            textView2.setText(intent.getStringExtra("Message"));

/*            //toggleButton1 OnClickListener code
            toggleButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Toast.makeText(getApplicationContext(), "Toggled ON...\nBringing TextView...", Toast.LENGTH_SHORT).show();
                        textView2 = (TextView) findViewById(R.id.textView2);
                        textView2.setVisibility(View.VISIBLE);
                        textView2.setText(importedData.getString("Message"));
                    } else {
                        Toast.makeText(getApplicationContext(), "Toggled OFF...\nHiding TextView...", Toast.LENGTH_SHORT).show();
                        textView2 = (TextView) findViewById(R.id.textView2);
                        textView2.setVisibility(View.INVISIBLE);
                    }
                }
            });*/
        } catch (Exception exception){
            System.out.println("LOOK HERE!\n" + exception.getMessage());
        }
    }
}
