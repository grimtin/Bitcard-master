package bitcard.cosc431.bitcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickLogin(View view){
    Intent intent = new Intent(this, UserAreaActivity.class);
    startActivity(intent);
}
    public void clickSignUp(View view) {
    Intent intent = new Intent(this, RegisterActivity.class);
    startActivity(intent);
 }


}
