import java.util.*;

class Day1Part2 {
	 public static void main(String [] args) {
        int total = 0;
        HashSet<Integer> hashSetTotal = new HashSet<> ();
        ArrayList<Integer> inputs = new ArrayList<> ();
        boolean isRepeated = false;
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()) {
            int toAdd = Integer.parseInt(sc.nextLine());
            inputs.add(toAdd);
            total += toAdd;
            if(hashSetTotal.contains(total)) {
            	isRepeated = true;
            	break;
            } else {
            	hashSetTotal.add(total);
            }
        }

        while(!isRepeated) {	
        	for(int i = 0; i < inputs.size(); i++) {
        		total += inputs.get(i);
        		if(hashSetTotal.contains(total)) {
        			isRepeated = true;
        			break;
        		} else {
        			hashSetTotal.add(total);
        		}
        	}
        }

        System.out.println("Repeated is: " + total);
    }
}