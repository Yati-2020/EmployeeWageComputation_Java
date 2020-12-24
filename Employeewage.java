public class Employeewage
{
        public static void main(String[] args)
        {
//UC_2
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

                System.out.println("Checking if Employee is Present or Absent" );
                int Present=1;
                int empCheck=(int)Math.floor(Math.random()*10) % 2;
                //System.out.println("Random value "+empCheck);

                if(empCheck==Present)
                {
                        System.out.println("Employee is present");
                }

                else
                {
                        System.out.println("Employee is absent");
                }
//main
        }
}

