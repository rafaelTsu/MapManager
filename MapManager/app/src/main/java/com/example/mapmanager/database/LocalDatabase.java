package com.example.mapmanager.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.mapmanager.dao.CidadeDao;
import com.example.mapmanager.dao.EnderecoDao;
import com.example.mapmanager.dao.UsuarioDao;
import com.example.mapmanager.entities.Cidade;
import com.example.mapmanager.entities.Endereco;
import com.example.mapmanager.entities.Usuario;

@Database(entities = {Usuario.class, Cidade.class, Endereco.class}, version = 3)
public abstract class LocalDatabase extends RoomDatabase {
    private static LocalDatabase INSTANCE;
    public static LocalDatabase getDatabase(Context context) {
        if(INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    LocalDatabase.class, "MapManager").allowMainThreadQueries().build();
        }
        return INSTANCE;
    }
    public abstract UsuarioDao usuarioModel();
    public abstract CidadeDao cidadeModel();
    public abstract EnderecoDao enderecoModel();
}