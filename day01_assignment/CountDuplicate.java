package com.sonata1;

public class CountDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,7,5,7,3,2,2,4, 8, 8, 3}; 
		int count=0;
	       System.out.println("Duplicate elements in given array: \n");    
		    for(int i = 0; i < arr.length; i++) {    
		        for(int j = i + 1; j < arr.length; j++) {    
		            if(arr[i] == arr[j])
		            	count++;
		            System.out.println( arr[j]);
		                System.out.println(count);    
		        }    
		    }    
		       
		}  

		}


	
