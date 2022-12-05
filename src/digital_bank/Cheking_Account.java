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
public abstract class Cheking_Account extends Account{
    public Cheking_Account(Customer customer) {
		super(customer);
	}

	public void imprimirExtrato() {
		super.printCommonInfo("=== Checking Account Statement ===");
	}
}
