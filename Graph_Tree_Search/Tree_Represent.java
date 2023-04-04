import java.util.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class Tree_Represent
{
    public void Tree(int arr[][][],int n)
    {
        int count=0;
        DefaultMutableTreeNode one=new DefaultMutableTreeNode("1");
        for(int i=1;i<n;)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(arr[i][j][k]==1)
                    {
                        DefaultMutableTreeNode ob=new DefaultMutableTreeNode(Integer.toString(j));
                        one.add(ob);
                        count++;
                    }
                }
                if(count==0)
                {
                    break;
                }
            }
            if(count==0)
            {
                i++;
            }
        }
        JTree ob=new JTree(one);
        JFrame o=new JFrame();
        o.setSize(200,200);
        o.setVisible(true);
        o.add(ob);
    }
}