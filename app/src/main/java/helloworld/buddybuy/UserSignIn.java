package helloworld.buddybuy;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class UserSignIn extends Activity {

    Button btnNext;
    EditText name;
    EditText pw;


    public void goNext() {
        btnNext = (Button) findViewById(R.id.btnNext);
        name = (EditText) findViewById(R.id.EditText_EnterName);
        pw = (EditText) findViewById(R.id.EditText_EnterPw);
        //wiring the button
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputUsername = name.getText().toString(); // get username
                String inputPW = pw.getText().toString(); // get password
                System.out.println("The username is: "+inputUsername); // for testing
                System.out.println("The password is: "+inputPW); // for testing
            }
        });
    } // when user click on the next button


    public void onPressHideKeyboard(EditText editText){
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /*hide keyboard
            If press any else where on screen, (need clickable="true" & focusableInTouchMode="true" in base layer xml)
            */
            @Override
            public void onFocusChange(View v, boolean hasFocus) { // if focus has changed
                if (!hasFocus) {
                    InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
        });

    }// Other presses, hide keyboard


    @Override
    protected void onCreate(Bundle savedInstanceState) { // main for UserSign In
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_in); // connect & bring out to layout xml
        goNext(); // run goNext function
        onPressHideKeyboard(name);
        onPressHideKeyboard(pw);

    }

}
