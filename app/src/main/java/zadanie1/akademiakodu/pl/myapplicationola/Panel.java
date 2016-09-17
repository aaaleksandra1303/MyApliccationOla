package zadanie1.akademiakodu.pl.myapplicationola;

import android.app.Activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.icu.util.DateInterval;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Panel extends Activity {

    @BindView(R.id.textView)
    TextView textView;

    @BindView(R.id.buttonLogOut)
    Button buttonLog;
    @BindView(R.id.buttonAnimacja)
    Button buttonAnimacja;
    @BindView(R.id.buttonFragment)
    Button buttonFragment;
    @BindView(R.id.buttonWeb)
    Button buttonWeb;
    @BindView(R.id.buttonToast1)
    Button buttonToast1;
    @BindView(R.id.buttonToast2)
    Button buttonTost2;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);
        ButterKnife.bind(this);

        Intent i = getIntent();
        if(i.hasExtra("key"))
        {
            String response = i.getStringExtra("key");
            textView.setText(response);


        }
    }


    @OnClick(R.id.buttonToast1)
    public void ClickOnButtonToast1(View v)
    {
        Toast.makeText(this,"Niestety ten przycisk nie ma jeszcze przypisanego zadania, za utrudnienia przepraszamy", Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.buttonToast2)
    public void ClickOnButtonToast2(View v)
    {
        Toast.makeText(this,"TAK, dzialam! Hurrrra!!! :D ", Toast.LENGTH_LONG).show();
    }

    Dialog imageDialog;

    @OnClick(R.id.buttonAnimacja)

    //TODO zrobic progres Dailog dla obrazka
            public void OnAnimationClick(View v)
    {
        imageDialog = new Dialog(this);
        imageDialog.setContentView(R.layout.image_layout);
        imageDialog.setTitle("Obrazek");
        imageDialog.show();

        Button localButton = ButterKnife.findById(imageDialog,R.id.buttonImageOut);
        localButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageDialog.dismiss();
            }
        });


    }

    @OnClick(R.id.buttonLogOut)
    public void CickLogOut(View v)
    {
        Intent n = new Intent(this, MainActivity.class);
        startActivity(n);


    }





    }




