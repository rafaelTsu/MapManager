package com.example.mapmanager.dao;

import androidx.room.Dao;
import androidx.room.Insert;

import com.example.mapmanager.entities.Usuario;

@Dao
public interface UsuarioDao {
    @Insert
    void registrarUsuario(Usuario usuario);
}
