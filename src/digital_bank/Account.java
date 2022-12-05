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
public abstract class Account implements IAccount {
    private static final int STANDARD_AGENCY = 1;
	private static int SEQUENCE = 1;

	protected int agency;
	protected int number;
	protected double balance;
	protected Customer customer;

	public Account(Customer customer) {
		this.agency = Account.STANDARD_AGENCY;
		this.number = SEQUENCE++;
		this.customer = customer;
	}

	@Override
	public void withdraw_money(double valor) {
		balance -= valor;
	}

	@Override
	public void cash_deposite(double valor) {
		balance += valor;
	}

	@Override
	public void transfer_money(double value, IAccount destinationAccount) {
		this.withdraw_money(value);
		destinationAccount.cash_deposite(value);
	}

	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	protected void printCommonInfo(String title) {
		String msg = title+"\n"+
                             "Titular: "+this.customer.getName()+"\n"+
                             "Agencia: "+this.agency+"\n"+
                             "Numero: "+this.number+"\n"+
                             "Saldo: "+this.balance;
	}
}
