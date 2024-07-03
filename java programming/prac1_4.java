public class prac1_4 {
            public static void main(String[] args){
    
            int[][] array= new int[3][];
    
            array[0]= new int[]{1};
            array[1]= new int[]{1,2};
            array[2]= new int[]{1,2,3};
    
            for(int i=0 ; i<array.length ; i++){
                System.out.println("Length of array[" + i + "] is: " + array[i].length );
            } 
    
        }
        
    }