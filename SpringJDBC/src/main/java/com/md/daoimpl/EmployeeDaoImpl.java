package com.md.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.md.dao.EmployeeDao;
import com.md.entity.Employee;
import com.md.rowmapper.EmployeeRowMapper;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	public int insert(Employee emp) {
		String sql= "insert into Employee values(?,?,?)";
        int result=jdbcTemplate.update(sql, emp.getId(), emp.getName(), emp.getAge());
		return result;
	}

	public int update(Employee emp) {
		String sql= "update Employee set name=?, age=? where id=?";
        int result=jdbcTemplate.update(sql, emp.getName(), emp.getAge(), emp.getId());
		return result;
	}

	public int delete(int id) {
		String sql="delete from Employee where id=?";
		int result= jdbcTemplate.update(sql,id);
		return result;
	}

	public Employee readById(int id) {
		String sql="select * from Employee where id=?";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		Employee result= jdbcTemplate.queryForObject(sql, rowmapper, id);
		return result;
	}

	public List<Employee> readAll() {
		String sql="select * from Employee";
		EmployeeRowMapper rowmapper = new EmployeeRowMapper();
		List<Employee> result= jdbcTemplate.query(sql, rowmapper);
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
