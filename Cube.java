
public class Cube {
	
	
	 public static void Rubix()
  {
    System.out.println("This is the solved version of the cube");
     
 
     
    char [][] face1 = new char [3][3];
    char [][] face2 = new char [3][3];
    char [][] face3 = new char [3][3];
    char [][] face4 = new char [3][3];
    char [][] face5 = new char [3][3];
    char [][] face6 = new char [3][3];
    

    for (int i = 0; i<face1.length; i++)
    {
        for(int j=0; j<face1[i].length; j++) 
        {
            face1[i][j] = 'w';
            System.out.print(face1[i][j]);
        }
        System.out.println();

    }
    System.out.println();

    for (int i = 0; i<face2.length; i++)
    {
        for(int j=0; j<face2[i].length; j++) 
        {
            face2[i][j] = 'r';
            System.out.print(face2[i][j]);

        }
        System.out.println();

      }
         System.out.println();

    for (int i = 0; i<face3.length; i++)
    {
        for(int j=0; j<face3[i].length; j++) 
        {
            face3[i][j] = 'b';
            System.out.print(face3[i][j]);
        }
        System.out.println();

    }
      System.out.println();

    for (int i = 0; i<face4.length; i++)
    {
        for(int j=0; j<face4[i].length; j++) 
        {
            face4[i][j] = 'g';
            System.out.print(face4[i][j]);
        }
          System.out.println();
    }
    System.out.println();


    for (int i = 0; i<face5.length; i++)
    {
        for(int j=0; j<face5[i].length; j++) 
        {
            face5[i][j] = 'o';
            System.out.print(face5[i][j]);
        }
          System.out.println();
    }
    System.out.println();


    for (int i = 0; i<face6.length; i++)
    {
        for(int j=0; j<face6[i].length; j++) 
        {
            face6[i][j] = 'y';
            System.out.print(face6[i][j]);
        }
        System.out.println();
    }
      
    System.out.println();

  }
	public static void main(final String[] args){
    
		
	 System.out.println("This is the unshuffled version of the cube");
     
 
     
     char [][] face1 = new char [3][3];
     char [][] face2 = new char [3][3];
     char [][] face3 = new char [3][3];
     char [][] face4 = new char [3][3];
     char [][] face5 = new char [3][3];
     char [][] face6 = new char [3][3];
     
 
     for (int i = 0; i<face1.length; i++)
     {
         for(int j=0; j<face1[i].length; j++) 
         {
             face1[i][j] = 'w';
             System.out.print(face1[i][j]);
         }
         System.out.println();
 
     }
     System.out.println();
 
     for (int i = 0; i<face2.length; i++)
     {
         for(int j=0; j<face2[i].length; j++) 
         {
             face2[i][j] = 'r';
             System.out.print(face2[i][j]);
 
         }
         System.out.println();
 
       }
          System.out.println();
 
     for (int i = 0; i<face3.length; i++)
     {
         for(int j=0; j<face3[i].length; j++) 
         {
             face3[i][j] = 'b';
             System.out.print(face3[i][j]);
         }
         System.out.println();
 
     }
       System.out.println();
 
     for (int i = 0; i<face4.length; i++)
     {
         for(int j=0; j<face4[i].length; j++) 
         {
             face4[i][j] = 'g';
             System.out.print(face4[i][j]);
         }
           System.out.println();
     }
     System.out.println();
 
 
     for (int i = 0; i<face5.length; i++)
     {
         for(int j=0; j<face5[i].length; j++) 
         {
             face5[i][j] = 'o';
             System.out.print(face5[i][j]);
         }
           System.out.println();
     }
     System.out.println();
 
 
     for (int i = 0; i<face6.length; i++)
     {
         for(int j=0; j<face6[i].length; j++) 
         {
             face6[i][j] = 'y';
             System.out.print(face6[i][j]);
         }
         System.out.println();
     }
       
     System.out.println();




     System.out.println();
 
     System.out.println("This is the shuffled version of the cube");
     System.out.println();
     for(int i =0; i<face1.length; i++)
     {
      
      for(int j =0; j<face1.length; j++)
      {
        
        face1[0][j] = face6[1][j];
        face1[2][j] = face2[1][j];
        
        System.out.print(face1[i][j]);
      }
      System.out.println();
     }

     System.out.println();
    
     for(int i =0; i<face2.length; i++)
        {
         
         for(int j =0; j<face2.length; j++)
         {
          
          face2[0][j] = face1[0][j];
          face2[2][j] = face3[2][j];
           
           System.out.print(face2[i][j]);
         }
         System.out.println();
     
     
        }
       
     System.out.println();
    
     for(int i =0; i<face3.length; i++)
     {
      
      for(int j =0; j<face3.length; j++)
      {
        
        face3[0][j] = face2[1][j];
        face3[2][j] = face4[1][j];
        
        
        System.out.print(face3[i][j]);
      }
      System.out.println();
    }
     System.out.println();
    
     
     
     for(int i =0; i<face4.length; i++)
     {
      
      for(int j =0; j<face4.length; j++)
      {
        
        face4[0][j] = face3[1][j];
        face4[2][j] = face5[1][j];
        
        
        System.out.print(face4[i][j]);
      }
      System.out.println();
     }
    
     System.out.println();
    
    
     for(int i =0; i<face5.length; i++)
     {
      
      for(int j =0; j<face5.length; j++)
      {
        
        face5[0][j] = face4[1][j];
        face5[2][j] = face6[1][j];
        
        
        System.out.print(face5[i][j]);
      }
      System.out.println();
     }
    
     System.out.println();
    
     for(int i =0; i<face6.length; i++)
     {
      
      for(int j =0; j<face6.length; j++)
      {
        
        face6[0][j] = face5[1][j];
        face6[2][j] = face1[1][j];
        
        System.out.print(face6[i][j]);
      }
      System.out.println();
    }















         
    for(int i =0; i<face6.length; i++)
    {
     
     for(int j =0; j<face6.length; j++)
     { 
       
       face6[0][j] = face5[1][j];
       face6[2][j] = face1[1][j];
       
       if(face6[2][j] == face5[1][j])
       {
        System.out.print("R");
       }
       
       
     }
   

    }


    for(int i =0; i<face5.length; i++)
    {
     
     for(int j =0; j<face5.length; j++)
     {
       
       face5[0][j] = face4[1][j];
       face5[2][j] = face6[1][j];
       
       
        if(face5[2][j] == face4[1][j])
       {
           System.out.print("r");
       }

        
     }
     System.out.println();
    }

    for(int i =0; i<face4.length; i++)
    {
     
     for(int j =0; j<face4.length; j++)
     {
       
       face4[0][j] = face3[1][j];
       face4[2][j] = face5[1][j];
       
       if(face4[0][j]==face3[1][j])
       {
        System.out.print("L");
       }
     }
     System.out.println();
    }


    for(int i =0; i<face3.length; i++)
    {
     
     for(int j =0; j<face3.length; j++)
     {
       
       face3[0][j] = face2[1][j];
       face3[2][j] = face4[1][j];
       
       
       if(face3[2][j]== face4[1][j])
       {
        System.out.print("R");
       }
     }
     System.out.println();
   
    }


    for(int i =0; i<face2.length; i++)
    {
     
     for(int j =0; j<face2.length; j++)
     {
      
      face2[0][j] = face1[0][j];
      face2[2][j] = face3[2][j];
       
      if(face2[0][j] == face1[0][j])
      {
        System.out.print("L");
      }
     }
     System.out.println();
 
 
    }


for(int i =0; i<face1.length; i++)
     {
      
      for(int j =0; j<face1.length; j++)
      {
        
        face1[0][j] = face6[1][j];
        face1[2][j] = face2[1][j];
        
        if(face1[0][j] == face6[1][j])
        {
          System.out.println("L");
        }
      }
      System.out.println();
     }



    

     System.out.println();
        
          Rubix();
    
      }
		
		
  }
}
