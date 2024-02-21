package com.tnsif.collegeservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class College {

	@Entity
	public class college {
		private Integer c_companyid;
		private String c_companyname;
		private String c_skills;
		private Integer c_salarypackage;

		public college() {
			super();
		}
		
		public college(Integer c_companyid, String c_companyname, String c_skills, Integer c_salarypackage) {
			super();
			c_companyid = c_companyid;
			c_companyname = c_companyname;
			c_skills = c_skills;
			c_salarypackage = c_salarypackage;
		}
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		public Integer getc_companyid() {
			return c_companyid;
		}
		public void setc_companyid(Integer c_companyid) {
			c_companyid = c_companyid;
		}
		public String getc_companyname() {
			return c_companyname;
		}
		public void setc_companyname(String c_companyname) {
			c_companyname = c_companyname;
		}
		public String getc_skills() {
			return c_skills;
		}
		public void setc_skills(String c_skills) {
			c_skills = c_skills;
		}
		public Integer getc_salarypackage() {
			return c_salarypackage;
		}
		public void setc_salarypackage(Integer c_salarypackage) {
			c_salarypackage = c_salarypackage;
		}
		@Override
		public String toString()
		{
			return "college[college companyid:"+c_companyid+" college conpanyname"+c_companyname+" college skils"+c_skills+" college salarypackage"+c_salarypackage+"]";
		}
	}

}
