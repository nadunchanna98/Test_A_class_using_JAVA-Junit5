package org.example;

public class ExpressionResult{

    private String expression = "0";
    private static int result = 0;


    public void setExpression(String expression) {
        this.expression = expression;
        evaluate(expression);
    }

    public String getExpression() {
        return expression;
    }

    public static int getResult() {
        return result;
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

