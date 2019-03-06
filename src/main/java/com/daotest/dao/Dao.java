package com.daotest.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import commons.Db;

@Component
public class Dao {
	//insert
	public void insert(Map<String, String> d) {
		String sql = String.format("INSERT INTO spr_test2 VALUES (SQ_spr_test2.NEXTVAL, '%s', %s)",
				d.get("s_name"),d.get("s_age"));
		Db.executeUpdate(sql);
		
	}
	
	//select
	public ArrayList<HashMap<String, String>> select() {
		return Db.selectListMap("SELECT * FROM spr_test2 ORDER BY S_NUM DESC");
	}

}
