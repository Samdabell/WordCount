package com.example.sam.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textToCount;
    Button count;
    TextView countResult;
    TextView wordList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textToCount = (EditText)findViewById(R.id.enter_text);
        count = (Button)findViewById(R.id.count);
        countResult = (TextView)findViewById(R.id.count_result);
        wordList = (TextView)findViewById(R.id.word_list);
    }

    public void onCountClicked(View button){
        String text = textToCount.getText().toString();
        countResult.setText("Word Count = " + WordCount.countString(text));
        wordList.setText(WordCount.wordListString(text));
    }
}
