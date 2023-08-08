
public class LongestPalindrome {


    public static int expandFromMiddle(String s,int left,int right){

        if(s==null || left > right)return 0;

        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){

            left--;
            right++;
        }

        return right - left -1;
    }

    public static String longestSubString(String s){


        int start = 0;
        int end = 0;

        for(int index=0; index<s.length();index++){

            int len1 = expandFromMiddle(s,index,index);
            int len2 = expandFromMiddle(s,index,index+1);
            int len = Math.max(len1,len2);

            if(len > end - start){

                start = index-((len-1)/2);
                end = index+(len/2);
            }
        }

            return s.substring(start,end+1);

    }

    public static void main(String...args){


        String s = "abadca";
        String result = longestSubString(s);
        System.out.println(result);
    }
}
