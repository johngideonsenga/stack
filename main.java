import java.io.*;
public class main{
	public static void main(String args[])throws IOException{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		Stack s = new Stack();
		
		s.push(1);
		s.push(3);
		s.push(8);
		s.pop();
		s.push('f');
		s.push('y');
		s.push(2);
		s.push(7);
		s.pop();
		s.push('e');

		while(!s.isEmpty()){
			System.out.print(s.pop());
		}
	}
}