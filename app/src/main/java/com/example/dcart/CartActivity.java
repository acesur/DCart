package com.example.dcart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CartActivity extends AppCompatActivity {


    private TextView mTextTotal;
    private Button mButtonContinue, mButtonCheckout;
    private RecyclerView recyclerView;
    private DBManipulation mDBManipulation;
    private SPManipulation mSPManipulation;
    private ShoppingCartList itemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        recyclerView = (RecyclerView) findViewById(R.id.cart_container);
        mSPManipulation = SPManipulation.getInstance(this);
    }
}
