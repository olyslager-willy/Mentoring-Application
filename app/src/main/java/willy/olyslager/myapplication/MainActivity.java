package willy.olyslager.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView counterTxt;
    private Button minusBtn;
    private Button plusBtn;
    private Button resetBtn;
    private int counter;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
        





    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterTxt = (TextView) findViewById(R.id.counterTxt);
        minusBtn = (Button) findViewById(R.id.minusBtn);
        minusBtn.setOnClickListener(clickListener);
        plusBtn = (Button) findViewById(R.id.plusBtn);
        plusBtn.setOnClickListener(clickListener);
        resetBtn = (Button) findViewById(R.id.resetBtn);
        resetBtn.setOnClickListener(clickListener);
        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });
        initCounter();

    }

    private void initCounter() {
            counter = 0;
            counterTxt.setText(counter);
    }

    private void plusCounter() {
            counter++;
            counterTxt.setText(counter);
    }

    private void minusCounter(){
            counter--;
            counterTxt.setText(counter);
    }










    }
};
