package com.joeso.retrofitplusrxjavatranslator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private MainActivityViewModel mViewModel ;
    String phone;
    String code;
    TextView tvUser;
    EditText txUserName;
    EditText txPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        tvUser=findViewById(R.id.result);
        txUserName=findViewById(R.id.user_name);
        txPass=findViewById(R.id.password);


        mViewModel= ViewModelProviders.of(this).get(MainActivityViewModel.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phone=txUserName.getText().toString();
                code=txPass.getText().toString();
                callApiGetUser(phone,code);
            }
        });
    }

    private void setUserTextView(User user){
        tvUser.setText(user.getFirstName()+" "+user.getLastName());
    }

    private void callApiGetUser(String phone,String code) {
        mViewModel.login(phone,code).observe(this, result -> {
            if (result != null ) {
                setUserTextView(result);
            } else {
                Toast.makeText(getApplicationContext(),"fail to get data",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
