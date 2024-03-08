public class Main {
    public static void main(String[] args){
        MathOperation add = MathOperation.ADD;
        MathOperation subtract = MathOperation.SUBTRACT;
        MathOperation multiply = MathOperation.MULTIPLY;
        MathOperation divide = MathOperation.DIVIDE;
        System.out.println("Addition between X: " + add.getX() + " and Y: " + add.getY() + ": " + add.apply(10, 20) + ";");
        System.out.println("Subtraction between X: " + subtract.getX() + " and Y: " + subtract.getY() + ": " + subtract.apply(293, 90) + ";");
        System.out.println("Multiplication between X: " + multiply.getX() + " and Y: " + multiply.getY() + ": " + multiply.apply(38483, 384) + ";");
        System.out.println("Division between X: " + divide.getX() + " and Y: " + divide.getY() + ": " + divide.apply(944, 3) + ".");
    }
}