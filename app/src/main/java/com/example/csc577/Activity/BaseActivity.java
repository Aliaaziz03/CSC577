package com.example.csc577.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.csc577.R;
import com.google.firebase.auth.FirebaseAuth;

public class BaseActivity extends AppCompatActivity {
FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}