package kh.edu.app.myproject.lc_luncher.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Mork Pin on 6/20/2017.
 */

public class DBOperations extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="LC.db";
    public static final String TABLE_NAME="tblLC";
    public DBOperations(Context context) {

        super(context, DATABASE_NAME,null, 1);
        Log.d("Database Operations","Database is created");
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="create table "+TABLE_NAME+"(USERNAME TEXT, DOB TEXT, GENDER TEXT, PHONE_NUMBER INT, PASSWORD TEXT );";
        db.execSQL(sql);
        Log.d("Database Operations","Table is created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String username, String dob,String gender, String Phonenumber, String password){
        SQLiteDatabase SQ= getWritableDatabase();
        ContentValues cv=new ContentValues();

        cv.put("USERNAME",username);
        cv.put("DOB",dob);
        cv.put("GENDER",gender);
        cv.put("PHONE_NUMBER",Phonenumber);
        cv.put("PASSWORD",password);
        long result=SQ.insert(TABLE_NAME,null,cv);
        Log.d("Database Operations","one row is inserted");
        if(result==-1)
            return false;
        else
            return true;
    }

    /*public Cursor getData(){
        SQLiteDatabase SQ= getReadableDatabase();
        Cursor cursor=SQ.rawQuery("select * from"+TABLE_NAME,null);
        return cursor;
    }*/

    public User login(String _phnomnumber, String password) {
        SQLiteDatabase SQ = getReadableDatabase();
        String condition = "_username = ? and _password = ?";
        String[] conditionArguments = {_phnomnumber, password};
        Cursor cursor = SQ.query("tblUser", null, condition, conditionArguments, null, null, null);
        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            //int id=cursor.getInt(0);
            User user = new User(_phnomnumber, password);
            cursor.close();
            return user;
        } else {
            cursor.close();
            return null;
        }
    }
}
