public class Employeewage
{
        public static void main(String[] args)
        {
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
        }
}

