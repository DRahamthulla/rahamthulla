package Excepation;

public class DemoForFinally {

        public static void main(String[] args)
        {
            int a=45,b=0,c=0;
            try
            {
                c = a / b;
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("Error : " + Ex.getMessage());
            }
            finally
            {
                System.out.print("The result is : " + c);
            }
        }
    }