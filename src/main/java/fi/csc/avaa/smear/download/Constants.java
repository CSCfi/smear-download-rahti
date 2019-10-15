package fi.csc.avaa.smear.download;

public class Constants {
    public final static String HELPCONTENT =   "<p>" +
            "Download page allows retrieving data from one station and variable category at one time without visualization. Downloading the data also shows corresponding API call for scripted queries of data." +
            "</p>" +
            "<h4>Station and variable category</h4>" +
            "<p>" +
            "Selecting station and category opens a table that shows the descriptions of the variables and the temporal coverage of each variable in the selected time window." +
            "</p>" +
            "<h4>Time span selection</h4>" +
            "<p>" +
            "Select Time span using From and To fields. You can move the time window via the Shift dropdown menu with the left and right arrows. Time is indicated at Finnish standard time (UTC+2) without daylight savings." +
            "</p>" +
            "<h4>Quality</h4>" +
            "<p>" +
            "Filter the data by its quality check status. 'Any' gives all available records. 'Quality checked' selects only those data that were rigorously checked by responsible researcher. Most variables are calculated and inserted to the database near real time with automated quality check and updated later with quality-checked data." +
            "</p>" +
            "<h4>Averaging</h4>" +
            "<p>" +
            "The data can be downloaded in the original time resolution or aggregated half-hourly or hourly. The basic time step for the data is one minute. Some variables, such as fluxes and flux ancillary data, are stored as 30 min averages. Selecting 'None' for Averaging yields the original data in the database. You can also select the aggregation method with Averaging Type menu. Arithmetic mean is good for most variables. Some variables (e.g. precipitation, runoff/drainage) are cumulative and must be summed instead of averaged to obtain e.g. correct hourly values. Averaging wind direction requires a calculation of vector mean. Time is indicated as the beginning time of the averaging time window." +
            "</p>" +
            "<h4>Variable table</h4>" +
            "<p>" +
            "Sort the variables by name, description or availability. Use Download button to download the corresponding variable in desired format. You can also download several variables in one file using Select tick boxes and Download selected button below the table." +
            "</p>";
}
