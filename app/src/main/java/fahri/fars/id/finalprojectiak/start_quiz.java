package fahri.fars.id.finalprojectiak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class start_quiz extends AppCompatActivity {

    public TextView question, name;
    private String[] mQuestion;
    private String[] Answer;
    private int CurrentQuestion = 0;
    private RadioButton answer_A, answer_B, answer_C, answer_D;
    private String[] Option_A;
    private String[] Option_B;
    private String[] Option_C;
    private String[] Option_D;
    private Button btnNext, btnGo;
    private RadioGroup rg_answer;
    private static int mScore = 0;
    private LinearLayout lv, lv2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);

        Initialise();
    }

    public void Initialise() {
        mQuestion = new String[]{"1. What is the name of this application?", "2. What is typical of this application?",
                "3. Which one of the following that you see when you first open the Application?", "4. How much option did you see on the first page of this Application?",
                "5. Where did you practice about AndroidStudio?", "6. What color did you see on this application?", "7. Who is Mark Zuckerberg ?", "8. Who is the first president of Indonesia ?",
                "9. When is Indonesian independence occurred ?", "10. How many senses do humans have ?"};
        Answer = new String[]{"B", "A", "D", "C", "A", "D", "C", "A", "B", "C", ""};
        Option_A = new String[]{"Go-jek", "Quiz", "Hint", "4", "Udacity.com", "Red", "Microsoft Founder", "Ir. Soekarno", "1920", "8", ""};
        Option_B = new String[]{"Parampah", "Games", "Report", "5", "Facebook.com", "Yellow", "Instagram Founder", "Bj. Habibie", "1945", "6", ""};
        Option_C = new String[]{"Baidu Cleaner", "Online Shop", "Contact Us", "3", "Twitter.com", "Purple", "Facebook Founder", "Ir. Joko Widodo", "1980", "5", ""};
        Option_D = new String[]{"Quiz", "Forum", "Help", "8", "Instagram.com", "Green", "Youtube Founder", "Mochamad Ridwan Kamil ", "1944", "4", ""};


        lv = findViewById(R.id.lv1);
        lv2 = findViewById(R.id.lv2);
        /*name = (TextView) findViewById(R.id.name);*/
        question = findViewById(R.id.TVQuestion_start_quiz);
       /* score = (TextView) findViewById(R.id.score);*/
        rg_answer = findViewById(R.id.RG1_start_quiz);
        answer_A = findViewById(R.id.RBA_start_quiz);
        answer_B = findViewById(R.id.RBB_start_quiz);
        answer_C = findViewById(R.id.RBC_start_quiz);
        answer_D = findViewById(R.id.RBD_start_quiz);
        btnNext = findViewById(R.id.BT1_start_quiz);
        btnGo = findViewById(R.id.mulai);

        lv.setVisibility(View.INVISIBLE);

        btnGo.setOnClickListener(new View.OnClickListener() {

            @Override


            public void onClick(View view) {
                lv.setVisibility(View.VISIBLE);
                lv2.setVisibility(View.INVISIBLE);
                showQuestion();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (CurrentQuestion < 10) {
                    showQuestion();

                } else {
                    
                    Toast.makeText(start_quiz.this, mScore + " Points",
                            Toast.LENGTH_LONG).show();
                }

                if (checkAnswer().equals(Answer[CurrentQuestion].toUpperCase())) {
                    mScore = mScore + 10;
                } else {
                    mScore =+ 0;
                }

            }
        });
    }

    public void showQuestion() {

        question.setText(mQuestion[CurrentQuestion]);
        answer_A.setText(Option_A[CurrentQuestion]);
        answer_B.setText(Option_B[CurrentQuestion]);
        answer_C.setText(Option_C[CurrentQuestion]);
        answer_D.setText(Option_D[CurrentQuestion]);
        rg_answer.clearCheck();
        CurrentQuestion++;
    }

    private String checkAnswer() {
        switch (rg_answer.getCheckedRadioButtonId()) {

            case R.id.RBA_start_quiz:
                return "A";
            case R.id.RBB_start_quiz:
                return "B";
            case R.id.RBC_start_quiz:
                return "C";
            case R.id.RBD_start_quiz:
                return "D";
        }

        return "";
    }

}
