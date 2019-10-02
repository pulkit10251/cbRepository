package com.company.StackqueuE;

public class SUQpopEfficientClient {
    public static void main(String[] args) throws Exception {
        SUQpopEfficient q=new SUQpopEfficient();
        for(int i=1;i<=5;i++){
            q.push(i*10);
        }
        q.display();
        System.out.println(q.top());
        q.pop();
        System.out.println(q.top());
        q.display();

    }
}
