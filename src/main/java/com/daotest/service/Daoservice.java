package com.daotest.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daotest.dao.Dao;

@Service
public class Daoservice {
	//dao
	@Autowired
	Dao dao;
	
	//select
	public void insert(Map<String, String> d){
		dao.insert(d);
	}
	
	//select
	public ArrayList<HashMap<String, String>> select(){
		return dao.select();
	}
}
