package com.bawei.dao;

import java.util.List;

import com.bawei.entity.Company;

public interface CompanyDao {

	List<Company> selects(Company company);

	Company selectByid(Company company);

	int doUpdate(Company company);

	int insert(Company company);

}
