class Bank {
	
	public static void main(String args[]){
		/*
		Bank b = new Bank();
		
		double interest1 = b.calculateInterest(10000, 10);
		double interest2 = b.calculateInterest(15000, 20);
		double interest3 = b.calculateInterest(4500, 2);
		
		double totalInterest =  interest1 + interest2 + interest3;
		System.out.println("Total Interst: "+totalInterest);
		*/
		
		String name = "Veridic Solutions";
		int size = name.length();
		for(int i = size-1; i>=0; i = i - 1){
			char c = name.charAt(i);
			System.out.print(c);
		}
		
	}

	double calculateInterest(double amount, double roi){
		double interest = amount * roi /100;
		System.out.println("Interst: "+interest);
		return interest;
	}

}