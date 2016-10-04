package com.example.lenovo.pepcolaudacity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int votes =0;
    int cokeVotes=0;
    int pepsiVotes=0;


    public void SumVotesPepsi(View view){
        votes = votes +1;
        pepsiVotes=pepsiVotes+1;
    }
    public void SumVotesCoca(View view){
        votes=votes+1;
        cokeVotes = cokeVotes+1;

    }

    public void showTotal(View view){
        setTotal(votes);
    }

    public void setTotal(int total){
        TextView t = (TextView) findViewById(R.id.total);
        t.setText(""+ total);
    }

    public void whoWon(View view){
        if(pepsiVotes > cokeVotes){
            champ(pepsiVotes ,'p');
        }else{
            champ(cokeVotes,'c');
        }

    }

    public void champ(int total ,char i){
        TextView t = (TextView) findViewById(R.id.won);
        if (i=='p'){
            t.setText("Pepsi Won "+ total);
        }else{
            t.setText("Coca-Cola Won " + total);
        }

    }
}
