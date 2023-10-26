package uk.ac.rgu.topic5;

public class App {
    
    public static void main(String[] args){

        App instance = new App();

        instance.run();

        LogFormat verboseLogger = (String msg) -> {
            System.out.println("verbose" + msg);
        };

        verboseLogger.log("Hello World");

        LogFormat verboseLogger2 = new verboseLogger();
        verboseLogger2.log("Du Hast Mich!");

        LogFormat verboseLogger3 = (String msg) -> System.out.print("Verbose logger3" + msg);

        LogFormat verboseLogger4 = instance::printWithEqualsSigns;

        verboseLogger4.log("ICH WILL!");

        Operation add = (x,y) -> x + y;
        
        Operation add2 = (x,y) -> x + y;

        int result = add.perform(2, 4);
        System.out.println(result);


        String[] myArray = {"Peter Parker", "Carol Danvers", "Steve Rogers", "Wanda Maximoff"};


        String myString = "Hello world";
        int myInt = 3;

        GenericsClass c = new GenericsClass<>();

        
    }

    /**
     * Instance method, to illustrate how method references work inside the same
     * object
     */
    public void run(){
        Operation mult = this::multiply;
        int result = mult.perform(3, 4);
        System.out.println(result);
    }

    /**
     * Multiplies the given numbers together
     * Used to illustrate the use of method references
     * @param num1
     * @param num2
     * @return
     */
    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    /**
     * A method that can be used to implement the LogFormat functional interface
     * @param input
     */
    public void printWithEqualsSigns(String input){
        System.out.println("===" + input + "===");
        System.out.println("***" + input);
        System.out.println("===" + input);                                                                                                          
    }

    

}
