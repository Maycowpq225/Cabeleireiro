package com.example.CabeleireiroAgendamento1.database;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteAbortException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AgendamentoCabeleireiroOpenHelper extends SQLiteOpenHelper {


    public AgendamentoCabeleireiroOpenHelper(Context context) {
       super(context, "agendamentoCabeleireiro", null, 1);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ScriptDLL.getCreateTableCliente());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
