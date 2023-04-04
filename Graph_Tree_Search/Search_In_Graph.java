public class Search_In_Graph extends Select_Graph_Type
{
    public void pendent(int arr[][][],int level,int n)
    {
        int count=0;
        
        int j;
        j=0;
        for(int i=0;i<n;i++)
        {
            for( j=0;j<n;j++)
            {
                if(arr[level][i][j]==1)
                {
                 count++;   
            }
        }
        if(count==1)
        {
            System.out.println("arr["+level+"]["+i+"]is a pendant vertice"); 
            count=0;
        }
        }
        }
    }