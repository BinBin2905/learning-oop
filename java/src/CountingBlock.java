public class CountingBlock {

    {
        System.out.println("Inside Anonymous Block");
    }

    static{
        System.out.println("Inside Static Block");
    }

    static int count = 0 ;

    public CountingBlock(){
        System.out.println("CountingBlock: "+ count);
        count++;
    }
}
