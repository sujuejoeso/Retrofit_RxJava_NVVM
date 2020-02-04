package com.joeso.retrofitplusrxjavatranslator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private MainActivityViewModel mViewModel ;
    String phone="0405060890";
    String code="1111";
    TextView tvUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        tvUser=findViewById(R.id.result);
        mViewModel= ViewModelProviders.of(this).get(MainActivityViewModel.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callApiGetUser();
            }
        });
    }

    private void setUserTextView(User user){
        tvUser.setText(user.getFirstName()+" "+user.getLastName());
    }

    private void callApiGetUser() {
        mViewModel.login(phone,code).observe(this, result -> {
            if (result != null ) {
                setUserTextView(result);
            } else {
                Toast.makeText(getApplicationContext(),"fail to get data",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
