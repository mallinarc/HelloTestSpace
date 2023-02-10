package app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//
public class TestPlay {

    public static void main(String[] args){
        String s = "UNCLASSIFIED";
        /* System.out.println("..... inside TestPlay.main():");
        String s = "UNCLASSIFIED";
        System.out.println("..... contains //:"+s.contains("//"));
        String s1 = "UNCLASSIFIED//SI/TK";
        String subStr = s1.substring((s1.indexOf("//") + 2), s1.length());
        System.out.println(subStr); */

        String[] controlMarkTokens = s.split("//");
        System.out.println(" ....... tokens in controlMark:"+Arrays.toString(controlMarkTokens));
        String s2 = "UNCLASSIFIED//SI/TK";
        String[] controlMarkTokens2 = s2.split("//");
        System.out.println(" ....... tokens in controlMark:"+Arrays.toString(controlMarkTokens2));
        Set<String> lookupSet = new HashSet<String>();
        lookupSet.add("UNCLASSIFIED");
        lookupSet.add("TOP SECRET");
        lookupSet.add("SECRET");
        lookupSet.add("CONFIDENTIAL");
        lookupSet.add("SI");
        lookupSet.add("TK");

        lookupSet.add("RSEN");
        lookupSet.add("FOUO");
        lookupSet.add("IMCON");
        lookupSet.add("NOFORN");
        lookupSet.add("RELIDO");
        lookupSet.add("REL TO");
        Set<String> controlMarkTokensSet = new HashSet<String>(Arrays.asList(controlMarkTokens2));
        System.out.println("........contains all:"+lookupSet.containsAll(controlMarkTokensSet));
        int i = 0;
        for(String token: controlMarkTokens2){
            System.out.println("..... i:"+i);
            if(i != 0){
                if(token.contains("/")){
                    String[] subTokens = token.split("/");
                    System.out.println("......sub tokens:"+Arrays.toString(subTokens));
                    Set<String> controlMarkTokensSetSub = new HashSet<String>(Arrays.asList(subTokens));
                    System.out.println("........contains all SUB :"+lookupSet.containsAll(controlMarkTokensSetSub));
                }
            }else{
                System.out.println("...... top classification:"+token);
            }
            i++;
        }
    }

    public boolean recursivelyCheckControlMarkings(String controlMarking, String type){
		if(controlMarking.contains("/")){ // combination control marking
            String[] subTokens = controlMarking.split("/");
            System.out.println("......sub tokens:"+Arrays.toString(subTokens));
            String [] filteredArr = Arrays.stream(subTokens).filter(obj -> !obj.startsWith("REL TO")).toArray(String[]::new);
            /* //for(int j = 0; j < subTokens.length; j++){
                System.out.println("....... sub token when contains /:"+subTokens[0]);
                //ClassificationMarkingEnum classificationMarkingEnum = ClassificationMarkingEnum.fromAbbreviation(subTokens[j]);
                System.out.println("..........sub token  classificationMarkingEnum:"+classificationMarkingEnum);
                if(classificationMarkingEnum == null){
                    return false;
                }else{
                    System.out.println("......... sub token  classificationMarkingEnum:"+classificationMarkingEnum.name());
                }
            //} */
            
        }else{// no combination control markings
            // check enum for matching value
            System.out.println(".......... No split necessary");
        }
        return false;
	}
    
}