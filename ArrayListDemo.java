import java.util.*;
class ArrayListDemo{
    public static void main(String[] args) {
        List<Object> s=new ArrayList<>();
        s.add("Ediyakula");
        s.add("varaprasad");
        s.add(25);
        s.add(3.14);
        for(Object r:s){
            System.out.println(r);
        }
    }
}