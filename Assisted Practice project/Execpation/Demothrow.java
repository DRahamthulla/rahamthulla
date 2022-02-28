package Excepation;

public class Demothrow {

        public static void main(String[] args)
        {

            int a=45,b=69,rs;

            try
            {
                if(b==0)        
                    throw(new ArithmeticException("Can't divide by zero."));
                else
                {
                    rs = a / b;
                    System.out.print("The result is : " + rs);
                }
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("Error : " + Ex.getMessage());
            }

            System.out.print("End of program.");
        }
}
