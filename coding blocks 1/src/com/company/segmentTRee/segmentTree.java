package com.company.segmentTRee;

public class segmentTree {
    private  class Node{
        int data;
        int StartInterval;
        int EndInterval;
        Node left;
        Node right;
    }

    Node root;
    public segmentTree(int[] arr){
        this.root=constructTree(arr,0,arr.length -1);
    }

    private Node constructTree(int[] arr,int si,int ei){
         if(si==ei){
             Node leafnode=new Node();
             leafnode.data=arr[si];
             leafnode.StartInterval=si;
             leafnode.EndInterval=ei;
             return leafnode;
         }
        Node node=new Node();
        node.StartInterval=si;
        node.EndInterval=ei;


        int mid=(si+ei)/2;

        node.left=this.constructTree(arr,si,mid);
        node.right=this.constructTree(arr,mid+1,ei);

        node.data=node.left.data + node.right.data;

        return node;

    }

    public void display(){
        this.display(this.root);
    }
    private void display(Node node){
        String str="";
        if(node.left!=null){
            str=str+"Interval = [ "+node.left.StartInterval+" - "+node.left.EndInterval+" ] and Data = "+node.left.data+" =>";
        }else{
            str=str+"No left child =>";
        }
        str=str+"Interval = [ "+node.StartInterval+" - "+node.EndInterval+" ] and Data = "+node.data;
        if(node.right!=null){
            str=str+" <= Interval = [ "+node.right.StartInterval+" - "+node.right.EndInterval+" ] and Data = "+node.right.data+" =>";
        }else{
            str=str+" <= No right child ";
        }
        System.out.println(str);

        if(node.left!=null){
            this.display(node.left);
        }
        if(node.right!=null){
            this.display(node.right);
        }

    }

    public int query(int qsi,int qei){
        return this.query(this.root,qsi,qei);
    }
    private int query(Node node,int qsi,int qei){
        //node is completely lying inside query so will contribute ans
        if(node.StartInterval>=qsi && node.EndInterval<=qei){
            return node.data;
        }else if(node.StartInterval>qei || node.EndInterval<qsi){
            //this is completely outside case
            return 0;
        }else{
            int leftans=this.query(node.left,qsi,qei);
            int rightans=this.query(node.right,qsi,qei);
            return leftans+rightans;
        }
    }
    public void update(int index,int newValue){
        this.root.data=update(this.root,index,newValue);
    }
    private int update(Node node,int index,int newValue){
        if(index>=node.StartInterval && index<=node.EndInterval){
            if(index==node.StartInterval && index==node.EndInterval){
                node.data=newValue;
            }else{
                int leftValue=this.update(node.left,index,newValue);
                int rightValue=this.update(node.right,index,newValue);
                node.data=leftValue+rightValue;
            }
        }
        return node.data;

    }


}
