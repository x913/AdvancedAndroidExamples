package com.k3kc.advancedandroidexamples;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public class Person implements Parcelable {

    protected Person(String firstName, String lastName, int age, float salary) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
        Salary = salary;
    }

    protected Person(Parcel in) {
        Log.d("AAA", "Reading parcel");

        FirstName = in.readString();
        LastName = in.readString();
        Age = in.readInt();
        Salary = in.readFloat();
    }

    public String FirstName;
    public String LastName;
    public int Age;
    public float Salary;

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {
        Log.d("AAA", "Writing parcel");

        parcel.writeString(FirstName);
        parcel.writeString(LastName);
        parcel.writeInt(Age);
        parcel.writeFloat(Salary);
    }
}
