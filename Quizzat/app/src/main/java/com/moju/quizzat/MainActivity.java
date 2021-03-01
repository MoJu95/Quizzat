package com.moju.quizzat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.moju.quizzat.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //Activity Main Object containing all the id's of the Views
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = 0;
                if (binding.bboy.getText().toString().equals("Breakdance boy")) {
                    score++;
                }
                if (binding.brnx.isChecked()) {
                    score++;
                }
                if (binding.lilou.isChecked() && binding.hong.isChecked()) {
                    score++;
                }
                if (binding.move.getText().toString().equals("Elbow Freeze")) {
                    score++;
                }
                if (binding.both.isChecked()) {
                    score++;
                }

                Toast.makeText(getApplicationContext(), "you scored " + score + "/5", Toast.LENGTH_SHORT).show();
            }
        });

    }
}