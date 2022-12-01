/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.santiagocabanzo.model;

import java.util.List;

/**
 *
 * @author santi
 */
public interface IDao {
    String save(RegistroProgramaDto u);
    String update(RegistroProgramaDto u);
    String delete(String id);
    RegistroProgramaDto getById(String id);
    List<RegistroProgramaDto> getAll();
}
