//add some scripting logic here to make the button work


function submit() {
    var response = "Searching for current weather at " + document.getElementById("latitude").value
        + "," + document.getElementById("longitude").value + "..."
    alert(response);
    //Call into endpoint methods here
}

async function getForecast(longitude, latitude) {
    let result = await fetch(request);
    let response = await result.json();
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
