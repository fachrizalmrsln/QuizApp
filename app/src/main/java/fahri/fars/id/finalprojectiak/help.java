package fahri.fars.id.finalprojectiak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        TextView help = findViewById(R.id.TVHelp);
        help.setText("* This application is made just to meet the needs in the final projet held to complete the needs in workshops conducted by the Android Kejar Indonesia for Beginner class.\n" +
                "* First of all you are expected to input profile first in the \"Your Profile\" section.\n" +
                "* After that you are expected to answer 10 of the questions in the \"Start Quiz\"\n" +
                "* You will be declared graduated if able to get the value of 60 upwards, it means able to answer at least 6 questions from the 10 questions correctly");
    }

    public void Helpful (View view){

        finish();

        Toast.makeText(help.this, "Feel Better To Start The Quiz?",
                Toast.LENGTH_LONG).show();
    }

}
