import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Şeker Portakalı", 182, "Jose Mauro De Vasconcelos", 1968));
        bookList.add(new Book("Hayvan Çiftliği", 152, "George Orwell", 1945));
        bookList.add(new Book("Kürk Mantolu Madonna", 160, "Sabahattin Ali", 1943));
        bookList.add(new Book("Simyacı", 184, "Paulo Coelho", 1988));
        bookList.add(new Book("Yabancı", 111, "Albert Camus", 1942));
        bookList.add(new Book("Satranç", 77, "Stefan Zweig", 1943));
        bookList.add(new Book("Bülbülü Öldürmek", 355, "Harper Lee", 1960));
        bookList.add(new Book("Suç ve Ceza", 336, "Fyodor Dostoyevski", 1866));
        bookList.add(new Book("İtiraflarım", 95, "Tolstoy", 1882));
        bookList.add(new Book("Bilinmeyen Adanın Öyküsü", 59, "Jose Saramago", 1997));
        Map<String, String> bookMap = new HashMap<>();
        bookList.forEach(book -> bookMap.put(book.getName(), book.getAuthor()));
        System.out.println("*** KİTAP LİSTESİ ***");
        for (String b : bookMap.keySet()) {
            System.out.println("Kitap Adı : " + b + " - Yazarı : " + bookMap.get(b));
        }
        System.out.println("*** KİTAP LİSTESİ - 100 Sayfadan Fazla Olanlar ***");
        List<Book> filterList = bookList.stream().filter(book -> book.getPage() > 100).collect(Collectors.toList());
        filterList.forEach(book -> System.out.println("Kitap Adı :" + book.getName() + ", Sayfa Sayısı : " + book.getPage() + ", Yazar : " + book.getAuthor()));
    }
}
