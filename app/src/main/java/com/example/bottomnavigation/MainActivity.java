package com.example.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.bottomnavigation.databinding.ActivityMainBinding;
import com.example.bottomnavigation.fragments.CartFragment;
import com.example.bottomnavigation.fragments.HomeFragment;
import com.example.bottomnavigation.fragments.ProductsFragment;
import com.example.bottomnavigation.fragments.ProfileFragment;
import com.example.bottomnavigation.fragments.SettingsFragment;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch (item.getTitle().toString()){
                    case "Home":
                        fragment=new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
                      return true;
                    case "Products":
                        fragment=new ProductsFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
                        return true;
                    case "Settings":
                        fragment =new SettingsFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
                        return true;
                    case "Cart":
                        fragment = new CartFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
                        return true;
                    case "Profile":
                        fragment =new ProfileFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
                        return true;
                }
                return false;
            }
        });
        HomeFragment fragment=new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();

    }
}
