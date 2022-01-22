package practice.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class SearchSuggestor {

    /*
     * Complete the 'searchSuggestions' function below.
     *
     * The function is expected to return a 2D_STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY repository
     *  2. STRING customerQuery
     */

    public static void main(String[] args) {
        List<String> repository = new ArrayList<>();
        repository.add("mobile");
        repository.add("mouse");
        repository.add("Moneypot");
        repository.add("monitor");
        repository.add("mousepad");
        List<String> collect = repository.stream().map(a -> a.toLowerCase()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(searchSuggestions(repository, "mouse"));
    }

    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
    // Write your code here

        List<List<String>> sLists = new ArrayList<>();
        for(int i=2;i<=customerQuery.length();i++){
            String searchTerm = customerQuery.substring(0,i);
            List<String> result = searchInRepository(searchTerm,repository);
            sLists.add(result);
        }

        return sLists;
    }
    
    public static List<String> searchInRepository(String term, List<String> repository){
        List<String> collect = repository.stream().sorted().filter(a -> a.startsWith(term)).collect(Collectors.toList());

        if(collect.size()>3){
            List<String> collectNew = new ArrayList<>();
            collectNew.add(collect.get(0)); collectNew.add(collect.get(1)); collectNew.add(collect.get(2));
            return collectNew;
        }else{
            return collect;
        }
    }

}