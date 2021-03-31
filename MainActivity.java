package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{ //implements  View.OnClickListener{   //Main~(要和檔案名稱相同)(class name)繼承自Appcompat~(M從A延伸出) + third對外宣告impl~有Onclick的用途實現View介面
    // Object 所有類別的父親
    //TextView tx; //Text和Button為類別 tx bt為參照
    //Button bt;

    @Override //annotation 若要執行onCreate執行這邊的 不要執行AppCompat父類別裡的onCreate
    protected void onCreate(Bundle savedInstanceState) {   //function,函式+protected在封裝內和子類別有效
        super.onCreate(savedInstanceState); //super 要使用父元件(找父親的物件)
        setContentView(R.layout.bookkeeping_constraintlayout);     //呼叫函數,把參數R.layout傳入 //要切換xml檔案都是改括號裡的字 第一次功課為R.layout.activity_main


//        tx = findViewById(R.id.textView); //本來並沒有連線存在 利用此函式Find~ 傳入參數R.id 執行完傳回tx這個參
//      bt = findViewById(R.id.button);
//
//        bt.setOnClickListener(this); //second使用myClickListener third改成this(綁給自己 Main~)
//        tx.setOnClickListener(this);
    }

//    @Override   //third
//    public void onClick(View v) {
//        tx.setTextColor(Color.BLUE);
//    }

//private View.OnClickListener myClickListener = new View.OnClickListener() { //second method
//    @Override
//    public void onClick(View v) {
//        tx.setTextColor(Color.BLUE);
//    }
//};

//    public void onButtonClick(View view) {  //first method ,function View傳入型別view變數名稱(參照)+void為傳回型別代表沒傳任何東西+public為存取修飾子(可被存取的範圍在哪)
//        tx.setTextColor(Color.BLUE);
//    }

}