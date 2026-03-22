import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        try {
            // Website laden
            Document doc = Jsoup.connect("https://www.spiegel.de").get();

            // Überschriften holen
            Elements headlines = doc.select("h2, h3");

            // Ausgabe
            for (int i = 0; i < headlines.size(); i++) {
                System.out.println((i+1) + "." + headlines.get(i).text());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
