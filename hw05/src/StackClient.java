public class StackClient {
    public static Stack flipped(Stack s){
        Stack newStack = new Stack();
        int size = s.size();
        for(int i = 0;i< size;i++){
            newStack.push(s.pop());
        }
        return newStack;
    }
}
