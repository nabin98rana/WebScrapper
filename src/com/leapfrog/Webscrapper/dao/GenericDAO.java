/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Webscrapper.dao;

import java.util.List;

/**
 *
 * @author Navin
 */
public interface GenericDAO<T> {
    void insert(T t);
    List<T>getAll();
    void export(String fileName);
    List<T> search(String fileName,String content);
    
}
