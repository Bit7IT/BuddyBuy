package helloworld.buddybuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    public Button btnSignUp;


    public void runSignUpFunc(){
        btnSignUp =(Button)findViewById(R.id.btnSignUp);
        //wiring the button
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,UserSignUp.class); // go to the User Sign up Screen
                startActivity(intent);
            }
        });
    }//for SignUp button

    public void runSignInFunc() {
        btnSignUp = (Button) findViewById(R.id.btnSignIn);
        btnSignUp.setOnClickListener(new View.OnClickListener() { //wiring the button
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, UserSignIn.class); // go to the User Sign up Screen
                startActivity(intent);
            }
        });
    }//for SignIn button


    @Override
    protected void onCreate(Bundle savedInstanceState) { //main for main
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        runSignInFunc();
        runSignUpFunc();
    }


}
