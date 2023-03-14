package HOME_WORK_PROF.DZ2.N4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Document> documents = new ArrayList<>();
        documents.add(new Document(5,"KEK",2));
        documents.add(new Document(2,"KEKw",2));
        documents.add(new Document(3,"KEKr",2));
        var result = organizeDocuments(documents);
        System.out.println(result.toString());
    }


    public static Map<Integer, Document> organizeDocuments(List<Document> documents)
    {
        HashMap<Integer,Document> map = new HashMap<>();
        for (int i = 0; i <documents.size(); i++) {
            map.put(documents.get(i).id,documents.get(i));
        }


        return map;
    }





}
