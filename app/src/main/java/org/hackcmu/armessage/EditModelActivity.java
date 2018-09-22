package org.hackcmu.armessage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EditModelActivity extends AppCompatActivity {

    private ImageButton mAddTextButton;
    private Button mPreviewButton;
    private Button mPostButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_model);
        setTitle(R.string.title_edit_model);

        mAddTextButton = findViewById(R.id.add_text_button);
        mAddTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditModelActivity.this, AddTextActivity.class);
                startActivity(intent);
            }
        });

        mPreviewButton = findViewById(R.id.preview_button);
        mPreviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditModelActivity.this, PreviewModelActivity.class);
                startActivity(intent);
            }
        });

        mPostButton = findViewById(R.id.post_button);
        mPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditModelActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
