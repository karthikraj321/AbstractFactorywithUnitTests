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
	void validateSBIAbstractFactoryTest() 
	{
					AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");  
					Bank bank = bankFactory.getBank("SBI");
					Assertions.assertEquals(bank instanceof  Bank,  true);
	}
	@Test
	void validateHDFCAbstractFactoryTest() 
	{
					AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");  
					Bank bank = bankFactory.getBank("HDFC");
					Assertions.assertEquals(bank instanceof  Bank,  true);
	}
	@Test
	void validateICICIAbstractFactoryTest() 
	{
					AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");  
					Bank bank = bankFactory.getBank("ICICI");
					Assertions.assertEquals(bank instanceof  Bank,  true);
	}
	@Test
	void validateBusinessLoanAbstractFactoryTest() 
	{
					AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");  
					Loan loan = loanFactory.getLoan("Business");
					Assertions.assertEquals(loan instanceof  Loan,  true);
	}
	@Test
	void validateEducationLoanAbstractFactoryTest() 
	{
					AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");  
					Loan loan = loanFactory.getLoan("Education");
					Assertions.assertEquals(loan instanceof  Loan,  true);
	}
	@Test
	void validateHomeLoanAbstractFactoryTest() 
	{
					AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");  
					Loan loan = loanFactory.getLoan("Home");
					Assertions.assertEquals(loan instanceof  Loan,  true);
	}

}