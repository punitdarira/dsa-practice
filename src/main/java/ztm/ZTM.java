package ztm;

import java.util.Iterator;

public class ZTM {

	public static void main(String[] args) {
		int[] array1 = {0, 3, 4, 31};
		int[] array2 = {4, 6, 30};
		//mergeSortTwoArrays(array1, array2);
		customLinkedListWithoutRecursion();
	}

	private static void customLinkedList() {
		LinkedList linkedList = new LinkedList(1);
		linkedList.append(2);
		linkedList.append(3);
		linkedList.append(4);
		System.out.println(linkedList);
	}
	
	private static void customLinkedListWithoutRecursion() {
		LinkedListWithoutRecursion linkedListWithoutRecursion = new LinkedListWithoutRecursion(2);
		linkedListWithoutRecursion.append(3);
		linkedListWithoutRecursion.append(4);
		linkedListWithoutRecursion.append(5);
		linkedListWithoutRecursion.prepend(1);
		linkedListWithoutRecursion.append(6);
		System.out.println(linkedListWithoutRecursion);
		linkedListWithoutRecursion.insert(4, 99);
		System.out.println(linkedListWithoutRecursion);
	}

	private static void mergeSortTwoArrays(int[] array1, int[] array2) {
		int[] resultArray = new int[array1.length + array2.length];
		for(int i = 0; i<array1.length ; i++) {
			resultArray[i] = array1[i];
		}
		System.out.println(resultArray.length);
		//start merge
		for(int i = 0; i<array2.length ; i++) {
			for(int j = 0; j<resultArray.length ; j++) {
				if(array2[i] < resultArray[j]) {
					moveElementsToOnePositionRight(resultArray, j, array2[i]);
				}
			}
		}
		
	}
	public static void moveElementsToOnePositionRight(int[] resultArray, int indexForNewElement, int newElement) {
		int temp = resultArray[indexForNewElement];
		
	}

}
