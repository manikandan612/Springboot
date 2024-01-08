package com.ebrain.springboot.training.demotraining.dto;

public class User {
		private static String name;
		private static String email;
		private static String mobile;
		private static Double income;
		
		public static String getName() {
			return name;
		}
		public void setName(String name) {
			User.name = name;
		}
		public static String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			User.email = email;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			User.mobile = mobile;
		}
		public Double getIncome() {
			return income;
		}
		public void setIncome(Double income) {
			User.income = income;
		}
}
