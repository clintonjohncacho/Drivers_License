package com.example.driverslicense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    EditText name, add, nation, sex, bday, weight, height, lno, edate, acode, btype, ecolor, res, con;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.Name);
        add = findViewById(R.id.Address);
        nation = findViewById(R.id.Nation);
        sex= findViewById(R.id.Sex);
        bday = findViewById(R.id.Bday);
        weight = findViewById(R.id.Weight);
        height = findViewById(R.id.Height);
        lno =findViewById(R.id.LId);
        edate = findViewById(R.id.ExDate);
        acode = findViewById(R.id.ACode);
        btype = findViewById(R.id.BType);
        ecolor = findViewById(R.id.EColor);
        res = findViewById(R.id.Restrict);
        con = findViewById(R.id.Con);
    }

    public void btnfunction(View view) {
        String Name = name.getText().toString();
        String Add = add.getText().toString();
        String Nation = nation.getText().toString();
        String Sex = sex.getText().toString();
        String Bday= bday.getText().toString();
        String Weight= weight.getText().toString();
        String Height =height.getText().toString();
        String Lno = lno.getText().toString();
        String Edate = edate.getText().toString();
        String Acode = acode.getText().toString();
        String BType = btype.getText().toString();
        String EColor = ecolor.getText().toString();
        String Res = res.getText().toString();
        String Condition = con.getText().toString();

         if (Name.contains("CACHO, CLINTON JOHN TORRES"))
        {
            Intent intent = new Intent(this,License1.class);
            intent.putExtra("NAME",Name);
            intent.putExtra("NATION",Nation);
            intent.putExtra("SEX",Sex);
            intent.putExtra("BDAY",Bday);
            intent.putExtra("WEIGHT",Weight);
            intent.putExtra("HEIGHT",Height);
            intent.putExtra("ADDRESS",Add);
            intent.putExtra("LNO",Lno);
            intent.putExtra("EDATE",Edate);
            intent.putExtra("ACODE",Acode);
            intent.putExtra("BTYPE",BType);
            intent.putExtra("ECOLOR",EColor);
            intent.putExtra("RES",Res);
            intent.putExtra("CON",Condition);
            startActivity(intent);

        }


        else if (Name.contains("SALAMANCA, JAY-M JACINTO"))
        {
            Intent intent1 = new Intent(this,License2.class);
            intent1.putExtra("NAME",Name);
            intent1.putExtra("NATION",Nation);
            intent1.putExtra("SEX",Sex);
            intent1.putExtra("BDAY",Bday);
            intent1.putExtra("WEIGHT",Weight);
            intent1.putExtra("HEIGHT",Height);
            intent1.putExtra("ADDRESS",Add);
            intent1.putExtra("LNO",Lno);
            intent1.putExtra("EDATE",Edate);
            intent1.putExtra("ACODE",Acode);
            intent1.putExtra("BTYPE",BType);
            intent1.putExtra("ECOLOR",EColor);
            intent1.putExtra("RES",Res);
            intent1.putExtra("CON",Condition);
            startActivity(intent1);
        }

        else if (Name.contains("LAMADRID, ANGELO CALUNDAN"))
        {
            Intent intent2 = new Intent(this,License3.class);
            intent2.putExtra("NAME",Name);
            intent2.putExtra("NATION",Nation);
            intent2.putExtra("SEX",Sex);
            intent2.putExtra("BDAY",Bday);
            intent2.putExtra("WEIGHT",Weight);
            intent2.putExtra("HEIGHT",Height);
            intent2.putExtra("ADDRESS",Add);
            intent2.putExtra("LNO",Lno);
            intent2.putExtra("EDATE",Edate);
            intent2.putExtra("ACODE",Acode);
            intent2.putExtra("BTYPE",BType);
            intent2.putExtra("ECOLOR",EColor);
            intent2.putExtra("RES",Res);
            intent2.putExtra("CON",Condition);
            startActivity(intent2);
        }
        else if (Name.contains("BASA, JULIE ANN CARBONEL"))
        {
            Intent intent3 = new Intent(this,License4.class);
            intent3.putExtra("NAME",Name);
            intent3.putExtra("NATION",Nation);
            intent3.putExtra("SEX",Sex);
            intent3.putExtra("BDAY",Bday);
            intent3.putExtra("WEIGHT",Weight);
            intent3.putExtra("HEIGHT",Height);
            intent3.putExtra("ADDRESS",Add);
            intent3.putExtra("LNO",Lno);
            intent3.putExtra("EDATE",Edate);
            intent3.putExtra("ACODE",Acode);
            intent3.putExtra("BTYPE",BType);
            intent3.putExtra("ECOLOR",EColor);
            intent3.putExtra("RES",Res);
            intent3.putExtra("CON",Condition);
            startActivity(intent3);
        }

        else if((Name.length()==0) && (Nation.length()==0) && (Sex.length()==0) && (Bday.length()==0)&& (Weight.length()==0)&& (Height.length()==0)&& (Add.length()==0)&& (Lno.length()==0)
                && (Edate.length()==0)&& (Acode.length()==0)&& (BType.length()==0)&& (EColor.length()==0)&& (Res.length()==0)&& (Condition.length()==0))
        {
            Intent intent4 = new Intent(this,NoData.class);
            startActivity(intent4);
        }
        else if(Name.length()==0)
        {
            Toast.makeText(getApplicationContext(), "Empty Name", Toast.LENGTH_SHORT).show();
        }

        else {
            MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);
            builder.setTitle("Error!");
            builder.setMessage("Do you want to try again?");
            builder.setIcon(R.drawable.question);

            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {

                }
            });

            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                finishAffinity();
                }
            });

            builder.show();

        }



    }
}