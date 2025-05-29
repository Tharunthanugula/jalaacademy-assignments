import java.io.*;
import java.util.Properties;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class JavaIODemo {

     1. Read text from .txt file using InputStream
    public static void readUsingInputStream(String filePath) throws IOException {
        try (InputStream is = new FileInputStream(filePath)) {
            int data;
            System.out.println("Reading using InputStream:");
            while ((data = is.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println("\n");
        }
    }

     2. Write text to .txt file using OutputStream
    public static void writeUsingOutputStream(String filePath, String text) throws IOException {
        try (OutputStream os = new FileOutputStream(filePath)) {
            byte[] bytes = text.getBytes();
            os.write(bytes);
            System.out.println("Written text using OutputStream.\n");
        }
    }

     3. Read text from a .txt file using BufferedInputStream
    public static void readUsingBufferedInputStream(String filePath) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
            int data;
            System.out.println("Reading using BufferedInputStream:");
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println("\n");
        }
    }

     4. Write text to a .txt file using BufferedOutputStream
    public static void writeUsingBufferedOutputStream(String filePath, String text) throws IOException {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
            byte[] bytes = text.getBytes();
            bos.write(bytes);
            System.out.println("Written text using BufferedOutputStream.\n");
        }
    }

     5. Read text from a .txt file using FileReader
    public static void readUsingFileReader(String filePath) throws IOException {
        try (FileReader fr = new FileReader(filePath)) {
            int data;
            System.out.println("Reading using FileReader:");
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println("\n");
        }
    }

     6. Write text to a .txt file using FileWriter
    public static void writeUsingFileWriter(String filePath, String text) throws IOException {
        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write(text);
            System.out.println("Written text using FileWriter.\n");
        }
    }

     7. Read text from a .txt file using BufferedReader
    public static void readUsingBufferedReader(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Reading using BufferedReader:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();
        }
    }

     8. Write text to a .txt file using BufferedWriter
    public static void writeUsingBufferedWriter(String filePath, String text) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(text);
            System.out.println("Written text using BufferedWriter.\n");
        }
    }

     9. Read data from properties file
    public static void readPropertiesFile(String filePath) throws IOException {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream(filePath)) {
            prop.load(input);
            System.out.println("Properties loaded:");
            for (String key : prop.stringPropertyNames()) {
                System.out.println(key + " = " + prop.getProperty(key));
            }
            System.out.println();
        }
    }

     10. Read data from Excel file using Apache POI
    public static void readExcelFile(String filePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            System.out.println("Reading Excel data:");
            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING -> System.out.print(cell.getStringCellValue() + "\t");
                        case NUMERIC -> System.out.print(cell.getNumericCellValue() + "\t");
                        case BOOLEAN -> System.out.print(cell.getBooleanCellValue() + "\t");
                        default -> System.out.print(" \t");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

     11. Write data to Excel file using Apache POI
    public static void writeExcelFile(String filePath) throws IOException {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Sheet1");
            Row header = sheet.createRow(0);
            header.createCell(0).setCellValue("ID");
            header.createCell(1).setCellValue("Name");
            header.createCell(2).setCellValue("Age");

            Row row1 = sheet.createRow(1);
            row1.createCell(0).setCellValue(1);
            row1.createCell(1).setCellValue("Alice");
            row1.createCell(2).setCellValue(23);

            Row row2 = sheet.createRow(2);
            row2.createCell(0).setCellValue(2);
            row2.createCell(1).setCellValue("Bob");
            row2.createCell(2).setCellValue(30);

            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                workbook.write(fos);
            }
            System.out.println("Excel file written successfully.\n");
        }
    }

    public static void main(String[] args) {
        String textFile = "testfile.txt";
        String propertiesFile = "config.properties";
        String excelFile = "data.xlsx";

        String sampleText = "Hello, JALA Academy!\nWelcome to JAVA IO examples.\n";

        try {
             Write text using OutputStream, then read using InputStream
            writeUsingOutputStream(textFile, sampleText);
            readUsingInputStream(textFile);

             Write and read using Buffered streams
            writeUsingBufferedOutputStream(textFile, sampleText);
            readUsingBufferedInputStream(textFile);

             Write and read using FileWriter/FileReader
            writeUsingFileWriter(textFile, sampleText);
            readUsingFileReader(textFile);

             Write and read using BufferedWriter/BufferedReader
            writeUsingBufferedWriter(textFile, sampleText);
            readUsingBufferedReader(textFile);

             Read properties file (Make sure config.properties exists with key=value pairs)
            readPropertiesFile(propertiesFile);

             Write and Read Excel file
            writeExcelFile(excelFile);
            readExcelFile(excelFile);

        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
    }
}
