package fahri.fars.id.finalprojectiak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView text1 = (TextView) findViewById(R.id.TVAbout);
        text1.setText("This application is made just to meet the needs in the final projet held to complete the needs in workshops conducted by the Android Kejar Indonesia for Beginner class. Less and more of these apps are made solely to qualify for graduation in those classes. This app is not for publication or for other activities other than Andoir Kejar Indonesia. For his attention, I as the developer of this application say a lot of gratitude.\n");
    }

    public void Okay(View view) {

        finish();

        Toast.makeText(about.this, "Ready To Start The Quiz?",
                Toast.LENGTH_LONG).show();
    }
}
