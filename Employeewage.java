public class Employeewage
{
        public static void main(String[] args)
        {
                System.out.println("Welcome to Employee Wage Computation Program");
		int fullTime=1;
                int empHr=0;
                int empRatePerHr=20;
                int salary=0;
                int Result=(int)(Math.random()*10)%2;

                System.out.println("Result="+ Result);

        if (Result == fullTime )
                {
                        empHr=8;
                }

        else
                {
                        salary=0;
                }

        salary=empHr*empRatePerHr;
        System.out.println("Salary= " + salary);

        }
}
