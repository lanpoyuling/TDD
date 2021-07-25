package com.example.tdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectTools {
    protected static List<String> transferArrayToList(String[] array) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, array);
        return strings;
    }
}
