class Solution {
    public int romanToInt(String s) {
        int t=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            int val=value(s.charAt(i));
            if(i>0)
            {
                int next=value(s.charAt(i-1));
                if(val>next)
                {
                    
                    t += val;
                    t -= next;
                    i--; 
                }
                else
                {
                    t+=val;
                }
            }
            else
            {
                t+=val;
            }
            
            
        }
        return t;
    }
    public static int value(char s)
    {
        if(s=='I') return 1;
        else if(s=='V') return 5;
        else if(s=='X') return 10;
        else if(s=='L') return 50;
        else if(s=='C') return 100;
        else if(s=='D') return 500;
        else if(s=='M') return 1000;
        return 0;
    }
    
}