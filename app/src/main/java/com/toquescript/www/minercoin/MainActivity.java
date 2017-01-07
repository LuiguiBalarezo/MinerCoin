package com.toquescript.www.minercoin;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import baseclass.BaseAppCompatActivity;
import fragments.FragmentForgotPassword;
import fragments.FragmentSignIn;
import fragments.FragmentSignUp;

public class MainActivity extends BaseAppCompatActivity {

    Fragment fragment_signin, fragment_signup, fragment_forgot_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);
        initInstanceFragments();

        /*Inicializa el Framelayout Contenedor*/
        initContainerFragment(R.id.container_main);

        /*Clases, Metodos Asociados a Goggle*/
        if (savedInstanceState == null) {
            transactionFragment(fragment_signin, null, "add", false);
        }


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void initInstanceFragments() {
        super.initInstanceFragments();
        fragment_signin = new FragmentSignIn();
        fragment_signup = new FragmentSignUp();
        fragment_forgot_password = new FragmentForgotPassword();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
