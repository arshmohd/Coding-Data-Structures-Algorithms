class ArmstrongNumber{
    public static void main(String[] args) {
       String s= "371,134,567,153,45,370,189";
       String[] str=s.split(",");
       for(int i=0;i<str.length;i++){
        int num=Integer.parseInt(str[i]);
        int a=0,c=0;
        int temp=num;
        while(num>0){
            a=num%10;
            c=c+(a*a*a);
            num=num/10;
        }
        if(temp==c){
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }
    }
    }
}
