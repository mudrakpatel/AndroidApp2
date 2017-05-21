package apps.mudrak.androidapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }

    public void textView1OnClick(View view){
        Toast.makeText(getApplicationContext(), "Starting new activity..." ,Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(), Activity2.class));
    }
}
