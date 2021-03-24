package realestatelisttings;

public class ReversStringInGroupsOfFourZekari {
    private static String solution(String s){
        int len=s.length();
        int totalGroupsOfFour= len/4;
        int groupWithLessFourChars=0;
        if((len%4)>0){
            groupWithLessFourChars=len%4;
        }
        StringBuilder newString =new StringBuilder("");
        int count=0;
        for(int i=0;i<totalGroupsOfFour;i++){
            newString.append(reverse(s.substring(count,count+4)));
            count+=4;
        }
        if(groupWithLessFourChars>0){
            newString.append(reverse(s.substring(len-groupWithLessFourChars,len)));
        }
        return String.valueOf(newString);
    }

    private static String reverse(String s){
        byte[] strAsByteArray = s.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        return new String(result);
    }

    public static void main(String args[]){
        System.out.println(solution("Lorem at"));
        System.out.println(solution(" Tempor ip"));
    }
}
