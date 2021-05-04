package com.example.textcountersample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.textcountersample.utils.ElementsCalculator;

import java.util.ArrayList;

import static com.example.textcountersample.utils.ElementsCalculator.getCharsCount;
import static com.example.textcountersample.utils.ElementsCalculator.getWordsCount;

public class MainActivity extends AppCompatActivity {

    Spinner ddSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ddSelection = (Spinner) findViewById(R.id.ddSelection);
        /*ArrayList<String> selectionOptionsList = new ArrayList<>();
        selectionOptionsList.add("Words");
        selectionOptionsList.add("Chars");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, selectionOptionsList);*/
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this, R.array.words_chars_array, android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.ddSelection.setAdapter(arrayAdapter);
    }

    public void btnCalculateOnClick(View view) {
        EditText edUserInput = findViewById(R.id.edUserInput);
        TextView tvOutput = findViewById(R.id.tvOutput);
        String userInputText = edUserInput.getText().toString();

        String selection = this.ddSelection.getSelectedItem().toString();
        if (edUserInput.getText().toString().trim().length() <=0) {
            int resID = R.string.entry;
            Toast.makeText(this, String.valueOf(resID), Toast.LENGTH_SHORT).show();
            String resValue = getResources().getString(R.string.entry);
            Toast.makeText(this, String.valueOf(resValue), Toast.LENGTH_SHORT).show();
        }

        if(selection.equalsIgnoreCase("Chars")){
            int count = ElementsCalculator.getCharsCount(userInputText);
            tvOutput.setText("Chars: " + String.valueOf(count));
        }

        if(selection.equalsIgnoreCase("Words")){
            int count = ElementsCalculator.getWordsCount(userInputText);
            /*userInputText = userInputText.replace("\n", " ");*/
            String[] userInputTextArray = userInputText.split(" ");
            tvOutput.setText("Words: " + userInputTextArray.length);
        }
    }
}
