package com.example.egidijusgecius.test_autoparcel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	public static final String TEST_POJO = "TEST_POJO";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.goToDetailActivity).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				PojoToParcel pojo = PojoToParcel.create("egis");

				Intent intent = new Intent(MainActivity.this, DetailActivity.class);
				intent.putExtra(TEST_POJO, pojo);
				startActivity(intent);
			}
		});
	}

}
