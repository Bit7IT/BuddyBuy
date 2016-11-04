package helloworld.buddybuy;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class UserSignUp extends Activity {

    Button btnRegister;
    EditText chooseName, choosePw, confirmPw;

    public void register() {
        btnRegister = (Button) findViewById(R.id.Button_register);
        chooseName = (EditText) findViewById(R.id.EditText_ChooseName);
        choosePw = (EditText) findViewById(R.id.EditText_ChoosePw);
        confirmPw = (EditText) findViewById(R.id.EditText_ConfirmPw);
        //wiring the button
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputNewUsername = chooseName.getText().toString(); // get new username
                String inputNewPW = choosePw.getText().toString(); // get new password
                String inputNewPWConfirm = confirmPw.getText().toString();
                System.out.println("The new username is: " + inputNewUsername); // for testing
                System.out.println("The new password is: " + inputNewPW); // for testing
                System.out.println("The new password confirm is: " + inputNewPWConfirm); // for testing
            }
        });
    } // when user click on the register button

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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up);
        register();
        onPressHideKeyboard(chooseName);
        onPressHideKeyboard(choosePw);
        onPressHideKeyboard(confirmPw);
    }

}
