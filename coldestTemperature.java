import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVFormat;

class coldestTemperature{
    public static CSVRecord coldestHourInfile(CSVParser parser){
        CSVRecord coldest = null ;
        for(CSVRecord record : parser){
            if (record.get("TemperatureF").equals("N/A")) {
                continue;
            }
            if(coldest == null){
                coldest = record ; 
            }else{
                double cold = Double.parseDouble( coldest.get("TemperatureF"));
                double currentTemp = Double.parseDouble(record.get("TemperatureF"));
                if(currentTemp < cold){
                    coldest = record ; 
                }
            }
        }
        return coldest; 
    }
    public static void testColdestHourInFile(){
        try {
            Reader file = new FileReader("C:/Users/emira/OneDrive/Bureau/JAVA-EX/nc_weather/nc_weather/2014/weather-2014-05-01.csv");
            CSVParser parser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(file);
            CSVRecord coldest = coldestHourInfile(parser);
            System.out.println("the Coldest Temperature was " + coldest.get("TemperatureF") +" at : "+  coldest.get("DateUTC"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // Handle missing file case
        } catch (IOException e) {
            e.printStackTrace();
            // Handle other I/O errors
        }
        
        
    }
    public static String fileWithColdestTemperature(){
        try {
            File folder = new File("C:/Users/emira/OneDrive/Bureau/JAVA-EX/nc_weather/nc_weather/2014");
            File[] listOfFiles = folder.listFiles();
            CSVRecord theLowestTemp = null ; 
            String filepath= "";
            for(File file : listOfFiles){
                Reader file1 = new FileReader(file.getAbsolutePath());
                CSVParser parser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(file1);
                CSVRecord coldest = coldestHourInfile(parser);
                if (theLowestTemp == null || Double.parseDouble(coldest.get("TemperatureF")) < Double.parseDouble(theLowestTemp.get("TemperatureF"))) {
                    theLowestTemp = coldest;
                    filepath = file.getName();
                }
                
            } 
            System.out.println("the lowestTemp was "+ theLowestTemp.get("Humidity") +" at: "+ theLowestTemp.get("DateUTC") +"at that year 2014");   
            return filepath;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "NotFound ";
            // Handle missing file case
        } catch (IOException e) {
            e.printStackTrace();
            return "Not Found";
            // Handle other I/O errors
        }
                 
    }
    public static void testfileWithColdestTemperature(){
        
        String filepath = fileWithColdestTemperature();
        System.out.println("the file that contains the Coldest Temperature : " + filepath); 
        
    }
    public static CSVRecord lowestHumidityInFile(CSVParser parser){
        CSVRecord lowestHum = null;
        for (CSVRecord record : parser) {
            String humidityStr = record.get("Humidity");
            // Skip this record if the humidity is "N/A"
            if (humidityStr.equals("N/A")) {
                continue;
            }
            double currentHumidity = Double.parseDouble(humidityStr);
            // If this is the first record or if the current humidity is lower, update lowestHum
            if (lowestHum == null || currentHumidity < Double.parseDouble(lowestHum.get("Humidity"))) {
                lowestHum = record;
            }
        }
        return lowestHum;
    }
    public static void testLowestHumidityInFile(){
        try {
            Reader file = new FileReader("C:/Users/emira/OneDrive/Bureau/JAVA-EX/nc_weather/nc_weather/2014/weather-2014-04-01.csv");
            CSVParser parser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(file);
            CSVRecord record = lowestHumidityInFile(parser);
            System.out.println("the Lowest Humidity : "+record.get("Humidity") +" at : "+ record.get("DateUTC"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // Handle missing file case
        } catch (IOException e) {
            e.printStackTrace();
            // Handle other I/O errors
        }
        
        
    }
    public static String lowestHumidityInManyFiles(){
        try {
            File folder = new File("C:/Users/emira/OneDrive/Bureau/JAVA-EX/nc_weather/nc_weather/2014/");
            File[] listOfFiles = folder.listFiles();
            CSVRecord theLowestHum = null; 
            String filepath= "";
            for(File file : listOfFiles){
                Reader file1 = new FileReader(file.getAbsolutePath());
                CSVParser parser = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(file1);
                CSVRecord lowest = lowestHumidityInFile(parser);
                
                if( (theLowestHum == null)|| Double.parseDouble(lowest.get("Humidity"))< Double.parseDouble(theLowestHum.get("Humidity"))){
                    theLowestHum = lowest;
                    filepath = file.getName();
                }
                
            }
            System.out.println("the lowestHumidity was "+ theLowestHum.get("Humidity") +"at: "+ theLowestHum.get("DateUTC") +"at that year 2014");   
            return filepath;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "NotFound";
            // Handle missing file case
        } catch (IOException e) {
            e.printStackTrace();
            return "NotFound";
            // Handle other I/O errors
        }
        
        
    }
    public static void testLowestHumidityInManyFiles(){
        String filepath = lowestHumidityInManyFiles();
        System.out.println("the file that contains : " + filepath); 
    }
    
    public static void main(String[] args){
        testColdestHourInFile();
        testfileWithColdestTemperature();
        testLowestHumidityInFile();
        testLowestHumidityInManyFiles();
    }
}