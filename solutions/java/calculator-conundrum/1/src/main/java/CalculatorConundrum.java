
class CalculatorConundrum {
    public String calculate(int o1, int o2, String o) {
        System.out.println(o1+" -- "+o2+" -- "+o);
        
        if(o == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        } else if(o.equals("")) {
            throw new IllegalArgumentException("Operation cannot be empty");
        } else if(o.equals("+")) {
            return Integer.toString(o1) + " + " + Integer.toString(o2) + " = " + Integer.toString(o1 + o2);
        } else if(o.equals("*")) {
            return Integer.toString(o1) + " * " + Integer.toString(o2) + " = " + Integer.toString(o1 * o2);
        } else if(o.equals("/")) {
            try {
                return Integer.toString(o1) + " / " + Integer.toString(o2) + " = " + Integer.toString(o1 / o2);
            } catch (ArithmeticException e) {
                throw new IllegalOperationException("Division by zero is not allowed", e);
            }         
        } else {
            throw new IllegalOperationException("Operation '"+o+"' does not exist");
        }
        
    }
}
