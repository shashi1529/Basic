public class ExecutionOrder {

    ExecutionOrder(int i){
        System.out.println("In One Argument Contructor");
    }

    ExecutionOrder(){
        System.out.println("In No Argument Contructor");
    }

    static{
        System.out.println("In 1st Static Block");
    }

    {
        System.out.println("In 1st Initialise Block");
    }


    {
        System.out.println("In 2nd Initialise Block");
    }

    static{
        System.out.println("In 2nd Static Block");
    }

    public static void main(String[] args) {
      //  new ExecutionOrder(10);
       new ExecutionOrder();

    }

}