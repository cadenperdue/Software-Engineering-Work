/*
 * Award class to display information about academic awards
 * 8/23/18
 */
import java.util.*;
public interface DisplayMethod{
    public String generateAwardString(ArrayList<String> summa, ArrayList<String> magna, ArrayList<String> cum)
    {
    }


    public class Award implements DisplayMethod{
    	public ArrayList<String> summaCumLaude = new ArrayList<String>();
    	public ArrayList<String> magnaCumLaude = new ArrayList<String>();
    	public ArrayList<String> cumLaude = new ArrayList<String>();

    	public DisplayMethod awardDisplayMethod;

	}

    public class DisplayTabular extends Award {
   	 	public static void main(String[] args){ 
        		summaCumLaude.add("John Johnson");
        		summaCumLaude.add("Jack Jackson");
        		summaCumLaude.add("Harold Haroldson");

       	 		magnaCumLaude.add("Jane Janeson", "Rob Robson", "Harry Harrison");
        		cumLaude.add("Tony Tonyson", "Kate Kateson", "Wayne Wayneson");

        		System.out.println("+--------------------+--------------------+--------------------+");
        		System.out.println("| Summa Cum Laude    | Magna Cum Laude    | Cum Laude          |");
        		System.out.println("+--------------------+--------------------+--------------------+");
        		String awardString = awardDisplayMethod.generateAwardString();
        		String currName;
		}
	public String generateAwardString(ArrayList<String> summa, ArrayList<String> magna, ArrayList<String> cum)
    	{
        StringBuilder concatAllLists = new StringBuilder();
        for (String s : summa)
        {
            concatAllLists.append(s);
            concatAllLists.append(", ");
        }
        
        concatAllLists.append(" | ");
        
        for (String s : magna)
        {
            concatAllLists.append(s);
            concatAllLists.append(", ");
        }

        concatAllLists.append(" | ");

        for (String s : cum)
        {
            concatAllLists.append(s);
            concatAllLists.append(", ");
        }

        return concatAllLists.toString();

    }

	}
	public class DisplayLineOriented extends Award {
    		public static void main( String[] args){	
        		summaCumLaude.add("John Johnson");
        		summaCumLaude.add("Jack Jackson");
        		summaCumLaude.add("Harold Haroldson");
        		magnaCumLaude.add("Jane Janeson", "Rob Robson", "Harry Harrison");
        		cumLaude.add("Tony Tonyson", "Kate Kateson", "Wayne Wayneson");
        		System.out.print("Summa Cum Laude: ");
        		String awardString = awardDisplayMethod.generateAwardString();
        		int pipe = 0;
        		char c;
        		while(c != '|')
        		{
        			c = awardString.charAt(pipe);
         			pipe++;
        		}

        		System.out.println(awardString.subString(0, pipe));
        		pipe++;
        		int prevPipe = pipe;
    

        		System.out.print("Magna Cum Laude : ");
        		c = pipe; 
        		while(c != '|')
        		{
            			c = awardString.charAt(pipe);
            			pipe++;
        		}

        		System.out.println(awardString.subString(prevPipe, pipe));
        		pipe += 2;
        		System.out.print("Cum Laude : ");
    
        		System.out.println(awardString.subString(pipe, awardString.charAt(awardString.length() - 1)));
    		}
		public String generateAwardString(ArrayList<String> summa, ArrayList<String> magna, ArrayList<String> cum)
    		{
        	StringBuilder concatAllLists = new StringBuilder();
        	for (String s : summa)
        	{
            	concatAllLists.append(s);
            	concatAllLists.append(", ");
        	}
        
        	concatAllLists.append(" | ");
        
        	for (String s : magna)
        	{
            	concatAllLists.append(s);
            	concatAllLists.append(", ");
        	}

        	concatAllLists.append(" | ");

        	for (String s : cum)
        	{
            	concatAllLists.append(s);
            	concatAllLists.append(", ");
        	}

        	return concatAllLists.toString();

    }


    	
	}

	

	}


