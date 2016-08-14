package practice.arithmeticevaluation;

import java.util.Arrays;
import java.util.List;

import practice.stack.Stack;

public class ArithmeticEvaluation {
	
	Stack <String> operator;
	Stack<Double> operand;
	List<String> oprs = Arrays.asList("-","+", "*", "/", "++", "--", "%");

	public ArithmeticEvaluation() {
		operator = new Stack<String>();
		operand = new Stack<Double>();
	}
//	
//	public boolean isUnary(char c){
//		
//	}
//	
	private double operation (double v1, double v2, String op) {
		if(op.equals("+")) {
			return v1+v2;
		} else if(op.equals("-")) {
			return v1-v2;
		} else if(op.equals("*")) {
			return v1 * v2;
		} else if(op.equals("/")) {
			return v1/v2;
		}
		return -1;
	}
	public double parseExpression(String expression) {
		double temp = 0;
		for(int i=0;i<expression.length();i++){
			char c = expression.charAt(i);
			if(Character.isDigit(c)) {
				temp *= 10;
				temp += Double.parseDouble(c+"");
			} else if(oprs.contains(String.valueOf(c))) {
				if(temp != 0) {
					operand.push(temp);
					temp = 0;
				}
				operator.push(String.valueOf(c));				
			} else if(c == ')') {
				double value1;
				if(temp != 0) {
					value1 = temp;
					temp =0;
				} else {
					value1 = operand.pop();
				}
				
				double value2 = operand.pop();
				
				double result = operation(value2, value1, operator.pop());
				operand.push(result);
			}
		}
		
		
		return operand.pop();
	}
	
//	public static void main(String args[]) throws Exception {		
//		ArithmeticEvaluation obj = new ArithmeticEvaluation();
//		System.out.println(obj.parseExpression("((50*10) *(4*5))"));	
//	}
}
