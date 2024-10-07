package Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "C://Users//T00225039//IdeaProjects//ProjectWork//02. Java Collections Framework//Lab//hamlet.txt";
        LinkedList<LinkedList> LineList = new LinkedList<LinkedList>();
        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                LinkedList<String> list = new LinkedList<String>();
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    System.out.println("''"+ word + "-" +lineNumber);
                    list.add(word);
                }
                LineList.add(list);
                lineNumber++;
            }
            for (int i = 0; i < LineList.size(); i++) {
                for (int j = 0; j < LineList.get(i).size(); j++) {
                    System.out.println(LineList.get(i).get(j));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
