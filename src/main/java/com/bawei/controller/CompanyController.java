package com.bawei.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.entity.Company;
import com.bawei.service.CompanyService;
import com.github.pagehelper.PageInfo;
import com.shibeichuan.common.utils.FileUtil;
import com.shibeichuan.common.utils.StringUtil;

@Controller
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@RequestMapping("add")
	public String add() {
		List<String> readTextFileToList = FileUtil.readTextFileToList("D:\\专高一\\课上代码\\shibeichuan_week2\\src\\test\\resources\\cms附件-机械设备公司年检信息.txt");
		List<Company> list = new ArrayList<Company>();
		for (String string : readTextFileToList) {
			String[] split = string.split("\t");
			System.out.println(split[0]+"--"+split[1]+"--"+split[2]+"--"+split[3]+"--"+split[4]+"--"+split[5]+"--"+split[6]+"--"+split[7]+"--"+split[8]); 
			if(!StringUtil.isNotNull(split[1])) {
				continue;
			}
			if(!StringUtil.isNotNull(split[2])) {
				continue;
			}
			if(!StringUtil.isNotNull(split[3])) {
				continue;
			}
			if(!StringUtil.isNotNull(split[4])) {
				continue;
			}
			if(!StringUtil.isNotNull(split[5])) {
				continue;
			}
			if(!StringUtil.isNotNull(split[6])||!StringUtil.isNum(split[6])) {
				continue;
			}
			Company company = new Company();
			company.setId(Integer.parseInt(split[0]));
			company.setKeyword(split[1]);
			company.setMessage(split[2]);
			company.setName(split[3]);
			company.setGoods(split[4]);
			company.setAddress(split[5]);
			company.setMoney(Integer.parseInt(split[6]));
			company.setCreatedate(split[7]);
			company.setType(split[8]);
			System.out.println(company);
			list.add(company);
		}
		for (Company company : list) {
			companyService.insert(company);
		}
		return "redirect:list";
	}
	
	@RequestMapping("list")
	public String selects(Company company,Model model,@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "3") Integer pageSize) {
		PageInfo<Company> info = companyService.selects(company,page,pageSize);
		model.addAttribute("info", info);
		model.addAttribute("com", company);
		return "list";
	}
	
	@RequestMapping("toUpdate")
	public String toUpdate(Company company,Model model) {
		Company com = companyService.selectByid(company);
		model.addAttribute("com", com);
		return "update";
	}
	
	@RequestMapping("doUpdate")
	@ResponseBody
	public int doUpdate(Company company) {
		int i = companyService.doUpdate(company);
		return i;
	}
 }
