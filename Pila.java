import java.until.Stack;

public class Pila{
    puclic static void main(String[] args){
        Stack<Integer> pila = new Stack<>();

        pila.push(10);
        pila.push(20);
        pila.push(30);

        while (!pila.empty()){
            System.out.print(pila.peek() + " ");
            pila.pop();
        }
    }
}