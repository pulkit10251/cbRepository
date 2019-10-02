package com.company.backtracking.backtrackingchallenges;

public class coinChangeCombi {
    public static void main(String[] args) {
       int[] A={10,1,2,7,6,1,5};
        coin(A,8,"",0);
    }
    public static void coin(int[] A,int sum,String ans,int pos){
        if(sum==0){
           System.out.println(ans);
           return;
       }

            if(sum>=A[pos]){
            coin(A,sum-A[pos],ans+""+A[pos],pos+1);
            A[pos]=0;
//           }else{
      //          coin(A,sum-A[pos],ans+""+A[pos],pos+1);
    //            A[pos]=0;
//
  //          }
        }
    }
}
