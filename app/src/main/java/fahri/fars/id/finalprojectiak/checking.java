package fahri.fars.id.finalprojectiak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.Toast;

public class checking extends AppCompatActivity {

    CheckBox CB1;
    CheckBox CB2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checking);

        CB1 = (CheckBox) findViewById(R.id.CB1_checking);
        CB2 = (CheckBox) findViewById(R.id.CB2_checking);

        String a = getIntent().getStringExtra("Name");
        String b = getIntent().getStringExtra("From");
        CB1.setText("Your name is " + a);
        CB2.setText("Your city on " + b);
    }

    public void BT1_checking(View view) {

        Intent BT1 = new Intent(this, start_quiz.class);
        startActivity(BT1);
        Toast.makeText(checking.this, "Good Luck!",
                Toast.LENGTH_LONG).show();


    }
}
