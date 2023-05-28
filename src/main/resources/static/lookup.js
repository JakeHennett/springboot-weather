//add some scripting logic here to make the button work


function submit() {
    var response = "Searching for current weather at " + document.getElementById("latitude").value
        + "," + document.getElementById("longitude").value + "..."
    alert(response);
    //Call into endpoint methods here
}

async function getForecast(latitude, longitude) {
    // let latitude = document.getElementsByName('latitude').value;
    // let longitude = document.getElementsByName('longitude').value;

    let forecastRequestString = "http://localhost:8080/weather/forecast/" + latitude + "/" + longitude;
    console.log(forecastRequestString);
    // alert(forecastRequestString);

    let headers = new Headers([
        ['Content-Type', 'application/json'],
        ['Accept', 'application/json']
    ]);

    let request = new Request(forecastRequestString, {
        method: 'GET',
        headers: headers
    });
    console.log(request);
    // alert(request);

    let result = await fetch(request);
    let response = await result.json();
    let forecast = response.properties.periods[0].detailedForecast;
    alert(forecast);

    // console.log(result);
    // alert(result);
}


//example async function. mimic this functionality.
async function clickedEvent(art_index, info_index) {
    //  Get Art Id
    let id = document.getElementsByTagName('img')[art_index].attributes[2].value;

    let headers = new Headers([
        ['Content-Type', 'application/json'],
        ['Accept', 'application/json']
    ]);

    let request = new Request(`https://api.artic.edu/api/v1/artworks/${id}? 
  fields=id,title,artist_display,date_display,main_reference_number`, {
        method: 'GET',
        headers: headers
    });
    let result = await fetch(request);
    let response = await result.json();
    console.log(response)

    if (showArtInfo) {
        stopShow();
    }
}
