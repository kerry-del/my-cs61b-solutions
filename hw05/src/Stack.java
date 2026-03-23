public class Stack {
    private IntNode sential;
    private IntNode endNode;
    private  int size;
    public static  class IntNode{
        int val;
        IntNode next;
        public IntNode(int value,IntNode nex){
            val = value;
            next = nex;
        }
    }
    public Stack(){
        sential = new IntNode(0,null);
        endNode = new IntNode(-1,sential);
        size =0;
    }
    public void push(int x){
        endNode.next = new IntNode(x,endNode.next);
        size++;
    }
    public int pop(){
        if(size == 0){
            return -1;
        }
        int result = endNode.next.val;
        endNode.next = endNode.next.next;
        size--;
        return result;
    }
    public int size(){
        return size;
    }
    public int sum(){
        int sum = 0;
        IntNode p = endNode.next;
        while(p!=null){
            sum+=p.val;
            p = p.next;
        }
        return sum;
    }


}
/*
public class Stack {
    private IntNode sentinel;
    private int size;

    public static class IntNode {
        int val;
        IntNode next;
        public IntNode(int value, IntNode nex) {
            val = value;
            next = nex;
        }
    }

    public Stack() {
        // 哨兵节点，它的 next 指向真正的栈顶
        sentinel = new IntNode(-1, null);
        size = 0;
    }

    public void push(int x) {
        // 始终在哨兵后面插入新节点（即新的栈顶）
        // 新节点的 next 指向原来的栈顶（sentinel.next）
        sentinel.next = new IntNode(x, sentinel.next);
        size++;
    }

    public int pop() {
        if (size == 0) return -1; // 或者抛出异常

        // 栈顶就是 sentinel.next
        int result = sentinel.next.val;
        // 移除栈顶：让哨兵跳过当前栈顶，指向下一个
        sentinel.next = sentinel.next.next;
        size--;
        return result;
    }

    public int size() {
        return size;
    }

    public int sum() {
        int sum = 0;
        IntNode p = sentinel.next; // 从第一个有效节点开始
        while (p != null) {        // 只要节点不为空就累加
            sum += p.val;
            p = p.next;
        }
        return sum;
    }
}
*/
