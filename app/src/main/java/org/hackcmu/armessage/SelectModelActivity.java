package org.hackcmu.armessage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import java.util.List;

public class SelectModelActivity extends AppCompatActivity {
    private ImageButton mHeartButton;
    private ImageButton mStarButton;
    private ImageButton mCoffeeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_model);
        setTitle(R.string.title_select_model);

        mHeartButton = findViewById(R.id.heart_button);
        mHeartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectModelActivity.this, EditModelActivity.class);
                startActivity(intent);
            }
        });

        mStarButton = findViewById(R.id.star_button);
        mStarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectModelActivity.this, EditModelActivity.class);
                startActivity(intent);
            }
        });

        mCoffeeButton = findViewById(R.id.coffee_button);
        mCoffeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectModelActivity.this, EditModelActivity.class);
                startActivity(intent);
            }
        });
    }
}
