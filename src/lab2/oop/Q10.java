/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.oop;

/**
 *
 * @author coc
 */
public class Q10 {
    public static int numCommonIntegers(int arrInput1 [], int arrInput2[]){
		int commonNumberAmount = 0;
		for(int i = 0; i < arrInput1.length; i++) {
			for(int j = 0 ; j< arrInput2.length; j++) {
				if(arrInput1[i]==arrInput2[j]) {
					commonNumberAmount++;
				}
			}						
		}		
		return commonNumberAmount;
	}
	
	public static int[] commonIntegers(int arrInput1 [], int arrInput2 []) {
		int [] returnVar = new int[arrInput1.length];
		int store = 0;
			
			for(int j = 0 ; j < arrInput1.length ; j++) {
				boolean appears = false;
				for (int k = 0; k < arrInput2.length; k++){
		              if (arrInput1[j] == arrInput2[k]){
		                  appears = true;
		                  break;
		              }
		         }

		         if (appears==true){
		             returnVar[store] = arrInput1[j];
		             store++;
		         }
			}
			
				
		return returnVar;
	}
	
	public static void main(String[] args) {
		int[] input1 = {1,5,7,9,22};
		int[] input2 = {22,1,5,88,77};
		
		int output1 = numCommonIntegers(input1, input2);
		System.out.println("Output1 : "+output1);
		int[] output2 = commonIntegers(input1, input2);
		System.out.print("Output2 : ");
		for(int i = 0 ; i < output2.length; i++) {
			if(output2[i]!=0) {
				System.out.print(+output2[i]+ " ");
			}
		}

	}
}
