package Resources;

public class TestData {

	// Valid registeration data-
	
		
		public static String firstname="rahul";
		public static String lastname="rahul";
		public static String telephone="9889567089";
		public static String password="abcd@1234";
		public static String confirmPassword="abcd@1234";
		
	    public static String regisgterationSuccessExpected="//h1[text()='Your Account Has Been Created']";
		
	    public static String loginExpectedText="My Account"; 
	    
	    public static String loginErrorTextExpected="Warning: No match for E-Mail Address and/or Password.";
	    public static String firstNameExpectedText="First Name must be between 1 and 32 characters!";
	    public static String lastNameExpectedText="Last Name must be between 1 and 32 characters!";
	    public static String EmailExpectedText="E-Mail Address does not appear to be valid!";
	    public static String telephoneExpectedText="Telephone must be between 3 and 32 characters!"; 
	    public static String passwordExpectedText="Password must be between 4 and 20 characters!"; 
	    public static String privacypolicyExpectedText="Warning: You must agree to the Privacy Policy!"; 

		
	    
}
