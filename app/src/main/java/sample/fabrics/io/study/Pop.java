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

        User u = new User();

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//         submit button
        Button b_submit = (Button) findViewById(R.id.submitForm);

//        b_submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                startActivity(new Intent(MainActivity.this,Pop.class));
//                Toast.makeText(getApplicationContext(), "You clicked me!", Toast.LENGTH_LONG).show();
//
//            }
//        });

            super.onCreate(savedInstanceState);

            setContentView(R.layout.popwindow);

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
                    u.setGroup("single");
                    break;
            case R.id.ppl_button2:
                if (checked)
                    // Group studying
                    u.setGroup("group");
                    break;

                // productivity levels?

            case R.id.pro_button1:
                if (checked)
                    // low
                    u.setProductivity("low");
                    break;
            case R.id.pro_button2:
                if (checked)
                    // medium
                    u.setProductivity("medium");
                    break;

            case R.id.pro_button3:
                if (checked)
                    // high
                    u.setProductivity("high");
                    break;
        }

    }

    }
