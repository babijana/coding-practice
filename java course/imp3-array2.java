class imp3_array2
{
    public static void main (String args[])
    {
        int array[][]=new int [3][];// jaked array
        
        array[0]=new int[3];
        array[1]=new int[4];
        array[2]=new int[2];
        for (int i=0;i<array.length;i++)
        {
            for (int j=0;j<array[i].length;j++)
            {
                array[i][j]=(int)(Math.random()*10);
            }
        }
        for(int n[]:array)
        {
            for(int m:n)//we acn printb a 2d array like this also
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}