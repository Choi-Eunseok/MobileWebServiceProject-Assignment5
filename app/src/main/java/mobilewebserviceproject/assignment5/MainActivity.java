package mobilewebserviceproject.assignment5;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final Calculator calculator = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputA = findViewById(R.id.input_a);
        EditText inputB = findViewById(R.id.input_b);
        TextView result = findViewById(R.id.result);

        bind(R.id.btn_add, '+', inputA, inputB, result);
        bind(R.id.btn_subtract, '-', inputA, inputB, result);
        bind(R.id.btn_divide, '/', inputA, inputB, result);
        bind(R.id.btn_multiply, '*', inputA, inputB, result);
    }

    private void bind(int buttonId, char op, EditText a, EditText b, TextView result) {
        findViewById(buttonId).setOnClickListener(v -> result.setText(
                String.format("결과: %1$s", calculator.describe(a.getText().toString(), b.getText().toString(), op))));
    }
}
