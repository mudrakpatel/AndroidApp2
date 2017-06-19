package apps.mudrak.androidapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {

    TextView textView1;
    Intent intent1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    intent1 = new Intent(getApplicationContext(), Activity2.class);
                    intent1.putExtra("Message","Activity1 message:\n" + textView1.getText().toString());
                    startActivity(intent1);
                } catch(Exception exception){
                    System.out.println("LOOK HERE!\n"+ exception.getMessage());
                }
            }
        });
    }

}
