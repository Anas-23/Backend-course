package id.kawahedukasi;
import java.util.*;

public class ListAndMap {
    public static void main (String[] args){
        // a
        Map<String, String> Employee = new HashMap<>();
        Employee.put("Name", "Anas Fatur Rahman");
        Employee.put("Salary", "Rp. 50.000.000");
        Employee.put("Married", "Single");
        Map<String, Object> result1 = new HashMap<>();
        result1.put("employee", Employee);
        System.out.println(result1);
        System.out.println("==========================================================");

        // b
        List<Map<String, Object>> employees = new ArrayList<>();
        Map<String, Object> shyam = new HashMap<>();
        shyam.put("name", "Shyam");
        shyam.put("email", "shyamjaiswal@gmail.com");

        Map<String, Object> bob = new HashMap<>();
        bob.put("name", "Bob");
        bob.put("email", "bob32@gmail.com");

        Map<String, Object> jai = new HashMap<>();
        jai.put("name", "Jai");
        jai.put("email", "jai87@gmail.com");

        employees.add(shyam);
        employees.add(bob);
        employees.add(jai);
        Map<String, Object> result2 = new HashMap<>();
        result2.put("employees", employees);
        System.out.println(result2);
        System.out.println("==========================================================");


        // c
        List<Map<String, Object>> menuitem = new ArrayList<>();
        Map<String, Object> New = new HashMap<>();
        New.put("value", "New");
        New.put("onclick", "CreateDoc()");

        Map<String, Object> Open = new HashMap<>();
        Open.put("value", "Open");
        Open.put("onclick", "OpenDoc()");

        Map<String, Object> Save = new HashMap<>();
        Save.put("value", "Save");
        Save.put("onclick", "SaveDoc()");

        menuitem.add(New);
        menuitem.add(Open);
        menuitem.add(Save);

        Map<String, Object> menu = new HashMap<>();
        menu.put("id", "file");
        menu.put("value", "File");
        menu.put("pop up", menuitem);

        Map<String, Object> result3 = new HashMap<>();
        result3.put("menu", menu);
        System.out.println(result3);
        System.out.println("==========================================================");


        // d
        Map<String, Object> window = new HashMap<>();
        window.put("title", "Sample Konfabulator Widget");
        window.put("name", "main_window");
        window.put("width", 500);
        window.put("height", 500);

        Map<String, Object> image = new HashMap<>();
        image.put("src", "Images/Sun.png");
        image.put("name", "sun1");
        image.put("hOffset", 250);
        image.put("vOffset", 250);
        image.put("allignment", "center");

        Map<String, Object> text = new HashMap<>();
        text.put("data", "Click Here");
        text.put("size", 36);
        text.put("style", "bold");
        text.put("name", "text1");
        text.put("hOffset", 250);
        text.put("vOffset", 100);
        text.put("allignment", "center");
        text.put("onMouseUp", "sun1.opacity = (sun1.opacity/100)*90");



        Map<String, Object> widget = new HashMap<>();
        widget.put("debug", "on");
        widget.put("window", window);
        widget.put("image",image);
        widget.put("text", text);

        Map<String, Object> result4 = new HashMap<>();
        result4.put("widget", widget);
        System.out.println(result4);
        System.out.println("==========================================================");


        // e
        List<String> GlossSeeAlso = new ArrayList<>();
        GlossSeeAlso.add("GML");
        GlossSeeAlso.add("XML");


        Map<String, Object> GlossDef = new HashMap<>();
        GlossDef.put("para","A meta-markup language, used to create markup languages such as DocBook.");
        GlossDef.put("GlossSeeAlso",GlossSeeAlso);

        Map<String, Object> GlossEntry = new HashMap<>();
        GlossEntry.put("ID","SGML");
        GlossEntry.put("SortAs","SGML");
        GlossEntry.put("GlossTerm","Standard Generalized Markup Language");
        GlossEntry.put("Acronym","SGML");
        GlossEntry.put("Abbrev","ISO 8879:1986");
        GlossEntry.put("GlossSee","markup");
        GlossEntry.put("GlossDef",GlossDef);


        Map<String, Object> GlossDiv = new HashMap<>();
        GlossDiv.put("title","S");
        GlossDiv.put("GlossList", GlossEntry);

        Map<String, Object> glossary = new HashMap<>();
        glossary.put("title", "example glossary");
        glossary.put("GlossDiv", GlossDiv);

        Map<String, Object> result5 = new HashMap<>();
        result5.put("glossary", glossary);
        System.out.println(result5);
    }
}
