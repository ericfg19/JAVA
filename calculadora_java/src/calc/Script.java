package calc;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Script implements ActionListener {
	private CalculadoraApp context;
	private String displayText;
	
	public Script(CalculadoraApp context) {
		if(this.context == null)
			this.context = context;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		setNumber(e.getActionCommand());
		setOperator(e.getActionCommand());
		setResult(e.getActionCommand());
		reset(e.getActionCommand());
		setDisplayText(e.getActionCommand());
		context.setDisplay(displayText);
		
		System.out.println("====================================");
		System.out.println("Primeiro número  -> " + context.num1);
		System.out.println("Operação matemática => " + context.operator);
		System.out.println("Segundo número  -> " + context.num2);
		System.out.println("Resultado   -> " + String.format("%.2f", context.result) );
		System.out.println("====================================\n");
		
	}
	
	private void setDisplayText(String actionCommand) {
		
		displayText =  (context.display.getText().equals("0") ? "" : context.display.getText());
		
		displayText = (actionCommand.matches("[0-9.]")?displayText+actionCommand:displayText);
		
		if(context.num1.length()!= 0 && context.operator == null && context.num2.length() == 0)
			displayText = context.num1.toString();
		
		else if(context.num1.length()!=0 && context.operator != null && context.num2.length() == 0){
			displayText = context.operator;
		}else {
			displayText = "";
			displayText = context.num2.toString();
		}
	} 
	
	private void setNumber(String actionCommand) {
		if(!actionCommand.matches("^([0-9.]+)$"))
			return;
		if(context.operator == null || context.operator.isBlank() || context.operator.isEmpty())
			setNum1(actionCommand);
		else
			setNum2(actionCommand);
	}
	
	
	private void setNum1(String value) {
		context.num1.append(value);
	}
	private void setNum2(String value) {
		context.num2.append(value);
	}
	
	
	private void setOperator(String value) {
		
		if(!value.matches("([+|\\-|/|x|%])"))
			return;
		if(context.num1.length() == 0  && context.num2.length() == 0 )
			return;
		context.operator = value;
	}
	
	public Double sum(Double num1, Double num2) {
		return (num1+num2);
	}
	public Double sub(Double num1, Double num2) {
		return  (num1-num2);
	}
	public Double mult(Double num1, Double num2) {
		return  (num1*num2);
	}
	public Double div(Double num1, Double num2) {
		return  (num1/num2);
	}
	
	public void setResult(String value){
		
		if(context.num1.length()== 0 && context.operator == null && context.num2.length() == 0)
			return;
		if(!value.matches("[=]"))
			return;
		
		Double a = Double.parseDouble(context.num1.toString());
		Double b = Double.parseDouble(context.num2.toString());
		context.num1 = new StringBuffer();
		
		if(context.operator.matches("[+]")) {
			context.result = sum(a, b);
			context.num1.append(context.result);
		}
		if(context.operator.matches("[\\-]")) {
			context.result = sub(a, b);
			context.num1.append(context.result);
		}
		if(context.operator.matches("[x]"))
			context.num1.append(context.result = mult(a, b));
		if(context.operator.matches("[/]"))
			context.num1.append(context.result = div(a, b));
		
		context.num2 = new StringBuffer();
		context.operator = null;
	}
	
	public void reset(String value) {
		if(!value.matches("(AC|C)"))
			return;
		context.num1=new StringBuffer();
		context.num2=new StringBuffer();
		context.result   = null;
		context.operator = null;
		
		System.out.println("====================================");
		System.out.println("operação zerada");
		System.out.println("====================================\n");
	
	}
}
