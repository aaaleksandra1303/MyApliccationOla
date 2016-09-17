package zadanie1.akademiakodu.pl.myapplicationola;

import android.app.Activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

public class MainActivity extends Activity {

    String login = "1";
    String haslo="1";
    @BindView(R.id.buttonLog)
    Button buttonLog;

    @BindView(R.id.textView)
    TextView textView;

    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.checkBox)
    public CheckBox checkBox;
    @BindView(R.id.editTextLogin)
    EditText editTextLogin;
    @BindView(R.id.editTextPassword)
    EditText editTextPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



    }



    @OnClick(R.id.buttonLog)
    public void OnClickLog(View v)
    {
        String localLogin = editTextLogin.getText().toString();
        String localPassword = editTextPassword.getText().toString();


        Intent i = new Intent(this, Panel.class);

        if(localLogin.equals(login)&&localPassword.equals(haslo))
        {


            Toast.makeText(this,"Logowanie przebieglo pomyslnie",Toast.LENGTH_LONG).show();

            i.putExtra("key","Witaj w aplikacji");
            startActivity(i);



        }else

            Toast.makeText(this,"Niestety podane haslo lub login nie sa prawidlowe",Toast.LENGTH_LONG).show();




    }





}
