package com.bawei.entity;


public class Company {

	private Integer id;
	private String keyword;
	private String message;
	private String name;
	private String goods;
	private String address;
	private Integer money;
	private String createdate;
	private String type;
	private String startdate;
	private String enddate;
	private Integer minmoney;
	private Integer maxmoney;
	private String beizhu;
	private String time;
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public Integer getMinmoney() {
		return minmoney;
	}
	public void setMinmoney(Integer minmoney) {
		this.minmoney = minmoney;
	}
	public Integer getMaxmoney() {
		return maxmoney;
	}
	public void setMaxmoney(Integer maxmoney) {
		this.maxmoney = maxmoney;
	}
	public Company(Integer id, String keyword, String message, String name, String goods, String address, Integer money,
			String createdate, String type, String startdate, String enddate, Integer minmoney, Integer maxmoney,
			String beizhu, String time) {
		super();
		this.id = id;
		this.keyword = keyword;
		this.message = message;
		this.name = name;
		this.goods = goods;
		this.address = address;
		this.money = money;
		this.createdate = createdate;
		this.type = type;
		this.startdate = startdate;
		this.enddate = enddate;
		this.minmoney = minmoney;
		this.maxmoney = maxmoney;
		this.beizhu = beizhu;
		this.time = time;
	}
	public Company() {
		super();
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", keyword=" + keyword + ", message=" + message + ", name=" + name + ", goods="
				+ goods + ", address=" + address + ", money=" + money + ", createdate=" + createdate + ", type=" + type
				+ ", startdate=" + startdate + ", enddate=" + enddate + ", minmoney=" + minmoney + ", maxmoney="
				+ maxmoney + ", beizhu=" + beizhu + ", time=" + time + "]";
	}
	
}
