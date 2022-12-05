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
public interface IAccount {
    void withdraw_money(double value);
	
    void cash_deposite(double value);

    void transfer_money(double value, IAccount destinationAccount);

    void print_statement();
}
