import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

fun main() {
    val url = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
    val selectForQuotes =
        "div.sc-1vlzmga-2.dzxAnh article"
    val doc: Document =
        Jsoup.connect(url)
            .get()
    println(doc.title())
    val quotes: Elements = doc.select(selectForQuotes)

    for (quote in quotes) {
        println(quote.text()
        )
    }
}