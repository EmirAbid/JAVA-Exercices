import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVFormat;


public class testparser{
    public static void test(){
        try{
            Reader file = new FileReader("exportdata.csv");
            CSVParser parser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(file);
            String info = countryInfo(parser, "Nauru");
            System.out.println(info);
            listExportsTwoProducts(parser, "gold" , "diamonds"); 
            int countryGold = numberOfExporters(parser, "sugar");
            System.out.println(countryGold);
            bigExports(parser, "$999,999,999,999");
        }catch (IOException e ){
            e.getStackTrace();
        }
        
    }
    public static String countryInfo(CSVParser parser , String country){
        String str = "Not Found. ";
        for(CSVRecord record : parser){
            String count = record.get("Country");
            if(count.equals(country)== true){
                str =  country + " :" + record.get("Exports") + " : "  + record.get("Value (dollars)") ;
            }
        }
        return str; 
    }
    public static void listExportsTwoProducts(CSVParser parser, String exportItem1 , String exportItem2) { 
        for(CSVRecord record : parser){
            if(record.get("Exports").contains(exportItem1) && record.get("Exports").contains(exportItem2)){
                String country = record.get("Country");
                System.out.println(country); 
            }
        }
    }
    public static int numberOfExporters(CSVParser parser, String exportItem){
        int count = 0 ; 
        for(CSVRecord record : parser){
            if(record.get("Exports").contains(exportItem)){
                count++; 
            }
        }
        return count;
    }
    public static void bigExports(CSVParser parser, String in){
        for(CSVRecord record : parser){
            String value = record.get("Value (dollars)");
            if(value.length()> in.length()){
                System.out.println(record.get("Country")+" : "+ record.get("Value (dollars)"));
            }
        }
    }
    
    public static void main(String[] args) {
        test(); // Call the test method.
    }
}