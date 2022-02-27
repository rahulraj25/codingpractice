package practice.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

public class FreshPromoExample {

    public static void main(String[] args) {
        List<String> codeList = new ArrayList<>();
        List<String> shopCart = new ArrayList<>();
        codeList.add("apple");
        shopCart.add("apple");
        System.out.println(foo(codeList, shopCart));
    }

    public static int foo(List<String> codeList, List<String> shoppingCart) {

        if(codeList.isEmpty())
            return 1;
        else{
            List<String> toSearch = new ArrayList<>();

            for(String searchterm : codeList){
                StringTokenizer token = new StringTokenizer(searchterm," ");
                while(token.hasMoreTokens()){

                    if(token.toString().equals("anything")){
                        toSearch.add("");
                    }else{
                        toSearch.add(token.nextToken());
                    }
                }
                if(searchInShoppingCart(shoppingCart, toSearch))
                    return 1;
            }

            return 0;
        }

    }

    public static boolean searchInShoppingCart(List<String> shoppingCart, List<String> toSearch){
        int searchSpan = toSearch.size();
        for(int i=0;i<shoppingCart.size() - (searchSpan - 1);i++){
            if(Objects.equals(getSubList(shoppingCart,i,i+toSearch.size()), toSearch)){
                return true;
            }
        }
        return false;
    }

    public static List<String> getSubList(List<String> originaList, int from, int to){

        ArrayList<String> str = new ArrayList<>();
        //from--;
        to--;
        for(int i=from;i<=to;i++){
            str.add(originaList.get(i));
        }

        return str;
    }

}
