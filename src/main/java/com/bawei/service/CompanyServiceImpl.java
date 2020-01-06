package com.bawei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.CompanyDao;
import com.bawei.entity.Company;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;

	@Override
	public PageInfo<Company> selects(Company company, Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Company> list = companyDao.selects(company);
		return new PageInfo<Company>(list);
	}

	@Override
	public Company selectByid(Company company) {
		return companyDao.selectByid(company);
	}

	@Override
	public int doUpdate(Company company) {
		return companyDao.doUpdate(company);
	}

	@Override
	public int insert(Company company) {
		return companyDao.insert(company);
	}
}
