package com.wipro.DateTime;

public class ThrowDemo {
	static void checkMonth(int month) throws InvalidMonthException {
		if(month>=1 && month <=12) {
			System.out.println(month +" is a valid month");
		}
		else {
			throw new InvalidMonthException("Invalid month");
			
		}
	}
	public static void main(String[] args) {
		try {
		checkMonth(129);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
	
	
}
//Custom exception class
class InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}
