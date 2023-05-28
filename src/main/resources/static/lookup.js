async function getForecast(latitude, longitude) {
    let forecastRequestString = "http://localhost:8080/weather/forecast/" + latitude + "/" + longitude;

    let headers = new Headers([
        ['Content-Type', 'application/json'],
        ['Accept', 'application/json']
    ]);

    let request = new Request(forecastRequestString, {
        method: 'GET',
        headers: headers
    });

    let result = await fetch(request);
    let response = await result.json();
    let forecast = response.properties.periods[0].detailedForecast;
    alert(forecast);
}