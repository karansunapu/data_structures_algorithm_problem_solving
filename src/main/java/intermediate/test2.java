package intermediate;//i love my coutry


import java.util.Arrays;
import java.util.HashMap;

public class test2 {
    public static void main(String[] args) {
        String str = "i love my love coutry my";

        String[] strtArr = str.split(" ");

        HashMap<String, Integer> hashMap = new HashMap<>();

        for(String s : strtArr){
            if(hashMap.containsKey(s)){
                hashMap.put(s, hashMap.get(s) +1);
            } else {
                hashMap.put(s, 1);
            }
        }

        System.out.println(hashMap);



    }
}
