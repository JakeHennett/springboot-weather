package com.snhu.weather;

public class Point {
    
}

//example object
// {
//     "@context": [
//         "https://geojson.org/geojson-ld/geojson-context.jsonld",
//         {
//             "@version": "1.1",
//             "wx": "https://api.weather.gov/ontology#",
//             "s": "https://schema.org/",
//             "geo": "http://www.opengis.net/ont/geosparql#",
//             "unit": "http://codes.wmo.int/common/unit/",
//             "@vocab": "https://api.weather.gov/ontology#",
//             "geometry": {
//                 "@id": "s:GeoCoordinates",
//                 "@type": "geo:wktLiteral"
//             },
//             "city": "s:addressLocality",
//             "state": "s:addressRegion",
//             "distance": {
//                 "@id": "s:Distance",
//                 "@type": "s:QuantitativeValue"
//             },
//             "bearing": {
//                 "@type": "s:QuantitativeValue"
//             },
//             "value": {
//                 "@id": "s:value"
//             },
//             "unitCode": {
//                 "@id": "s:unitCode",
//                 "@type": "@id"
//             },
//             "forecastOffice": {
//                 "@type": "@id"
//             },
//             "forecastGridData": {
//                 "@type": "@id"
//             },
//             "publicZone": {
//                 "@type": "@id"
//             },
//             "county": {
//                 "@type": "@id"
//             }
//         }
//     ],
//     "id": "https://api.weather.gov/points/35.0587,-81.9695",
//     "type": "Feature",
//     "geometry": {
//         "type": "Point",
//         "coordinates": [
//             -81.969499999999996,
//             35.058700000000002
//         ]
//     },
//     "properties": {
//         "@id": "https://api.weather.gov/points/35.0587,-81.9695",
//         "@type": "wx:Point",
//         "cwa": "GSP",
//         "forecastOffice": "https://api.weather.gov/offices/GSP",
//         "gridId": "GSP",
//         "gridX": 79,
//         "gridY": 53,
//         "forecast": "https://api.weather.gov/gridpoints/GSP/79,53/forecast",
//         "forecastHourly": "https://api.weather.gov/gridpoints/GSP/79,53/forecast/hourly",
//         "forecastGridData": "https://api.weather.gov/gridpoints/GSP/79,53",
//         "observationStations": "https://api.weather.gov/gridpoints/GSP/79,53/stations",
//         "relativeLocation": {
//             "type": "Feature",
//             "geometry": {
//                 "type": "Point",
//                 "coordinates": [
//                     -81.977929000000003,
//                     35.045009999999998
//                 ]
//             },
//             "properties": {
//                 "city": "Boiling Springs",
//                 "state": "SC",
//                 "distance": {
//                     "unitCode": "wmoUnit:m",
//                     "value": 1704.6957306454001
//                 },
//                 "bearing": {
//                     "unitCode": "wmoUnit:degree_(angle)",
//                     "value": 26
//                 }
//             }
//         },
//         "forecastZone": "https://api.weather.gov/zones/forecast/SCZ108",
//         "county": "https://api.weather.gov/zones/county/SCC083",
//         "fireWeatherZone": "https://api.weather.gov/zones/fire/SCZ108",
//         "timeZone": "America/New_York",
//         "radarStation": "KGSP"
//     }
// }