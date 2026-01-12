import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CSVReader {

    // Method to fetch item details from CSV based on the item code
    public static HashMap<String, String> getItemDetails(String itemCode, String csvFilePath) {
        HashMap<String, String> itemDetails = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the CSV line by comma (assuming CSV fields are comma-separated)
                String[] fields = line.split(",");

                // Assuming the CSV format: ItemCode,Price,Weight/Size,ManufacturingDate,ExpiryDate,ManufacturerName
                String code = fields[0].trim(); // Item Code
                if (code.equals(itemCode)) {
                    // Populate the HashMap with item details
                    itemDetails.put("ItemCode", fields[0].trim());
                    itemDetails.put("Price", fields[1].trim());
                    itemDetails.put("Weight/Size", fields[2].trim());
                    itemDetails.put("ManufacturingDate", fields[3].trim());
                    itemDetails.put("ExpiryDate", fields[4].trim());
                    itemDetails.put("ManufacturerName", fields[5].trim());
                    break; // Item found, no need to read further lines
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return itemDetails;
    }

    public static void main(String[] args) {
        String itemCode = "101"; // Example item code to search for
        String csvFilePath = "items.csv"; // Path to your CSV file

        HashMap<String, String> itemDetails = getItemDetails(itemCode, csvFilePath);

        if (itemDetails.isEmpty()) {
            System.out.println("Item not found!");
        } else {
            // Display the item details
            System.out.println("Item Details:");
            for (String key : itemDetails.keySet()) {
                System.out.println(key + ": " + itemDetails.get(key));
            }
        }
    }
}
