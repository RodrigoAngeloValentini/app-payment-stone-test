package com.desbravador.payment.Activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.desbravador.payment.BuildConfig;
import com.desbravador.payment.R;

import java.util.List;

import stone.application.StoneStart;
import stone.user.UserModel;
import stone.utils.Stone;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewVersion = findViewById(R.id.mainTextVersion);
        textViewVersion.setText(BuildConfig.VERSION_NAME);

        init();
    }

    private void init() {
        List<UserModel> userList = StoneStart.init(getApplicationContext());
        Stone.setAppName("DesbravadorPayment");
    }
}