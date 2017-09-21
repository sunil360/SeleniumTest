
class A
    {
        public void display()
        {
           System.out.println("A");
        }
    }

    class B extends A
    {
        public void display()
        {
            System.out.println("B");
        }
    }

    class Program
    {
        public static void main(String[] args)
        {
            A a = new B();
            a.display();
         
        
            
        }
    }