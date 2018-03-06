import java.util.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

class MagicalTree{
	
	public static void main(String[] args) throws ScriptException{
		Scanner s = new Scanner(System.in);		
		int L = Integer.parseInt(s.nextLine());
		int max = 0;

		for(int l = 0; l < L; l++){			
			String expression = s.nextLine();
			ScriptEngineManager mgr = new ScriptEngineManager();
			ScriptEngine engine = mgr.getEngineByName("JavaScript");						
			int tempValue = Integer.parseInt(engine.eval(expression).toString());
			max = tempValue > max ? tempValue : max;
		}
		
		System.out.println(max);
	}	
}