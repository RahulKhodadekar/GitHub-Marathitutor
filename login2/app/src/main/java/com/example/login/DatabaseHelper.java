package com.example.login;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DB_Name = "NHA.db";
    public static final int version = 1;
    public static final String Table_Name1 = "logincred";
    public static final String column1 = "username";
    public static final String column2 = "password";


    public DatabaseHelper(Context context) {
        super(context, DB_Name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table logincred (username VARCHAR,password VARCHAR)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Table_Name1);
        onCreate(db);
    }

    public void addCredentials(String id, String pass) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(column1,id);
        contentValues.put(column2, pass);
        db.insert(Table_Name1, null, contentValues);
        Log.e("Database Entry","SUCCESSFUL");
    }

    public Cursor getLoginId() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cr=db.rawQuery("select "+column1+" from "+Table_Name1,null);
        return cr;
    }
    public Cursor getPassword() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cr=db.rawQuery("select "+column2+" from "+Table_Name1,null);
        return cr;
    }

    public void deleteCredentials() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(Table_Name1, null, null);
    }


}

