class Stack {
    private char charArr[];
    int index;

    Stack (int length) {
        charArr = new char[length];
        index = 0;
    }

    void push (char in) {
        if(index != charArr.length){
            charArr[index] = in;
            index++;
        } else {
            System.out.println("Stack is full.");
        }
    }
    char pop() {
        if(index > 0) {
            index--;
            return charArr[index];
        } else {
            System.out.println("Stack is empty");
            return (char) 0;
        }
    }
}

class StackEx {
    public static void main (String args[]) {
        Stack stk = new Stack(6);

        stk.push('A');
        stk.push('d');
        stk.pop();
        stk.push('r');
        stk.push('i');
        stk.push('a');
        stk.push('n');
        stk.push('K');

        for(int i = 0; i < 7; i++)
            System.out.print(stk.pop() + " ");
        System.out.println();
    }
}