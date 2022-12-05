/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital_bank;

import java.util.List;

/**
 *
 * @author miguelf03kai
 */
public class Bank {
    private String name;
	private List<Account> accounts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setContas(List<Account> accounts) {
		this.accounts = accounts;
	}
}
