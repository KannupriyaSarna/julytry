package com.scuti.testingdemo;

public class EcommerceDemo {
	
	public static void main(String[] args) {
		
		SignUp signup = new SignUp();
		signup.SignUpAccount();
		//String url = Constants.HTTP_ECOMMERCE_SAIPRATAP_NET;
		
		ProductPage product = new ProductPage();
		product.product();
	
	}
	}
