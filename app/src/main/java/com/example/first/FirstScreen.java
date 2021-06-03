package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstScreen extends AppCompatActivity {

    //khai báo biến
    boolean checkSingle;
    int number = 0;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        //khai báo + ánh xạ view
        Button testButton = findViewById(R.id.btnClick);
        EditText edtName = findViewById(R.id.edtName);

        //sự kiện của button
        //sẽ được chạy khi click vào button
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //lấy giá trị của edittext khi nhập dữ liệu
                name = edtName.getText().toString();

                //lấy ký số ký tự được nhập
                number = name.length();

                if (name.length() == 4 || name.length() == 5){
                    checkSingle = true;
                } else {
                    checkSingle = false;
                }
                //khai báo biến intent để chuyển activity
                Intent intent = new Intent(FirstScreen.this, SecondScreen.class);

                //putExtra dùng để chuyển dữ liệu từ activity này sang activity kia
                intent.putExtra("name", name);
                intent.putExtra("number", number);
                intent.putExtra("single", checkSingle);

                //khởi chạy
                startActivity(intent);
            }
        });
    }
}