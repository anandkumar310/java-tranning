/* 
 * Nested Loop
 *  >Syntax
 *     for(  ;  ;  ) ->row
 *      {
 *          for(  ;  ;  )->column
 *              {
 * 
 *              }
 *      }
*/

/*
  1 2 3 4 5
  1 2 3 4 5
  1 2 3 4 5
  1 2 3 4 5
  1 2 3 4 5
 */
/*public class nestloop {
    public static void main(String[] args) {
        int i,j;
        for (i=1;i<=5;i++) {
            for(j=1;j<=5;j++)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}

*/
/*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
 */
/*public class nestloop {
    public static void main(String[] args) {
        int i,j;
        for (i=1;i<=5;i++) {
            for(j=1;j<=i;j++)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
    */
/*
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
 */
  /*   public class nestloop {
        public static void main(String[] args) {
            int i,j;
            for (i=1;i<=5;i++) {
                for(j=1;j<=i;j++)
                {
                    System.out.print(" "+i);
                }
                System.out.println();
            }
        }
    }*/

/*
    1
    0 1
    0 1 0
    1 0 1 0
    1 0 1 0 1
 */    
    /*public class nestloop {
        public static void main(String[] args) {
            int i,j,t=1;
            for (i=1;i<=5;i++) {
                for(j=1;j<=i;j++)
                {
                    if(t==1){
                        System.out.print(" "+1);
                        t=0;
                    }
                    else{
                        System.out.print(" "+"0");
                        t=1;
                    }
                    
                }
                System.out.println();
            }
        }
    }*/

/*
  * * * * *
  * * * *
  * * * 
  * *
  *
 */

    /*public class nestloop {
        public static void main(String[] args) {
            int i,j;
            for (i=0;i<=5;i++) {
                for(j=1;j<=5-i;j++)
                {
                        System.out.print(" "+"*");
                    
                }
                System.out.println();
            }
        }
    }*/

    /*
                *
              * *
            * * *
          * * * *
        * * * * *
          
     */

   /*  public class nestloop {
        public static void main(String[] args) {
            int i,j;
            for (i=1;i<=5;i++)
             {
                for(j=1;j<=5-j;j++)
                {
                        System.out.print(" ");
                    
                }
                        for(j=1;j<=i;j++)
                        {
                        System.out.print("*");
                        }
                System.out.println();
            }
        }
    }*/

    /*
       1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1
     */
    /*public class nestloop {
        public static void main(String[] args) {
            int i,j;
            for (i=1;i<=5;i++) {
                for(j=1;j<=i;j++)
                {
                    if((i+j)%2==0){
                        System.out.print(" "+"1");
                    }
                    else{
                        System.out.print(" "+"0");
                    }
                    
                }
                System.out.println();
            }
        }
    }*/
/*
          *
         ***
        *****
       *******
      *********

 */
    /*public class nestloop {
        public static void main(String[] args) {
            int i,j;
            for (i=1;i<=5;i++) {
                for(j=1;j<=5-i;j++)
                {
                        System.out.print(" ");
                }
                        for(j=1;j<=(2*i-1);j++){
                            System.out.print("*");
                }
                System.out.println();
            }
        }
    }
*/
public class nestloop {
    public static void main(String[] args) {
        int i,j ,a=1;
        for (i=1;i<=5;i++) {
            for(j=i;j<=5;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=(i*2)-1;j++)
            {
                System.out.print(a);
                a++;
            }
            
            System.out.println();
        }
    }
}

