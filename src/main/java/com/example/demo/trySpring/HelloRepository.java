package com.example.demo.trySpring;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class HelloRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public Map<String, Object> find(int id){
        String query = "SELECT"
                        + " employee_id,"
                        + " employee_name,"
                        + " age"
                        + " FROM employee"
                        + " WHERE employee_id=?";
                        
        Map<String, Object> employeeMap = jdbcTemplate.queryForMap(query,id);
        
        return employeeMap;
    }
}
