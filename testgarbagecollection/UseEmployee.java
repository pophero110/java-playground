package testgarbagecollection;

class UseEmployee {
	public static void main(String[] args)
	{
		Employee E = new Employee("GFG1", 56);
		Employee F = new Employee("GFG2", 45);
		Employee G = new Employee("GFG3", 25);
		E.show();
		F.show();
		G.show();
		E.showNextId();
		F.showNextId();
		G.showNextId();

		{
			// It is sub block to keep
			// all those interns.
			Employee X = new Employee("GFG4", 23);
			Employee Y = new Employee("GFG5", 21);
			X.show();
			Y.show();
			X.showNextId();
			Y.showNextId();
			X = Y = null;
			System.gc();
			System.runFinalization();
		}
		E.showNextId();
	}
}