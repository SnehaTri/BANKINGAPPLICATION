



package baaank;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

class AccountNotFoundException extends Exception
{
    String errorMessage;
    AccountNotFoundException(String str)
    {
        errorMessage=str;
    }
    public String toString()
    {
     return (errorMessage) ;
    }
}



public class baankTest {
    
    Baaank b;
    
    public baankTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        b = new Baaank();
    }
    
    @After
    public void tearDown() {
    }
    
         @Test
    public void testAddAccount() {
    
        assertEquals(0,b.addAccount("Snehila"));
    }
    
     @Test
    public void testDeposite() {
    try{
   
        assertEquals(5000,b.deposite(0,5000));
    }
    catch(AccountNotFoundException e)
            {
                //do nothing
            }
    }
    
     @Test
    public void testWithdraw() {
    try{    
        assertEquals(3000,b.withdraw(0,2000));
    }
    catch(AccountNotFoundException e)
            {
                //do nothing
            }
    }
    
     @Test
    public void testTransfer() {
    try{    

        assertEquals(2000,b.transfer(0,1,1000));
    }
    catch(AccountNotFoundException e)
            {
                //do nothing
            }
    }

}
