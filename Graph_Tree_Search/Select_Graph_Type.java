import java.util.*;
class Select_Graph_Type
{
public int[][][] Tree_Graph(int n)
   {
     Scanner sc=new Scanner(System.in);
     int arr[][][]=new int[n][n][n];
     int check_level=0;
     int count=0;
     int limit=n*n;
     for(int i=0;i<n;)
     {
         for(int j=0;j<n;j++)
         {
             for(int k=0;k<n;k++)
             {
                 System.out.println("ENTER ONE IF VERTEX "+j+" IS ADJACENT TO VERTEX "+k+"\n LEVEL IS AT "+i);
                 if(count<limit)
                 {
                 arr[i][j][k]=sc.nextInt();
                 count++;
                }
                else
                {
                    break;
                }
             }
             if(count<limit)
             {
             System.out.println("DO YOU WANT TO CHANGE LEVEL");
             check_level=sc.nextInt();
             if(check_level==1)
             {
                break;
             }
            }
            else
            {
                break;
            }
        }
            if(check_level==1)
            {
             i++;
            }
            else if(count>=limit)
            {
            break;
        }
        }
        return arr;
 }
}