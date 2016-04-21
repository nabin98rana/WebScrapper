/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Webscrapper.dao.impl;

import com.leapfrog.Webscrapper.dao.JobsDAO;
import com.leapfrog.Webscrapper.entity.Jobs;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Navin
 */
public class JobsDAOImpl implements JobsDAO {
private List<Jobs> jobList=new ArrayList<>();
    @Override
    public void insert(Jobs t) {
        jobList.add(t);
    }

    @Override
    public List<Jobs> getAll() {
     return jobList;   
    }

    @Override
    public void export(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Jobs> search(String fileName, String content) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
