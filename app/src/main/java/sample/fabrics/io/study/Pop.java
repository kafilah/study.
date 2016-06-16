package sample.fabrics.io.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.*;
import android.view.View;
import android.widget.*;


/**
 * Created by earlybirdcamp on 6/14/16.
 */
public class Pop extends Activity {


    EditText _location;
    RadioGroup _group;
    RadioGroup _productivity;
    RadioButton _groupChosen;
    RadioButton _productivityChosen;
    EditText _comments;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindow);
//      submit button
        Button b_submit = (Button) findViewById(R.id.submitForm);
        _location = (EditText) findViewById(R.id.location_input);
        _group = (RadioGroup) findViewById(R.id.ppl_group);
        _productivity = (RadioGroup) findViewById(R.id.pro_group);
        _comments = (EditText) findViewById(R.id.notes);
        b_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  if((_group.getCheckedRadioButtonId()) == -1 || _productivity.getCheckedRadioButtonId() == -1)
                {
                   Toast.makeText(getApplicationContext(), "Please fill out the entire form.", Toast.LENGTH_LONG).show();
                }
                else {
                      String mLocation = _location.getText().toString();
                      String mGroup = _groupChosen.getText().toString();
                      String mProd = _productivityChosen.getText().toString();
                      String mComments = _comments.getText().toString();
                      Form form = new Form(mLocation, mGroup, mProd, mComments);
                      form.showMe();

                  }
            }
        });



        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width*.8), (int) (height*.6));
    }

    // radio buttons

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?

        boolean checked = ((RadioButton) view).isChecked();


        // Check which radio button was clicked
        switch (view.getId()) {

            // single or group studying?

            case R.id.ppl_button1:
                if (checked)
                    // Single studying
                    //u.setGroup("single");
                    _groupChosen = (RadioButton) findViewById(_group.getCheckedRadioButtonId());
                    break;
            case R.id.ppl_button2:
                if (checked)
                    // Group studying
                    //u.setGroup("group");
                    _groupChosen = (RadioButton) findViewById(_group.getCheckedRadioButtonId());
                    break;

                // productivity levels?

            case R.id.pro_button1:
                if (checked)
                    // low
                    //u.setProductivity("low");
                    _productivityChosen = (RadioButton) findViewById(_productivity.getCheckedRadioButtonId());
                    break;
            case R.id.pro_button2:
                if (checked)
                    // medium
                    //u.setProductivity("medium");
                    _productivityChosen = (RadioButton) findViewById(_productivity.getCheckedRadioButtonId());
                    break;

            case R.id.pro_button3:
                if (checked)
                    // high
                    //u.setProductivity("high");
                    _productivityChosen = (RadioButton) findViewById(_productivity.getCheckedRadioButtonId());
                    break;
        }

    }

}
