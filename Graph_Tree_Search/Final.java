import java.util.*;
public class Final 
{
public static void main(String args[])
{
    System.out.println("ENTER THE NUMBER OF VERTICES IN YOUR GRAPH");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Select_Graph_Type ob=new Select_Graph_Type();
    int n1[][][]=ob.Tree_Graph(n);
    System.out.println("ENTER THE TREE LEVEL YOU WANT TO SEARCH");
    int l=sc.nextInt();
    Search_In_Graph ob1=new Search_In_Graph();
    ob1.pendent(n1,l,n);
    Tree_Represent tree=new Tree_Represent();
    tree.Tree(n1,n);
}
}