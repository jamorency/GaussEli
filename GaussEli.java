//Jodell Morency
//11.13.13
//Algorithms and Analysis
//Gaussian Elimination

//This program will read in a matrix from a text file
//and solve the a set of equations using gaussian Elimination

import java.util.Scanner; //imports java class that scans from other files

public class GaussEli {
    
    public static void main(String[] args) {
    

Scanner in = new Scanner(System.in); //prepares to read input from text file

// Arrays used to read in numbers from text file

double [][] C; //This array will hold the coefficients of the matrix

double [] o; //This array will hold the last column outside of the coeffiecent matrix

double [] f; // This array will hold the query line at the bottom of the text file

    // Variables used

    double piv, fact; // used to navigate through matrix
    
    double sum = 0; // holds the sum of the equations
    
    int answer = (int)sum; //converts the sum into an integer
    
    //Non Initialized Variables used to hold numbers in matrix
    
    int i;
    
    int j;
    
    int x;
    
    int q;
    
    int n;

        //This next section will read in numbers form the 
        
        n = in.nextInt(); //n will size of the array
        
    //Contructors used
           
            C = new double[n][n]; //holds the size of the coeffeicients 
            
            o = new double[n];    //holds the size of the outside column
            
            f = new double[n];    //holds the size of the query line
            
    
    //loops designed to read in numbers from text
     
                for(i = 0; i < n; i++) { 
                    
                    for (j = 0; j < n; j++) {
                        
                        C[i][j] = in.nextDouble(); //reads in all coeffecients 
                        
                     }   
                                             
                        o[i] = in.nextDouble(); //reads in all numbers in outside column
                        
                }
                                       
                        for(q = 0; q < n; q++) { 
                            
                            f[q] = in.nextDouble(); //reads in all numbers in the query line
                            
                        }
                        
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        //This section is where the Gaussian Elimination occurs
        
    //loop designed to Pivot through rows
    
                for(i = 0; i < n; i++) { //Goes through the row i
                
                    piv = C[i][i]; //chooses Pivot (coefficients)
                    
                        for (j = 0; j < n; j++)
                        
                            C[i][j] = C[i][j] / piv; //divides coefficients by Pivot
                            
                                o[i] = o[i] / piv; //divides outside column by Pivot
                                
                                    for(x = 0; x < n; x++) {
                                        
                                        if( x!= i) {
                                        
                                        fact = C[x][i];
                                        
                                            for(j = 0; j < n; j++)
                                        
                                            C[x][j] -= fact * C[i][j];
                                            
                                            o[x] -= fact * o[i];
                                        }
                                    }
                                }     

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`

//This section takes rounds and print's the sum to produce the final answer

        //This loop takes the solutions to the equation and multiplies them by the query line. 
        // after multiplying the solutions are added to produce a final answer
        
        
            for (i = 0; i < n; i++)
            
                sum += o[i] * f[i]; //does the multiplying and adding step
                
                    sum = Math.round(sum); // rounds the final answer
                    
                        answer = (int)sum; // converts the final answer into an integer
                            
                             System.out.println(answer); //prints the final answer!
            
           
    } 
}
                    




