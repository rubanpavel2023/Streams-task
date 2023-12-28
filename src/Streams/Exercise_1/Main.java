package Streams.Exercise_1;

import Streams.Exercise_1.ListProcessing.Filter;
import Streams.Exercise_1.ListProcessing.ListCreator;
import Streams.Exercise_1.ListProcessing.Printer;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListCreator nameList = new ListCreator();
        List<String> names = nameList.getCreateList("Alex,Dmitry,Pavel,Evgeny,Andrey,Anna,Roman");

        Filter nameFilter = new Filter(names);
        List<String> filterNames = nameFilter.getFilterWords("A");

        Printer namePrinter = new Printer();
        namePrinter.printWords(filterNames);
    }
}


