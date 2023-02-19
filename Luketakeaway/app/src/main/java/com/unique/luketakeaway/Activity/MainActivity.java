package com.unique.luketakeaway.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.unique.luketakeaway.R;
import com.unique.luketakeaway.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        replaceFragment(new HomeFragment());

        binding.bottomNavBar.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
//                    replaceFragment(new HomeFragment());
                    break;
                case R.id.myBag:
                    break;
                case R.id.myOrders:
                    break;
                case R.id.notifications:
                    break;
            }
            return true;
        });
    }


    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame,fragment);
        fragmentTransaction.commit();
    }

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(MainActivity.this,MyOrdersActivity.class);
//                startActivity(intent);
//            }
//        },3000);

}





































