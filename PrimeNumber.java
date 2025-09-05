class PrimeNumber{
    public static void main(String[] args){
        int a=7;
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count=count+1;
            }
        }
        if(count==2){
            System.out.println("This is the PrimeNumber");
        }
        else{
            System.out.println("This is not PrimeNumber");
        }
    }
}