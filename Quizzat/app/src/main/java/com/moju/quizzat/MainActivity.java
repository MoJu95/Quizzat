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
        binding.submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = 0;
                if (binding.bboyEditText.getText().toString().equalsIgnoreCase("Breakdance boy")) {
                    score++;
                }
                if (binding.bronxRadioButton.isChecked()) {
                    score++;
                }
                if (binding.lilouCheckbox.isChecked() && binding.hongCheckbox.isChecked() && !binding.wingCheckbox.isChecked()) {
                    score++;
                }
                if (binding.moveEditText.getText().toString().equalsIgnoreCase("Elbow Freeze")) {
                    score++;
                }
                if (binding.danceAndSportRadio.isChecked()) {
                    score++;
                }
                if (score > 0){
                    Toast.makeText(getApplicationContext(), "you scored " + score + "/5", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), R.string.no_right_answers, Toast.LENGTH_SHORT).show();
                }
            }
            });

        }
    }
