/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var options = {
    chart: {
        renderTo: 'container', 
        type: 'line'
    }, 
    series: [
        {
            name: 'Jane',
            data: [1, 0, 4]
        }, 
        {
            name: 'John', 
            data: [5, 7, 3]
        }
    ]
};
var chart_container = new Highcharts.Chart(options);

