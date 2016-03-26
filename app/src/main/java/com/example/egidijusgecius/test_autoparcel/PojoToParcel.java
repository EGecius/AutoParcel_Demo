package com.example.egidijusgecius.test_autoparcel;

import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import auto.parcel.AutoParcel;

/**
 * Single Responsibility:
 *
 * Simple demonstration of a POJO implementing @AutoParcel
 */
@AutoParcel
abstract public class PojoToParcel implements Parcelable {

	@NonNull abstract String name();
	@Nullable abstract String surname();

	public static PojoToParcel create(String name, String surname) {
		return new AutoParcel_PojoToParcel(name, surname);
	}
}
