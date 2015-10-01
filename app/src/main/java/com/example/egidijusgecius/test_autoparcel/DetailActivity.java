package com.example.egidijusgecius.test_autoparcel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);

		PojoToParcel pojo = getIntent().getExtras().getParcelable(MainActivity.TEST_POJO);

		TextView textView = (TextView) findViewById(R.id.text_view);
		textView.setText(pojo.getName());
	}
}
