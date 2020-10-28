package parser;

import models.Products;

import java.io.*;
import java.util.Scanner;

public class Parsing {
    private static Products products;
    private static File testXml;
    private static File testXsd;

    private static String xml;
    private static String xsd;

    public static void change() {
        Scanner scanner = new Scanner(System.in);
        //xml = "D:/Study/JavaCode/java-automation/module8_Xml_HW/products.xml";
        //xsd = "D:/Study/JavaCode/java-automation/module8_Xml_HW/products.xsd";
        addXmlPath(scanner);
        addXsdPath(scanner);
        testXml = new File(xml);
        testXsd = new File(xsd);
        products = (Products) XmlParser.deserialize(testXml, testXsd, Products.class);

    }

    public static void addXmlPath(Scanner scanner) {
        System.out.println("Enter absolute path to xml-file");
        xml = scanner.nextLine();


    }
    public static void addXsdPath(Scanner scanner){
        System.out.println("Enter absolute path to xsd-file");
        xsd = scanner.nextLine();

    }

    public static Products getProducts() {
        return products;
    }

    public static File getTestXml() {
        return testXml;
    }
}

