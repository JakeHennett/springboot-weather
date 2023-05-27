package com.snhu.weather;

public class Forecast {
    
}

//example object
// {
//     "@context": [
//         "https://geojson.org/geojson-ld/geojson-context.jsonld",
//         {
//             "@version": "1.1",
//             "wx": "https://api.weather.gov/ontology#",
//             "geo": "http://www.opengis.net/ont/geosparql#",
//             "unit": "http://codes.wmo.int/common/unit/",
//             "@vocab": "https://api.weather.gov/ontology#"
//         }
//     ],
//     "type": "Feature",
//     "geometry": {
//         "type": "Polygon",
//         "coordinates": [
//             [
//                 [
//                     -97.137207000000004,
//                     39.7444372
//                 ],
//                 [
//                     -97.1367549,
//                     39.7223799
//                 ],
//                 [
//                     -97.108080900000004,
//                     39.722725199999999
//                 ],
//                 [
//                     -97.108527000000009,
//                     39.744782499999999
//                 ],
//                 [
//                     -97.137207000000004,
//                     39.7444372
//                 ]
//             ]
//         ]
//     },
//     "properties": {
//         "updated": "2023-05-27T12:09:32+00:00",
//         "units": "us",
//         "forecastGenerator": "BaselineForecastGenerator",
//         "generatedAt": "2023-05-27T15:18:10+00:00",
//         "updateTime": "2023-05-27T12:09:32+00:00",
//         "validTimes": "2023-05-27T06:00:00+00:00/P7DT19H",
//         "elevation": {
//             "unitCode": "wmoUnit:m",
//             "value": 456.89519999999999
//         },
//         "periods": [
//             {
//                 "number": 1,
//                 "name": "Today",
//                 "startTime": "2023-05-27T10:00:00-05:00",
//                 "endTime": "2023-05-27T18:00:00-05:00",
//                 "isDaytime": true,
//                 "temperature": 81,
//                 "temperatureUnit": "F",
//                 "temperatureTrend": null,
//                 "probabilityOfPrecipitation": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": null
//                 },
//                 "dewpoint": {
//                     "unitCode": "wmoUnit:degC",
//                     "value": 10.555555555555555
//                 },
//                 "relativeHumidity": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 51
//                 },
//                 "windSpeed": "10 to 15 mph",
//                 "windDirection": "SE",
//                 "icon": "https://api.weather.gov/icons/land/day/few?size=medium",
//                 "shortForecast": "Sunny",
//                 "detailedForecast": "Sunny, with a high near 81. Southeast wind 10 to 15 mph."
//             },
//             {
//                 "number": 2,
//                 "name": "Tonight",
//                 "startTime": "2023-05-27T18:00:00-05:00",
//                 "endTime": "2023-05-28T06:00:00-05:00",
//                 "isDaytime": false,
//                 "temperature": 58,
//                 "temperatureUnit": "F",
//                 "temperatureTrend": null,
//                 "probabilityOfPrecipitation": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": null
//                 },
//                 "dewpoint": {
//                     "unitCode": "wmoUnit:degC",
//                     "value": 9.4444444444444446
//                 },
//                 "relativeHumidity": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 62
//                 },
//                 "windSpeed": "5 to 15 mph",
//                 "windDirection": "SE",
//                 "icon": "https://api.weather.gov/icons/land/night/sct?size=medium",
//                 "shortForecast": "Partly Cloudy",
//                 "detailedForecast": "Partly cloudy, with a low around 58. Southeast wind 5 to 15 mph."
//             },
//             {
//                 "number": 3,
//                 "name": "Sunday",
//                 "startTime": "2023-05-28T06:00:00-05:00",
//                 "endTime": "2023-05-28T18:00:00-05:00",
//                 "isDaytime": true,
//                 "temperature": 81,
//                 "temperatureUnit": "F",
//                 "temperatureTrend": null,
//                 "probabilityOfPrecipitation": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 20
//                 },
//                 "dewpoint": {
//                     "unitCode": "wmoUnit:degC",
//                     "value": 12.777777777777779
//                 },
//                 "relativeHumidity": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 64
//                 },
//                 "windSpeed": "5 to 15 mph",
//                 "windDirection": "SE",
//                 "icon": "https://api.weather.gov/icons/land/day/rain_showers,20?size=medium",
//                 "shortForecast": "Slight Chance Rain Showers",
//                 "detailedForecast": "A slight chance of rain showers after 7am. Partly sunny, with a high near 81. Southeast wind 5 to 15 mph, with gusts as high as 25 mph. Chance of precipitation is 20%."
//             },
//             {
//                 "number": 4,
//                 "name": "Sunday Night",
//                 "startTime": "2023-05-28T18:00:00-05:00",
//                 "endTime": "2023-05-29T06:00:00-05:00",
//                 "isDaytime": false,
//                 "temperature": 60,
//                 "temperatureUnit": "F",
//                 "temperatureTrend": null,
//                 "probabilityOfPrecipitation": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 20
//                 },
//                 "dewpoint": {
//                     "unitCode": "wmoUnit:degC",
//                     "value": 12.777777777777779
//                 },
//                 "relativeHumidity": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 81
//                 },
//                 "windSpeed": "10 mph",
//                 "windDirection": "SE",
//                 "icon": "https://api.weather.gov/icons/land/night/tsra_hi,20?size=medium",
//                 "shortForecast": "Slight Chance Showers And Thunderstorms",
//                 "detailedForecast": "A slight chance of rain showers before 7pm, then a slight chance of showers and thunderstorms. Partly cloudy, with a low around 60. Southeast wind around 10 mph. Chance of precipitation is 20%."
//             },
//             {
//                 "number": 5,
//                 "name": "Memorial Day",
//                 "startTime": "2023-05-29T06:00:00-05:00",
//                 "endTime": "2023-05-29T18:00:00-05:00",
//                 "isDaytime": true,
//                 "temperature": 84,
//                 "temperatureUnit": "F",
//                 "temperatureTrend": null,
//                 "probabilityOfPrecipitation": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 30
//                 },
//                 "dewpoint": {
//                     "unitCode": "wmoUnit:degC",
//                     "value": 16.111111111111111
//                 },
//                 "relativeHumidity": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 84
//                 },
//                 "windSpeed": "10 to 15 mph",
//                 "windDirection": "S",
//                 "icon": "https://api.weather.gov/icons/land/day/tsra_hi,20/tsra_hi,30?size=medium",
//                 "shortForecast": "Chance Showers And Thunderstorms",
//                 "detailedForecast": "A chance of showers and thunderstorms. Mostly sunny, with a high near 84. South wind 10 to 15 mph, with gusts as high as 20 mph. Chance of precipitation is 30%."
//             },
//             {
//                 "number": 6,
//                 "name": "Monday Night",
//                 "startTime": "2023-05-29T18:00:00-05:00",
//                 "endTime": "2023-05-30T06:00:00-05:00",
//                 "isDaytime": false,
//                 "temperature": 61,
//                 "temperatureUnit": "F",
//                 "temperatureTrend": null,
//                 "probabilityOfPrecipitation": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 30
//                 },
//                 "dewpoint": {
//                     "unitCode": "wmoUnit:degC",
//                     "value": 16.111111111111111
//                 },
//                 "relativeHumidity": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 97
//                 },
//                 "windSpeed": "10 to 15 mph",
//                 "windDirection": "S",
//                 "icon": "https://api.weather.gov/icons/land/night/tsra_hi,30/tsra_hi,20?size=medium",
//                 "shortForecast": "Chance Showers And Thunderstorms",
//                 "detailedForecast": "A chance of showers and thunderstorms before 1am. Partly cloudy, with a low around 61. South wind 10 to 15 mph, with gusts as high as 20 mph. Chance of precipitation is 30%."
//             },
//             {
//                 "number": 7,
//                 "name": "Tuesday",
//                 "startTime": "2023-05-30T06:00:00-05:00",
//                 "endTime": "2023-05-30T18:00:00-05:00",
//                 "isDaytime": true,
//                 "temperature": 86,
//                 "temperatureUnit": "F",
//                 "temperatureTrend": null,
//                 "probabilityOfPrecipitation": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 20
//                 },
//                 "dewpoint": {
//                     "unitCode": "wmoUnit:degC",
//                     "value": 16.666666666666668
//                 },
//                 "relativeHumidity": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 97
//                 },
//                 "windSpeed": "10 to 15 mph",
//                 "windDirection": "S",
//                 "icon": "https://api.weather.gov/icons/land/day/sct/tsra_hi,20?size=medium",
//                 "shortForecast": "Mostly Sunny then Slight Chance Showers And Thunderstorms",
//                 "detailedForecast": "A slight chance of showers and thunderstorms after 1pm. Mostly sunny, with a high near 86. South wind 10 to 15 mph, with gusts as high as 20 mph. Chance of precipitation is 20%."
//             },
//             {
//                 "number": 8,
//                 "name": "Tuesday Night",
//                 "startTime": "2023-05-30T18:00:00-05:00",
//                 "endTime": "2023-05-31T06:00:00-05:00",
//                 "isDaytime": false,
//                 "temperature": 61,
//                 "temperatureUnit": "F",
//                 "temperatureTrend": null,
//                 "probabilityOfPrecipitation": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 20
//                 },
//                 "dewpoint": {
//                     "unitCode": "wmoUnit:degC",
//                     "value": 15.555555555555555
//                 },
//                 "relativeHumidity": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 90
//                 },
//                 "windSpeed": "10 mph",
//                 "windDirection": "S",
//                 "icon": "https://api.weather.gov/icons/land/night/tsra_hi,20?size=medium",
//                 "shortForecast": "Slight Chance Showers And Thunderstorms",
//                 "detailedForecast": "A slight chance of showers and thunderstorms before 1am. Partly cloudy, with a low around 61. South wind around 10 mph, with gusts as high as 20 mph. Chance of precipitation is 20%."
//             },
//             {
//                 "number": 9,
//                 "name": "Wednesday",
//                 "startTime": "2023-05-31T06:00:00-05:00",
//                 "endTime": "2023-05-31T18:00:00-05:00",
//                 "isDaytime": true,
//                 "temperature": 86,
//                 "temperatureUnit": "F",
//                 "temperatureTrend": null,
//                 "probabilityOfPrecipitation": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 30
//                 },
//                 "dewpoint": {
//                     "unitCode": "wmoUnit:degC",
//                     "value": 17.222222222222221
//                 },
//                 "relativeHumidity": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 93
//                 },
//                 "windSpeed": "10 to 15 mph",
//                 "windDirection": "S",
//                 "icon": "https://api.weather.gov/icons/land/day/sct/tsra_hi,30?size=medium",
//                 "shortForecast": "Mostly Sunny then Chance Showers And Thunderstorms",
//                 "detailedForecast": "A chance of showers and thunderstorms after 1pm. Mostly sunny, with a high near 86. South wind 10 to 15 mph, with gusts as high as 20 mph. Chance of precipitation is 30%."
//             },
//             {
//                 "number": 10,
//                 "name": "Wednesday Night",
//                 "startTime": "2023-05-31T18:00:00-05:00",
//                 "endTime": "2023-06-01T06:00:00-05:00",
//                 "isDaytime": false,
//                 "temperature": 62,
//                 "temperatureUnit": "F",
//                 "temperatureTrend": null,
//                 "probabilityOfPrecipitation": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 30
//                 },
//                 "dewpoint": {
//                     "unitCode": "wmoUnit:degC",
//                     "value": 15.555555555555555
//                 },
//                 "relativeHumidity": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 87
//                 },
//                 "windSpeed": "10 to 15 mph",
//                 "windDirection": "S",
//                 "icon": "https://api.weather.gov/icons/land/night/tsra_hi,30/tsra_hi,20?size=medium",
//                 "shortForecast": "Chance Showers And Thunderstorms",
//                 "detailedForecast": "A chance of showers and thunderstorms. Partly cloudy, with a low around 62. Chance of precipitation is 30%."
//             },
//             {
//                 "number": 11,
//                 "name": "Thursday",
//                 "startTime": "2023-06-01T06:00:00-05:00",
//                 "endTime": "2023-06-01T18:00:00-05:00",
//                 "isDaytime": true,
//                 "temperature": 87,
//                 "temperatureUnit": "F",
//                 "temperatureTrend": null,
//                 "probabilityOfPrecipitation": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 30
//                 },
//                 "dewpoint": {
//                     "unitCode": "wmoUnit:degC",
//                     "value": 17.222222222222221
//                 },
//                 "relativeHumidity": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 93
//                 },
//                 "windSpeed": "10 to 15 mph",
//                 "windDirection": "S",
//                 "icon": "https://api.weather.gov/icons/land/day/tsra_hi,20/tsra_hi,30?size=medium",
//                 "shortForecast": "Chance Showers And Thunderstorms",
//                 "detailedForecast": "A chance of showers and thunderstorms. Mostly sunny, with a high near 87. Chance of precipitation is 30%."
//             },
//             {
//                 "number": 12,
//                 "name": "Thursday Night",
//                 "startTime": "2023-06-01T18:00:00-05:00",
//                 "endTime": "2023-06-02T06:00:00-05:00",
//                 "isDaytime": false,
//                 "temperature": 64,
//                 "temperatureUnit": "F",
//                 "temperatureTrend": null,
//                 "probabilityOfPrecipitation": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 30
//                 },
//                 "dewpoint": {
//                     "unitCode": "wmoUnit:degC",
//                     "value": 16.666666666666668
//                 },
//                 "relativeHumidity": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 90
//                 },
//                 "windSpeed": "10 to 15 mph",
//                 "windDirection": "SE",
//                 "icon": "https://api.weather.gov/icons/land/night/tsra_hi,30/tsra_hi,20?size=medium",
//                 "shortForecast": "Chance Showers And Thunderstorms",
//                 "detailedForecast": "A chance of showers and thunderstorms. Partly cloudy, with a low around 64. Chance of precipitation is 30%."
//             },
//             {
//                 "number": 13,
//                 "name": "Friday",
//                 "startTime": "2023-06-02T06:00:00-05:00",
//                 "endTime": "2023-06-02T18:00:00-05:00",
//                 "isDaytime": true,
//                 "temperature": 86,
//                 "temperatureUnit": "F",
//                 "temperatureTrend": null,
//                 "probabilityOfPrecipitation": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 40
//                 },
//                 "dewpoint": {
//                     "unitCode": "wmoUnit:degC",
//                     "value": 17.777777777777779
//                 },
//                 "relativeHumidity": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 93
//                 },
//                 "windSpeed": "10 to 15 mph",
//                 "windDirection": "SE",
//                 "icon": "https://api.weather.gov/icons/land/day/tsra_hi,30/tsra_hi,40?size=medium",
//                 "shortForecast": "Chance Showers And Thunderstorms",
//                 "detailedForecast": "A chance of showers and thunderstorms. Mostly sunny, with a high near 86. Chance of precipitation is 40%."
//             },
//             {
//                 "number": 14,
//                 "name": "Friday Night",
//                 "startTime": "2023-06-02T18:00:00-05:00",
//                 "endTime": "2023-06-03T06:00:00-05:00",
//                 "isDaytime": false,
//                 "temperature": 62,
//                 "temperatureUnit": "F",
//                 "temperatureTrend": null,
//                 "probabilityOfPrecipitation": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 40
//                 },
//                 "dewpoint": {
//                     "unitCode": "wmoUnit:degC",
//                     "value": 17.222222222222221
//                 },
//                 "relativeHumidity": {
//                     "unitCode": "wmoUnit:percent",
//                     "value": 97
//                 },
//                 "windSpeed": "5 to 15 mph",
//                 "windDirection": "SE",
//                 "icon": "https://api.weather.gov/icons/land/night/tsra_hi,40/tsra_hi,30?size=medium",
//                 "shortForecast": "Chance Showers And Thunderstorms",
//                 "detailedForecast": "A chance of showers and thunderstorms. Partly cloudy, with a low around 62. Chance of precipitation is 40%."
//             }
//         ]
//     }
// }