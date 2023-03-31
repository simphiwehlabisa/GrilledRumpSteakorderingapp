package com.example.grilledrumpsteakorderingapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.grilledrumpsteakorderingapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;

    TextView salaryTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        salaryTextView = findViewById(R.id.salaryTextView);


        GrilledRumpSteak steak1 = new GrilledRumpSteak("large", 1, 1, 2);
        GrilledRumpSteak steak2 = new GrilledRumpSteak("medium", 0, 1, 0);
        GrilledRumpSteak steak3 = new GrilledRumpSteak("large", 0, 0, 1);

        GrilledRumpSteakOrder order = new GrilledRumpSteakOrder();
        order.addSteak(steak1);
        order.addSteak(steak2);
        order.addSteak(steak3);

        // Display the total cost of the order
        double total = order.calcTotal();
        salaryTextView.setText("cost of the order: R" + total);


    }


}