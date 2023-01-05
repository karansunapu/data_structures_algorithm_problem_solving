package java_streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class top_city_by_zip {

    static class Record {
        private String zip;
        private String city;

        public Record(String zip, String city) {this.zip = zip;this.city = city;}
        public String getZip() {return zip;}
        public void setZip(String zip) {this.zip = zip;}
        public String getCity() {return city;}
        public void setCity(String city) {this.city = city;}
        @Override
        public String toString() {
            return "Record{" +
                    "zip='" + zip + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        final Collection<Record> records = new ArrayList<>();
        records.add(new Record("11111", "Orlando"));
        records.add(new Record("11111", "Orlando"));
        records.add(new Record("11111", "Orlando"));
        records.add(new Record("11111", "Los Angeles"));
        records.add(new Record("11111", "Los Angeles"));
        records.add(new Record("11111", "San Francisco"));

        records.add(new Record("22222", "Cincinatti"));
        records.add(new Record("22222", "Cleveland"));
        records.add(new Record("22222", "Cleveland"));
        records.add(new Record("22222", "Columbus"));
        records.add(new Record("22222", "Columbus"));
        records.add(new Record("22222", "Columbus"));

//        final Map<String, List<Record>> recordsByZip = records.stream()
//                .collect(Collectors.groupingBy(Record::getZip));
//
//        recordsByZip.forEach((zip, entries) -> {
//            final Map<String, Long> frequencyMap = entries.stream()
//                    .map(Record::getCity)
//                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//            System.out.println("Frequency map for zip " + zip);
//            frequencyMap.forEach((city, frequency) -> System.out.println(city + ": " + frequency));
//            System.out.println();
//        });

        final Map<String, List<Record>> recordsByZip = records.stream().collect(Collectors.groupingBy(Record::getZip));
        recordsByZip.forEach((zip, record) -> {
                    System.out.println("The records for zip : " + zip);
                    record.stream().collect(Collectors.groupingBy(Record::getCity,Collectors.counting()))
                            .forEach((city, count) -> System.out.println(city + " : " + count));
                    System.out.println();
                }
                );

        Map<String, String> mostFrequentCities = records.stream().collect(
                Collectors.groupingBy(Record::getZip,
                        Collectors.collectingAndThen(
                                Collectors.groupingBy(Record::getCity, Collectors.counting()),
                                map -> map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey()
                        ))
        );

        System.out.println(mostFrequentCities);
    }
}
