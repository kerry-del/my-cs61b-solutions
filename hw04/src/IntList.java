public class IntList {
    int first;
    IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /** Return the size of the list using no recursion! */
    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    public int iterativeGet(IntList L,int i){
        if(i==0){
            return first;
        }
        IntList p= L;
        for(int m=1;m<=i;m++){
            p=p.rest;
        }
        return p.first;

    }

    /** Returns the ith item of this IntList. */
    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }

    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. Must use recursion.
     *
     * This method is non-destructive, i.e. it must not modify the original list.
     */
    public static IntList incrRecursiveNondestructive(IntList L, int x) {
        // TODO: Fill in this code
        if(L==null){
            return null;
        }
        return new IntList(L.first+x,incrRecursiveNondestructive(L.rest,x));
    }

    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. Modifies the original list.
     * You are not allowed to use "new" in this method.
     */
    public static IntList incrRecursiveDestructive(IntList L, int x) {
        // TODO: Fill in this code
        if(L==null){
            return null;
        }
        L.first=L.first+x;
        incrRecursiveDestructive(L.rest,x);
        return L;
    }

    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed
     * to use recursion. May not modify the original list.
     */
    public static IntList incrIterativeNondestructive(IntList L, int x) {
        // TODO: Fill in this code
        if(L==null){
            return null;
        }
        IntList newList = new IntList(L.first+x,null );
        IntList p = newList;
        for(int i=1;i<L.iterativeSize();i++){
            p.rest = new IntList(L.iterativeGet(L,i)+x,null);
            p = p.rest;
        }
        return newList;
        /*双指针链表解法
        IntList ptr = L.rest;
        IntList tail = newList;
        while(p!=null){
        tail.rest = new IntList(ptr.first+x,null);
        tail = tail.rest;
        ptr = ptr.rest;
        }

        */
    }

    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed
     * to use recursion. Modifies the original list.
     * You are not allowed to use "new" in this method.
     */
    public static IntList incrIterativeDestructive(IntList L, int x) {
        // TODO: Fill in this code
        L.first =L.iterativeGet(L,0)+x;
        IntList p =L.rest;
        for(int i=1;i<L.iterativeSize();i++){
            p.first =L.iterativeGet(L,i)+x;
            p=p.rest;
        }
        return L;
    }

    /**
     * Returns an IntList consisting of the elements of L1 followed by the
     * elements of L2.
     */
    public static IntList concatenate(IntList L1, IntList L2) {
        // TODO: Fill in this code
        if(L1==null){
            return L2;
        }
        if(L2==null){
            return L1;
        }
        IntList newList = new IntList(L1.first,null);
        IntList p = newList;
        for(int i=1;i<L1.size();i++){
            p.rest = new IntList(L1.get(i),null);
            p = p.rest;
        }
        for(int i=0;i<L2.size();i++){
            p.rest = new IntList(L2.get(i),null);
            p = p.rest;
        }
        return newList;
    }

    /*
     * =================================================================
     * OPTIONAL METHODS
     * =================================================================
     */

    /**
     * Returns the sum of all elements in the IntList.
     */
    public int sum() {
        // Optional: Fill in this code
        return 0;
    }

    /**
     * Destructively adds x to the end of the list.
     */
    public void addLast(int x) {
        // Optional: Fill in this code
    }

    /**
     * Destructively adds x to the front of this IntList.
     * This is a bit tricky to implement. The standard way to do this would be
     * to return a new IntList, but for practice, this implementation should
     * be destructive.
     */
    public void addFirst(int x) {
        // Optional: Fill in this code
    }
}
