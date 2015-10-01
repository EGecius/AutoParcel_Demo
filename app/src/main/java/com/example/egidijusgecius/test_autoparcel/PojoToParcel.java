package com.example.egidijusgecius.test_autoparcel;

import android.os.Parcelable;

import auto.parcel.AutoParcel;

/**
 * Single Responsibility:
 *
 * Simple demonstration of a POJO implementing @AutoParcel
 */
@AutoParcel
abstract class PojoToParcel implements Parcelable {

	abstract String getName();

	static PojoToParcel create(String name) {
		return new AutoParcel_PojoToParcel(name);
	}
}
