
public class main 
{
	public static void main(String[] args) //test data
	{
        //static type
		double[][] test = 
        {
            {1.0, Double.NaN, 3.0},
            {Double.NaN, Double.NaN, 2.0},
            {4.0, 5.0, Double.NaN}
        };
        
        // calls of idw function 
        double[][] result = idw.idw1(test);
        
        // print
        for (int i = 0; i < result.length; i++) {          // 一行一行来
            for (int j = 0; j < result[i].length; j++) {   // 一行里的每个数
                System.out.println(result[i][j]+ " ");      // 打印数字+空格
            }
            System.out.println();                          // 打完一行就换行
        }

	}
   

}
