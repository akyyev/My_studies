package day29_return_method;

public class warmup {

	public static void main(String[] abc) {  //you can change it whatever you want args=> abc
		System.out.println("4"); 

		int totalBirds = 150;
        double averageTime = 45.7;
        String mostCommon = "Mallard Duck";

        System.out.println("Bird Watching Results");
        System.out.print("Total birds seen: ");
        System.out.println(totalBirds);

        System.out.print("Average time between sightings: ");
        System.out.println(averageTime);

        System.out.print("Most common bird seen was ");
        System.out.println(mostCommon);
		
		// unfinisheddddd
		
		
		String str ="AABBBCCCCDDDsD";   //expected result = "A6B2C3D4"
		
		String res = "";
		
		
		for(int j=0; j<str.length(); j++) {
			int count=0;
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)== str.charAt(j)) {
					count++;
				}
			}
			
			res +=""+str.charAt(j)+count;
			
			//after adding the str.charAt(j) to avoid the duplicates			
			str = str.replace(str.charAt(j)+"","");

			
			
		}
		
		System.out.print(res);
		
		
		
		
		
		
		
		
	}

}
