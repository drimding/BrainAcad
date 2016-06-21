package brain.lab_1_6.task05;

/**
 * Created by drimcatcher on 16.06.2016.
 */
public class main {
    public static void main (String[] argn){
        int[][] arr =
                {       {1,1,1,2,5},
                        {2,1,5,1,2},
                        {8,2,3,2,1},
                        {3,3,1,1,4}};
        int indxStart=-1, indxStop=-1;
        String indexses="";
        String indexsesLine="";
        for (int i=0; i<arr.length; i++)
        {
           for (int j=0; j<arr[i].length; j++)
           {  if (j<arr[i].length-1)
              {
                   if (arr[i][j] == 1 && indxStart == -1 && arr[i][j + 1] == 1) {
                       indxStart = j;
                       for (int k = j + 1; k < arr[i].length; k++) {
                           if (arr[i][k] == 1 && arr[i][k-1]==1) indxStop = k;
                           else break;
                       }
                   }
              }
               if (arr[i][j] == 1 && indxStart == -1 ) {
                   if (!indexses.isEmpty())
                       indexses +=", ";
                   indexses += j;
               }
           }
            if (indxStart!=-1 && indxStop!=-1 && indexsesLine.isEmpty() )
            System.out.printf("Line %d:[%d-%d]\n",i+1,indxStart,indxStop);
            if(!indexses.isEmpty())
            System.out.printf("Line %d:[%s]\n",i+1,indexses);
            if (indxStart!=-1 && indxStop!=-1 && !indexsesLine.isEmpty() )
                System.out.printf("Line %d:[%d-%d, %s]\n",i+1,indxStart,indxStop,indexsesLine);

            indxStart=-1;
            indexses="";
            indexsesLine="";
        }
    }
}
