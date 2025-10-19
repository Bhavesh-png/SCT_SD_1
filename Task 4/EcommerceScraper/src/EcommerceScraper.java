import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.FileWriter;
import java.io.IOException;

public class EcommerceScraper {

    public static void main(String[] args) {
        String url = "https://books.toscrape.com/";
        String csvFile = "products.csv";

        try (FileWriter writer = new FileWriter(csvFile)) {
            writer.append("Product Name,Price,Rating\n");

            Document doc = Jsoup.connect(url).get();
            Elements products = doc.select(".product_pod");

            for (Element product : products) {
                String name = product.select("h3 a").attr("title");
                String price = product.select(".price_color").text();
                String rating = product.select(".star-rating").attr("class")
                        .replace("star-rating", "").trim();

                writer.append(String.format("%s,%s,%s\n", name, price, rating));
            }

            System.out.println("✅ Data successfully written to " + csvFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
