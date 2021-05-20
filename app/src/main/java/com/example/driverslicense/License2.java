package com.example.driverslicense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class License2 extends AppCompatActivity {

    TextView name, add, nation, sex, bday, weight, height, lno,edate,acode,btype,ecolor,res,condition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license2);


        name = findViewById(R.id.FullName);
        nation = findViewById(R.id.VNationality);
        sex = findViewById(R.id.VSex);
        bday = findViewById(R.id.VBday);
        weight = findViewById(R.id.VWeight);
        height = findViewById(R.id.VHeight);
        add= findViewById(R.id.VAddress);
        lno= findViewById(R.id.VLNo);
        edate = findViewById(R.id.VEDate);
        acode = findViewById(R.id.VACode);
        btype = findViewById(R.id.VBType);
        ecolor = findViewById(R.id.VEColor);
        res = findViewById(R.id.VRestriction);
        condition = findViewById(R.id.VCon);

        Intent intent = getIntent();
        String fullname = intent.getStringExtra("NAME");
        name.setText(fullname);
        String nationality = intent.getStringExtra("NATION");
        nation.setText(nationality);
        String Sex = intent.getStringExtra("SEX");
        sex.setText(Sex);
        String Dbirth = intent.getStringExtra("BDAY");
        bday.setText(Dbirth);
        String Weight = intent.getStringExtra("WEIGHT");
        weight.setText(Weight);
        String Height = intent.getStringExtra("HEIGHT");
        height.setText(Height);
        String Add = intent.getStringExtra("ADDRESS");
        add.setText(Add);
        String Lno = intent.getStringExtra("LNO");
        lno.setText(Lno);
        String Edate = intent.getStringExtra("EDATE");
        edate.setText(Edate);
        String Acode = intent.getStringExtra("ACODE");
        acode.setText(Acode);
        String Btype = intent.getStringExtra("BTYPE");
        btype.setText(Btype);
        String Ecolor = intent.getStringExtra("ECOLOR");
        ecolor.setText(Ecolor);
        String Res = intent.getStringExtra("RES");
        res.setText(Res);
        String conds = intent.getStringExtra("CON");
        condition.setText(conds);
    }

    public void btn2function(View view) {

        Intent intent3 = new Intent(this,MainActivity.class);
        startActivity(intent3);
    }
}