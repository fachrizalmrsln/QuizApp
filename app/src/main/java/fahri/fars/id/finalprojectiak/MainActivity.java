package fahri.fars.id.finalprojectiak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void RLStart_Quiz_Main(View view) {

        Intent your_profile = new Intent(this, your_profile.class);
        startActivity(your_profile);
    }

    public void RLHelp_Main(View view) {

        Intent help = new Intent(this, help.class);
        startActivity(help);
    }

    public void RLAbout_Main(View view) {

        Intent about = new Intent(this, about.class);
        startActivity(about);
    }
}

