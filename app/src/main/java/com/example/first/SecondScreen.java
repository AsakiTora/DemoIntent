package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondScreen extends AppCompatActivity {

    //khai báo
    TextView tvName, tvNumber, tvSex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        //ánh xạ view
        tvName = findViewById(R.id.tvName);
        tvNumber = findViewById(R.id.tvNumber);
        tvSex = findViewById(R.id.tvSex);

        //khai báo biến nhận dữ liệu
        Intent intent = getIntent();

        //biến lưu trữ dữ liệu
        String name = intent.getStringExtra("name");
        int number = intent.getIntExtra("number", 0);
        boolean sex = intent.getBooleanExtra("single", true);

        //gán dữ liệu hiển thị cho textview
        tvName.setText(name);
        tvNumber.setText(number+""); //textview sẽ nhận giá trị là chuỗi (String) nên phải + với 1 chuỗi rỗng

        if (sex == true){
            tvSex.setText("nam");
        } else {
            tvSex.setText("nữ");
        }
    }

    public void back(View view) {
        //1 kiểu khai báo khác của intent
        startActivity(new Intent(this, FirstScreen.class));
    }
}