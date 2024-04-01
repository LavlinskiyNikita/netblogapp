package com.example.netblog;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.netblog.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    MainFragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new MainFragment());
        NavigationBar();



    }
    public void NavigationBar() {
        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.home) {
                replaceFragment(new MainFragment());
            } else if (item.getItemId() == R.id.add){
                replaceFragment(new AddPostFragment());
            } else if (item.getItemId() == R.id.profile) {
                replaceFragment(new ProfileUserFragment());
            }
            return true;
        });
    }
    private void replaceFragment(Fragment fragmenet) {
        FragmentManager fragamentManager = getSupportFragmentManager();
        FragmentTransaction fragmrntTransaction = fragamentManager.beginTransaction();
        fragmrntTransaction.replace(R.id.frameLayout, fragmenet);
        fragmrntTransaction.commit();
    }
}