package io.javabrains.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AbstractFactoryTests {
	
	@Test
	void validateBankAbstractFactoryTest() 
	{
			
					AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");  
					Assertions.assertTrue(bankFactory instanceof  AbstractFactory);
			
	}
	@Test
	void validateLoanAbstractFactoryTest() 
	{
			
					AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");  
					Assertions.assertTrue(loanFactory instanceof  AbstractFactory);
				
	}
	@Test
	void validateSBIAbstractFactoryTest3() 
	{
					AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");  
					Bank bank = bankFactory.getBank("SBI");
					Assertions.assertEquals(bank instanceof  AbstractFactory, true);
	}
	
	
	
	


}