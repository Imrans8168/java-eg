import java.util.*;

public class dsa2m {
    
static class stack{
    int top;
    int items[] = new int [100];
     
    void push(int x)
    {
        if(top ==99){
            System.out.println("Stack is fullll...");
        }
        else
        {
            items[++top]=x;

        }
    }
    int pop(){
        if (top == -1){
            System.out.println("underflow..");
            return -1;
        }
        else{
            int element = items[top];
            top--;
            return element;
        }
    }
    boolean isEmpty(){
        return (top == -1) ? true:false;
    }
}

    static void displayNGE(int arr[], int n){
        int  i=0;
        stack s = new stack();
        s.top=-1;
        int element ,next;
        

        s.push(arr[0]);

        for(i =1; i<n;i++){
            next =arr[i];

            if(s.isEmpty() == false)
            {
                element=s.pop();
                while(element<next){
                    System.out.println(element + " -->" + next);
                    if(s.isEmpty()==true)
                    break;
                    element =s.pop();
                }
                if(element>next)
                s.push(element);

            }
            s.push(next);

        }
        while(s.isEmpty() ==false){
            element =s.pop();
            next =-1;
            System.out.println(element + " --" + next);
        }
    }
    
    public static void main(String args[]){
        int arr [] ={13, 7, 6, 12};
        int n= arr.length;
        displayNGE(arr,n);
    }
}
