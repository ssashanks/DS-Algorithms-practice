package practice.arithmeticevaluation;

import java.util.Arrays;
import java.util.List;

import practice.stack.Stack;

public class ArithmeticEvaluation {
	
	Stack <String> operator;
	Stack<Double> operand;
	List<String> binOprs = Arrays.asList("-","+", "*", "/", "%");
	List<String> unaryOprs = Arrays.asList("++", "--");

	public ArithmeticEvaluation() {
		operator = new Stack<String>();
		operand = new Stack<Double>();
	}
	
	public boolean isUnary(char c, int i, String expression){
		if(i < expression.length() 
				&& expression.charAt(i-1) != c 
				&& expression.charAt(i+1) == c) {
			return true;
		}
		return false;
	}
	
	private boolean isUnary(String opr) {
		if(unaryOprs.contains(opr)) {
			return true;
		}
		return false;
	}
	
	
	private double operation (double v1, double v2, String op) {
		if(op.equals("+")) {
			return v1+v2;
		} else if(op.equals("-")) {
			return v1-v2;
		} else if(op.equals("*")) {
			return v1 * v2;
		} else if(op.equals("/")) {
			return v1/v2;
		} else if(op.equals("%")) {
			return v1%v2;
		} else if(op.equals("++")){
			return v2+1;
		} else if(op.equals("--")){
			return v2-1;
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
			} else if(binOprs.contains(String.valueOf(c)) 
					|| unaryOprs.contains(String.valueOf(c))) {
				if(temp != 0) {
					operand.push(temp);
					temp = 0;
				}
				if(isUnary(c, i, expression)) {
					operator.push(c+""+c);
					i++;
				} else {
					operator.push(String.valueOf(c));
				}	
			} else if(c == ')') {
				double value1, value2 = 0;
				if(temp != 0) {
					value1 = temp;
					temp = 0;
				} else {
					value1 = operand.pop();
				}
				String opr = operator.pop();
				if(!isUnary(opr)) {
					value2 = operand.pop();
				}				
				double result = operation(value2, value1, opr );
				operand.push(result);
			}
		}
		
		
		return operand.pop();
	}

//	public static void main(String args[]) throws Exception {		
//		ArithmeticEvaluation obj = new ArithmeticEvaluation();
//		System.out.println(obj.parseExpression("(((++49)+1)+10)"));	
//	}
}
