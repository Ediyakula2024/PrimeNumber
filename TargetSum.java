import java.util.*;
class TargetSum{
    public static void main(String[] args){
    int a[]={2,11,7,15};
    int k=9;
    List<Integer> s=new ArrayList<>();
    for(int i=0;i<=a.length-1;i++){
        for(int j=i+1;j<=a.length-1;j++){
            if(a[i]+a[j]==k){
                s.add(i);
                s.add(j);
            }
        }
    }
    System.out.println(s);
    }
}

/* Output
java TargetSum      
[0,2]
*/