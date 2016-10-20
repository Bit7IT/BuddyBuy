package helloworld.buddybuy;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserSignIn extends Activity {

    Button btnNext;
    EditText name;
    EditText pw;


    public void goNext() {
        btnNext = (Button) findViewById(R.id.btnNext);
        name = (EditText) findViewById(R.id.EdittxtName);
        pw = (EditText) findViewById(R.id.EdittxtPw);
        //wiring the button
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputNum = name.getText().toString();
                //int inputNum = Integer.parseInt(name.getText().toString());
                pw.setText(inputNum);
                System.out.println(inputNum);

            }
        });
    }//for Next button


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_in);
        goNext();

    }

}
