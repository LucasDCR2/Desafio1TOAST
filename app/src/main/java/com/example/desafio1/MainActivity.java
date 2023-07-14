package com.example.desafio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Log log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log.i ("Método (CallBack)", "onCreate");
        showToast("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        log.i ("Método (CallBack)", "onStart");
        showToast("onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        log.i ("Método (CallBack)", "onPause");
        showToast("onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        log.i ("Método (CallBack)", "onResume");
        showToast("onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        log.i ("Método (CallBack)", "onStop");
        showToast("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        log.i ("Método (CallBack)", "onRestart");
        showToast("onRestart");
    }

    @Override
    public void onBackPressed() {
        showToast("onDestroy");
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        log.i ("Método (CallBack)", "onDestroy");
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
