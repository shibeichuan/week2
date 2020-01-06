package com.bawei.service;

import com.bawei.entity.Company;
import com.github.pagehelper.PageInfo;

public interface CompanyService {

	PageInfo<Company> selects(Company company, Integer page, Integer pageSize);

	Company selectByid(Company company);

	int doUpdate(Company company);

	int insert(Company company);

}
