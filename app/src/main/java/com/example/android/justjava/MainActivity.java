package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int quantity;
    private int price = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void increment(View view) {

        quantity++;
        display(quantity);

    }

    public void decrement(View view) {
        if (quantity > 0) {
            quantity--;
            display(quantity);
        }
    }

    public void submitOrder(View view) {
        int total = price*quantity;
        diplayPrice(total);
    }

    private void diplayPrice(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.price);
        quantityTextView.setText("$" + number);
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
}

