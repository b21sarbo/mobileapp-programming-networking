
# Rapport

To-do list:
[x] Fork the app networking and clone the fork from your own Github repository in Android Studio
[] Remember to keep your commits brief and your commit messages informative. A reader of the commit history should be able to determine what change is included in a particular commit. We require at least 3-4 commits that are meaningful and not part of the Readme-report.
[x] Add a `RecyclerView` to your layout
[] Add a `ArrayList<Mountain>` as a member variable in your activity
[] Add a `RecyclerView.Adapter` as a member variable in your activity
[] Create a RecyclerView.Adapter and a RecyclerView.ViewHolder
[] Use getJson() to download your json data by changing the JSON_URL and write code in onPostExecute().
    [] Use the FamousPeaksJSON URL
    [] Hint: Use `adapter.notifyDataSetChanged();` after updating the list to let the adapter know that it should update the contents of the RecyclerView
[] Display the names of the mountains in the `RecyclerView` Hint: override `toString()` in your Mountain class
[] Write a short report where you explain the things that you have done
[] Upload all artifacts as described in the assignment requirements


**Skriv din rapport här!**

_Du kan ta bort all text som finns sedan tidigare_.

## Följande grundsyn gäller dugga-svar:

- Ett kortfattat svar är att föredra. Svar som är längre än en sida text (skärmdumpar och programkod exkluderat) är onödigt långt.
- Svaret skall ha minst en snutt programkod.
- Svaret skall inkludera en kort övergripande förklarande text som redogör för vad respektive snutt programkod gör eller som svarar på annan teorifråga.
- Svaret skall ha minst en skärmdump. Skärmdumpar skall illustrera exekvering av relevant programkod. Eventuell text i skärmdumpar måste vara läsbar.
- I de fall detta efterfrågas, dela upp delar av ditt svar i för- och nackdelar. Dina för- respektive nackdelar skall vara i form av punktlistor med kortare stycken (3-4 meningar).

Programkod ska se ut som exemplet nedan. Koden måste vara korrekt indenterad då den blir lättare att läsa vilket gör det lättare att hitta syntaktiska fel.

```
function errorCallback(error) {
    switch(error.code) {
        case error.PERMISSION_DENIED:
            // Geolocation API stöds inte, gör något
            break;
        case error.POSITION_UNAVAILABLE:
            // Misslyckat positionsanrop, gör något
            break;
        case error.UNKNOWN_ERROR:
            // Okänt fel, gör något
            break;
    }
}
```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
