package bitcard.cosc431.bitcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);
    }
    public void clickOnWallet(View view){
        Intent intent = new Intent(this, WalletActivity.class);
        startActivity(intent);
    }
    public void clickOnPrice(View view){
        Intent intent = new Intent(this, PriceIndexActivity.class);
        startActivity(intent);
    }
    public void clickOnHistory(View view){
        Intent intent = new Intent(this, AccountHistoryActivity.class);
        startActivity(intent);
    }
    public void clickOnSettings(View view){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}
