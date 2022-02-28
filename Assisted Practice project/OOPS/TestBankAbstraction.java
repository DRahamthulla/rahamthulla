package OOPS;

abstract class BankAbstraction{    
abstract int getRateOfInterest();    
}    
class SBI extends BankAbstraction{    
int getRateOfInterest(){return 7;}    
}    
class PNB extends BankAbstraction{    
int getRateOfInterest(){return 8;}    
}    
    
public class TestBankAbstraction{    
public static void main(String args[]){    
BankAbstraction b;  
b=new SBI();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
b=new PNB();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
}}    