package searching;

class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {1, 2, 3, 4, 1, 6, 5};
		int maxNumber = 0;
		int count = 0;
		for(int i : inputArray) {
            if(count == 0)
            {
            	maxNumber = i;
            }
            
            if(maxNumber == i)
            {
                count++;
            }
            else
            {
                count--;
            }
		}
		// Now check whether maxNumber has occurred minimum n/2 times
		count = 0;
		for(int i : inputArray) {
			if(i == maxNumber)
				count++;
		}
		if(count > inputArray.length/2)
			System.out.println("Out put is " + maxNumber);
		else
			System.out.println("No solution");
	}

}
