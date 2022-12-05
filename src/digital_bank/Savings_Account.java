/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital_bank;

/**
 *
 * @author miguelf03kai
 */
public abstract class Savings_Account extends Account{
    public Savings_Account(Customer customer) {
		super(customer);
	}

	public void imprimirExtrato() {
		super.printCommonInfo("=== Statement Savings Account ===");
	}
}
