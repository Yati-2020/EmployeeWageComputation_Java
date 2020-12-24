class EmpSalary
{
	public static final int isFullTime = 0; //constants
	public static final int isPartTime = 1;
	public static final int empRatePrHr = 20;
	public static final int mothWorkingDay = 20;

	public void empSalary()
	{
		int empHr = 0; //variables
		int perDaySalary = 0;
		int monthlySalary = 0;
		int monthyHrs = 0;

		for (int i = 1;i <= mothWorkingDay && monthyHrs < 100;i++) {
			int Result=(int)Math.floor(Math.random() * 10) % 2;
			switch ((int)Result)
			{
				case isFullTime :
					empHr = 8;
					break;
				case isPartTime :
					empHr = 4;
					break;

			}
			monthyHrs = monthyHrs + empHr;
			System.out.println("working days : "+i);
			System.out.println("monthyHrs wis : "+monthyHrs);
			perDaySalary = empRatePrHr * empHr;
			System.out.println(perDaySalary);
			monthlySalary = perDaySalary + monthlySalary;


		}
		System.out.println("monthly salary"+monthlySalary);

	}
}
public class Employeewage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		EmpSalary empWage = new EmpSalary();
		empWage.empSalary();
	}
}
