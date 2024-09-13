package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below
        if (a || b){
            System.out.println("a or b is true");
        }
        boolean c = true;
        boolean d = true;
        if (c & d){
            System.out.println("c and d is true");
        }
        if (c && d){
            System.out.println("c and d is true");
        }
        if (b ^ c)
        {
            System.out.println("b xor c is true");
        }
        if(!b)
        {
            System.out.println("b is not true");
        }
    }

}

