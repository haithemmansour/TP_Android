package com.example.toast1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private TextView mShowCount2;
    public static final String EXTRA_MESSAGE =
            ".MESSAGE";
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp(View view) {

        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        Intent intent = new Intent(this, SecondActivity.class);

        String message = mShowCount.getText().toString();

        intent.putExtra(EXTRA_MESSAGE,message);
        mCount++;
        startActivity(intent);

    }

}