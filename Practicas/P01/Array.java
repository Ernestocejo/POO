public class Array
{
    static int [][]arreglo=new int[2][5];
 
    static int x=0,y=0,z=0;
    static void llenaArreglo()
    {
        for(int i=0;i<arreglo.length;i++)
        {
            for(int j=0;j<arreglo[i].length;j++)
            {
                z=(int)(Math.random()*100+1);
                if(z%2==0)
                {
                    arreglo[0][j]=z;
                    x++;
                }
                else
                {
                    arreglo[1][j]=z;
                    y++;
                }
            }
        }
    }
 
    static void imprime()
    {
        System.out.println("Superior - Pares");
        for(int i=0;i<arreglo.length;i++)
        {
            for(int j=0;j<arreglo[i].length;j++)
            {
                System.out.print("Arreglo["+i+"]["+j+"] : "+arreglo[i][j]);
                System.out.println("");
            }
            if(i<arreglo.length-1)
                System.out.println("Inferior - Impares");
        }
 
    }
 
    public static void main(String[] args)
    {
        llenaArreglo();
        imprime();
    }
 
}