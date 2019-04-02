import java.io.*;
import java.util.*;

public class QueueUsingTwoStacks {

    public static void enqueue(Stack<Integer> s1, Stack<Integer>s2,int d)  
    {  
        
        s1.push(d);
    }  
  
     
    public static void dequeue(Stack<Integer> s1, Stack<Integer>s2, int qtype)  
    {  
        if(s2.empty())
            {
                while(!s1.empty())
                {
                    s2.push(s1.peek());
                    s1.pop();
                }
            }
        if(qtype==2)
        {
            
            s2.pop();
        } 
        else
        {
            System.out.println(s2.peek());
        }
        
    }  


       public static void main(String[] args) {
      
        Stack<Integer> s1= new Stack<>();
        Stack<Integer> s2= new Stack<>();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int qtype= sc.nextInt();
            if(qtype==1)
            {
                int d= sc.nextInt();
                enqueue(s1,s2,d);
            }
           else
           {
               dequeue(s1,s2,qtype);
           }
        }

    }
}
  
 
