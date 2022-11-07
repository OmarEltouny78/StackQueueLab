public class Main {
    public static void main(String[] args) {
        String exp1 = " )(( )){([( )])}";
        String exp2 = "()";
        String exp3="anna";
        String exp6="Omar";
        String exp4 = "a+b";
        String exp5="a+b*c";
        //System.out.println((infixToPostfix(exp4)));


    }

    public static boolean isMatched(String expression) {
    final String opening = "({[";
    final String closing = ")}]";
    Stack<Character> buffer=new ArrayStack<>(1000);
    for (char c:expression.toCharArray()
         ) {
        if(opening.indexOf(c)!=-1){
            buffer.push(c);
        }
        else if(closing.indexOf(c)!=-1){
            if(buffer.isEmpty()){
                return false;
            }
            if (closing.indexOf(c)!=opening.indexOf(buffer.pop())){
                return false;
            }
        }
    }
    return buffer.isEmpty( );


    }
    public static boolean isPalindrome(String s){
        return false;
    }
    //helper for precedence
    public static int Prec(char ch)
    {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
    public static String infixToPostfix(String exp){
        String result="";
        return result;
    }

}
