package com.tecmm.agendatel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.secondFragment);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.firstFragment:
                        startActivity(new Intent(getApplicationContext(), Compra.class));
                            overridePendingTransition(0,0);
                            return true;
                    case R.id.secondFragment:
                        return true;

                    case R.id.thirdFragment:
                        startActivity(new Intent(getApplicationContext(), Pedidos.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });







    }//onCreate




    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_menu, menu);
        return true;
    }




public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.TopaddContacto:
                 return true;


            default:
                return super.onOptionsItemSelected(item);


        }

}






}

