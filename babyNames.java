import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVFormat;


class babyNames {
    public static void totalNames(File file) {
        try (Reader file1 = new FileReader(file)) {
            CSVParser parser = CSVFormat.DEFAULT.withIgnoreEmptyLines(true).parse(file1);
            int n_total = 0;
            int n_fem = 0;
            for (CSVRecord record : parser) {
                n_total++;
                if(record.get(1).equals("F")) {
                    n_fem++;
                }
            }
            System.out.println("Number of Boys : " + (n_total - n_fem));
            System.out.println("Number of Girls : " + n_fem);
            System.out.println("Number of Names : " + n_total);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int getRank(int year, String name, String gender) {
        int rank = -1;
        Reader file = null;
        CSVParser parser = null;
        try {
            if (year == 2012) {
                file = new FileReader("C:/Users/emira/OneDrive/Bureau/JAVA-EX/us_babynames_small/testing/yob2012short.csv");
            } else if (year == 2013) {
                file = new FileReader("C:/Users/emira/OneDrive/Bureau/JAVA-EX/us_babynames_small/testing/yob2013short.csv");
            } else {
                file = new FileReader("C:/Users/emira/OneDrive/Bureau/JAVA-EX/us_babynames_small/testing/yob2014short.csv");
            }
            parser = CSVFormat.DEFAULT.withIgnoreEmptyLines(true).parse(file);
            
            for (CSVRecord record : parser) {
                if (gender.equals(record.get(1))) {
                    rank++;
                    if(  name.equals(record.get(0))){
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return rank;
    }

    public static void testgetRank(){
        int rank = getRank(2012, "Mason", "M");
        if(rank == -1 ){
            System.out.println("Name does not exist");
        }else{
            System.out.println("the Name Mason exist in rank "+ (rank+1) );
        }
    }
    public static void main(String[] args) {
        File file = new File("C:/Users/emira/OneDrive/Bureau/JAVA-EX/us_babynames_small/testing/yob2014short.csv");
        totalNames(file);
        testgetRank();
    }
}
