// I certify the code of this lab is entirely my own work.

import java.util.Scanner;
class ExpressionResult{

    private String expression;
    private static int result;

    public ExpressionResult(){
        expression="0";
        result = 0;
    }

    public ExpressionResult(String expression) {
        this.expression = expression;
        evaluate(expression);
    }

    public String ToString(){
        return expression + " = " + result ;
    }


    public static int evaluate(String expression){

        String arr[] = expression.split(" " );
        int val1 = Integer.parseInt(arr[0]);
        int val2 = 0;
        char operator = arr[1].charAt(0) ;


        for(int i=0 ;i<arr.length; i++)
        {

            if(arr.length < 2*i+2 ){
                break;
            }

            if( 0 != arr[2*i+1].charAt(0)/2)
            {
                operator =  arr[2*i+1].charAt(0) ;
                val2 = Integer.parseInt(arr[2*i+2]);
            }
            else{
                val2 = Integer.parseInt(arr[2*i+2]);
            }


            switch(operator) {
                case '+':
                    result  = val1 +  val2;
                    break;
                case '-':
                    result  = val1 -  val2;
                    break;
                case '*':
                    result  = val1 *  val2;
                    break;

                case '^':
                    result  = (int) Math.pow(val1, val2);
                    break;

                default:
                    result  = val1 /  val2;
            }

            val1 = result  ;
        }

        return result;

    }




}

public class myclass {

    public static void main(String[] args){

        char enterVal ='a';

        while(enterVal != 'X')
        {

            System.out.print("User expression : ");
            Scanner myObj2 = new Scanner(System.in);
            String userInput2 = myObj2.nextLine();
            ExpressionResult obj1 = new  ExpressionResult(userInput2);
            System.out.println( obj1.ToString() );

        }

    }
}
