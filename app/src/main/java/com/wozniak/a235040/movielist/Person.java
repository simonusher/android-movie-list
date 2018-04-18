package com.wozniak.a235040.movielist;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Szymon on 20.03.2018.
 */

public class Person implements Parcelable{
    private String name;
    private String surname;
    private int age;
    private int photoRId;

    private Person(String name, String surname, int age, int photoRId) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.photoRId = photoRId;
    }

    public Person (Parcel parcel) {
        this.name = parcel.readString();
        this.surname = parcel.readString();
        this.age = parcel.readInt();
    }

    public static boolean isAgeCorrect(int age){
        return age >= 0 && age < 150;
    }

    public static Person createPerson(String name, String surname, int age, int photoRId){
        if(isAgeCorrect(age)){
            return new Person(name, surname, age, photoRId);
        } else {
            throw new IllegalArgumentException("Incorrect age!");
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getPhotoRId() {
        return photoRId;
    }

    @Override
    public String toString() {
        return name + ' ' + surname;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }
}
