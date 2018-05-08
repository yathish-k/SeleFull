package challenges;

    interface Printable{  
    void print(); 
    void show();
    }  
    interface Showable{  
    void show();  
    }  
    public class MultipleInheritance implements Printable,Showable{  
    public void print(){System.out.println("Hello");}  
    public void show(){System.out.println("Welcome");}  
      
    public static void main(String args[]){  
    	MultipleInheritance obj = new MultipleInheritance();  
    obj.print();  
    obj.show();  
     }  
    }  