package com.cg.pwa.service;

import com.cg.pwa.bean.Account1;
import com.cg.pwa.exception.AccountException;

public interface IAccountService {
	
	
	boolean validateMobileNo(String mobileNo) throws AccountException;
	
	boolean validateName(String name) throws AccountException;
	
	boolean validateEmailId(String emailId) throws AccountException;
	
	boolean validatetAmount(double Amount) throws AccountException;
	
	
	
	
	Account1 createAccount(Account1 acc) throws AccountException;
	
	double showBalance(String mobileNo) throws AccountException;
	
	double depositAmount(String mobileNo,double depositAmount) throws AccountException;
	
	double withdrawAmount(String mobileNo,double withdrawAmount) throws AccountException;
	
	double fundTransfer(String mobileNo1,String mobileNo2,double amount) throws AccountException;
	
	Account1 printTransaction(String mobileNo) throws AccountException;



}
