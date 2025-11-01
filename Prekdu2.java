import java.util.*;

public class Prekdu2 {
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    ArrayList<String>list=new ArrayList<>();
    HashSet<String>set=new HashSet<>();
    HashMap<String,Integer>map=new HashMap<>();
System.out.println("Enter 10 strings:");
for(int i=0;i<10;i++){
  String str=sc.nextLine();
  list.add(str);
  set.add(str);
map.put(str,map.getOrDefault(str,0)+1);
}
System.out.println("List Contains: ");
for(String s:list){
  System.out.println(s);
}
System.out.println("Set Contains: ");
for(String s:set){
  System.out.println(s);
}

 System.out.println(" Frequency of the words: ");
for(Map.Entry<String,Integer>entry:map.entrySet()){
  System.out.println("Word:"+entry.getKey() + " , " + "Frequency:"+entry.getValue());
}
}
}

