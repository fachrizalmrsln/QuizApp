package fahri.fars.id.finalprojectiak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class your_profile extends AppCompatActivity {

    String from;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_profile);
    }

    public void Done(View view) {

        try {

            EditText ET1 = (EditText) findViewById(R.id.ETName_Profile);
            name = ET1.getText().toString();

            EditText ET2 = (EditText) findViewById(R.id.ETFrom_Profile);
            from = ET2.getText().toString();

            Intent intent = new Intent(getBaseContext(), checking.class);
            intent.putExtra("From", from);
            intent.putExtra("Name", name);

            Toast.makeText(your_profile.this, "Your profile has been save!",
                    Toast.LENGTH_LONG).show();
            startActivity(intent);

        } catch (Exception e) {
            Toast.makeText(your_profile.this, "Input your Name and Age first!",
                    Toast.LENGTH_LONG).show();
        }
    }

}