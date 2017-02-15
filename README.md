# Supreme-Pancake
Based on running the mergesort algorithm on many arrays of different lengths, and measuring the time it took in milliseconds, average run times were synthesized. 
Using this data, a graph was plotted to represent it visually. The link is here: https://docs.google.com/spreadsheets/d/1nJfYaayP-T9ycAJQCTNdA-V1wZZR--OjntgAycNBkzo/edit?usp=sharing
The data we've acquired is as follows:





<!DOCTYPE html>
<html no_gl="true" lang="en">
<head>

  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta name="apple-mobile-web-app-capable" content="yes" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=0" />
  <!--chrome=1 enables chrome frame; IE=edge specifies that IE should run in the highest mode available to that version of IE.-->
  <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1" />
  <meta name="Description" content="CS" />

      <meta property="og:title" content="CS" />

  <meta property="og:site_name" content="Desmos Graphing Calculator" />
  <meta property="og:image" content="https://s3.amazonaws.com/calc_thumbs/production/2juwnclyrg.png" />
  <link rel="image_src" href="https://s3.amazonaws.com/calc_thumbs/production/2juwnclyrg.png" />

  <link rel="stylesheet" href="/assets/build/calculator_desktop-e99fe1bc84b9125d740529e849dbb563a241c196.min.css" />

  <title>CS</title>

  <link rel="apple-touch-icon-precomposed" href="/assets/img/apple-touch-icon-precomposed.png"> <!-- 57x57 -->
  <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/assets/img/apple-touch-icon-72x72-precomposed.png">
  <link rel="apple-touch-icon-precomposed" sizes="76x76" href="/assets/img/apple-touch-icon-76x76-precomposed.png">
  <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/assets/img/apple-touch-icon-114x114-precomposed.png">
  <link rel="apple-touch-icon-precomposed" sizes="120x120" href="/assets/img/apple-touch-icon-120x120-precomposed.png">
  <link rel="apple-touch-icon-precomposed" sizes="144x144" href="/assets/img/apple-touch-icon-144x144-precomposed.png">
  <link rel="apple-touch-icon-precomposed" sizes="152x152" href="/assets/img/apple-touch-icon-152x152-precomposed.png">
  <link rel="apple-touch-icon-precomposed" sizes="180x180" href="/assets/img/apple-touch-icon-180x180-precomposed.png">
  <link rel="icon" sizes="192x192" href="/assets/img/touch-icon-192x192.png"> <!-- for Chrome on Android -->
  <link rel="icon" href="/favicon.ico" type="image/x-icon" />

  <style type='text/css'>
  body {
    font-family: Arial, sans-serif;
  }
  @-moz-keyframes dcg-loading-pulse {
    0% {
      opacity: 0;
    }
    20% {
      opacity: 1;
    }
    80% {
      opacity: 0;
      -moz-transform: scale(1.5, 1.5);
    }
    100% {
      opacity: 0;
      -moz-transform: scale(1.5, 1.5);
    }
  }
  @-webkit-keyframes dcg-loading-pulse {
    0% {
      opacity: 0;
    }
    20% {
      opacity: 1;
    }
    80% {
      opacity: 0;
      -webkit-transform: scale(1.5, 1.5);
    }
    100% {
      opacity: 0;
      -webkit-transform: scale(1.5, 1.5);
    }
  }
  @-o-keyframes dcg-loading-pulse {
    0% {
      opacity: 0;
    }
    20% {
      opacity: 1;
    }
    80% {
      opacity: 0;
      -o-transform: scale(1.5, 1.5);
    }
    100% {
      opacity: 0;
      -o-transform: scale(1.5, 1.5);
    }
  }
  @keyframes dcg-loading-pulse {
    0% {
      opacity: 0;
    }
    20% {
      opacity: 1;
    }
    80% {
      opacity: 0;
      transform: scale(1.5, 1.5);
    }
    100% {
      opacity: 0;
      transform: scale(1.5, 1.5);
    }
  }

  .dcg-loading-div-container {
    position: absolute;
    left: 0;
    right: 0;
    top: 0;
    bottom: 0;
    background: #FFF;
    z-index: 1000;
  }

  .dcg-loading-background-div {
    animation: dcg-loading-pulse 2.2s infinite;
    left: 50%;
    background: #eee;
    width: 140px;
    height: 140px;
    display: inline-block;
    moz-animation: dcg-loading-pulse 2.2s infinite;
    ms-animation: dcg-loading-pulse 2.2s infinite;
    o-animation: dcg-loading-pulse 2.2s infinite;
    webkit-animation: dcg-loading-pulse 2.2s infinite;
    position: absolute;
    top: 50%;
    left: 50%;
    margin-left: -70px;
    margin-top: -70px;
    border-radius: 50%;
    -webkit-border-radius: 50%;
    -moz-border-radius: 50%;
    -ms-border-radius: 50%;
    -o-border-radius: 50%;
  }

  .dcg-loading-div {
    color: #fff;
    font-size: 18px;
    left: 50%;
    width: 140px;
    height: 140px;
    display: inline-block;
    text-align: center;
    position: absolute;
    top: 50%;
    left: 50%;
    color: transparent;
    margin-left: -70px;
    margin-top: -70px;
    border-radius: 50%;
    -webkit-border-radius: 50%;
    -moz-border-radius: 50%;
    -ms-border-radius: 50%;
    -o-border-radius: 50%;
    background: no-repeat center center;
    background-size: 120px 25px;
    background-image:url(data:image/png;base64,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);
  }
</style>

</head>
<body
  data-load-data="{&#34;graph&#34;: {&#34;stateUrl&#34;: &#34;https://calc-states.s3.amazonaws.com/production/2juwnclyrg&#34;, &#34;thumbUrl&#34;: &#34;https://s3.amazonaws.com/calc_thumbs/production/2juwnclyrg.png&#34;, &#34;hash&#34;: &#34;2juwnclyrg&#34;, &#34;title&#34;: &#34;CS&#34;, &#34;created&#34;: &#34;2017-02-15T07:10:27.874Z&#34;, &#34;access&#34;: &#34;link&#34;, &#34;state&#34;: {&#34;graph&#34;: {&#34;projectorMode&#34;: false, &#34;xAxisLabel&#34;: &#34;&#34;, &#34;showYAxis&#34;: true, &#34;viewport&#34;: {&#34;xmin&#34;: -23.937004138838674, &#34;ymin&#34;: -20.447258236744517, &#34;ymax&#34;: 39.162405458128944, &#34;xmax&#34;: 67.10744314512822}, &#34;xAxisStep&#34;: 0, &#34;squareAxes&#34;: true, &#34;xAxisNumbers&#34;: true, &#34;polarMode&#34;: false, &#34;polarNumbers&#34;: true, &#34;yAxisLabel&#34;: &#34;&#34;, &#34;showGrid&#34;: true, &#34;yAxisMinorSubdivisions&#34;: 0, &#34;yAxisArrowMode&#34;: &#34;NONE&#34;, &#34;showXAxis&#34;: true, &#34;yAxisStep&#34;: 0, &#34;degreeMode&#34;: false, &#34;yAxisNumbers&#34;: true, &#34;xAxisArrowMode&#34;: &#34;NONE&#34;, &#34;xAxisMinorSubdivisions&#34;: 0}, &#34;expressions&#34;: {&#34;list&#34;: [{&#34;latex&#34;: &#34;y\\ =\\ n&#34;, &#34;domain&#34;: {&#34;max&#34;: &#34;1&#34;, &#34;min&#34;: &#34;0&#34;}, &#34;residualVariable&#34;: &#34;&#34;, &#34;color&#34;: &#34;#388c46&#34;, &#34;dragMode&#34;: &#34;AUTO&#34;, &#34;secret&#34;: false, &#34;label&#34;: &#34;&#34;, &#34;showLabel&#34;: false, &#34;style&#34;: &#34;normal&#34;, &#34;regressionParameters&#34;: {}, &#34;hidden&#34;: false, &#34;isLogModeRegression&#34;: false, &#34;type&#34;: &#34;expression&#34;, &#34;id&#34;: &#34;3&#34;}, {&#34;latex&#34;: &#34;y\\ =\\log_2\\left(n\\right)&#34;, &#34;domain&#34;: {&#34;max&#34;: &#34;1&#34;, &#34;min&#34;: &#34;0&#34;}, &#34;residualVariable&#34;: &#34;&#34;, &#34;color&#34;: &#34;#fa7e19&#34;, &#34;dragMode&#34;: &#34;AUTO&#34;, &#34;secret&#34;: false, &#34;label&#34;: &#34;&#34;, &#34;showLabel&#34;: false, &#34;style&#34;: &#34;normal&#34;, &#34;regressionParameters&#34;: {}, &#34;hidden&#34;: false, &#34;isLogModeRegression&#34;: false, &#34;type&#34;: &#34;expression&#34;, &#34;id&#34;: &#34;4&#34;}, {&#34;latex&#34;: &#34;y\\ =\\ n\\log_2\\left(n\\right)&#34;, &#34;domain&#34;: {&#34;max&#34;: &#34;1&#34;, &#34;min&#34;: &#34;0&#34;}, &#34;residualVariable&#34;: &#34;&#34;, &#34;color&#34;: &#34;#2d70b3&#34;, &#34;dragMode&#34;: &#34;AUTO&#34;, &#34;secret&#34;: false, &#34;label&#34;: &#34;&#34;, &#34;showLabel&#34;: false, &#34;style&#34;: &#34;normal&#34;, &#34;regressionParameters&#34;: {}, &#34;hidden&#34;: false, &#34;isLogModeRegression&#34;: false, &#34;type&#34;: &#34;expression&#34;, &#34;id&#34;: &#34;10&#34;}, {&#34;secret&#34;: false, &#34;type&#34;: &#34;table&#34;, &#34;id&#34;: &#34;6&#34;, &#34;columns&#34;: [{&#34;latex&#34;: &#34;x_1&#34;, &#34;style&#34;: &#34;point&#34;, &#34;color&#34;: &#34;#000000&#34;, &#34;dragMode&#34;: &#34;NONE&#34;, &#34;columnMode&#34;: &#34;POINTS&#34;, &#34;values&#34;: [&#34;1&#34;, &#34;5&#34;, &#34;10&#34;, &#34;50&#34;, &#34;100&#34;, &#34;1000&#34;], &#34;hidden&#34;: true, &#34;id&#34;: &#34;7&#34;}, {&#34;latex&#34;: &#34;y_1&#34;, &#34;style&#34;: &#34;point&#34;, &#34;color&#34;: &#34;#c74440&#34;, &#34;dragMode&#34;: &#34;NONE&#34;, &#34;columnMode&#34;: &#34;POINTS&#34;, &#34;values&#34;: [&#34;0&#34;, &#34;1.2&#34;, &#34;3.7&#34;, &#34;18.4&#34;, &#34;37.3&#34;, &#34;484.2&#34;], &#34;hidden&#34;: false, &#34;id&#34;: &#34;8&#34;}]}, {&#34;latex&#34;: &#34;&#34;, &#34;domain&#34;: {&#34;max&#34;: &#34;1&#34;, &#34;min&#34;: &#34;0&#34;}, &#34;residualVariable&#34;: &#34;&#34;, &#34;color&#34;: &#34;#fa7e19&#34;, &#34;dragMode&#34;: &#34;AUTO&#34;, &#34;secret&#34;: false, &#34;label&#34;: &#34;&#34;, &#34;showLabel&#34;: false, &#34;style&#34;: &#34;normal&#34;, &#34;regressionParameters&#34;: {}, &#34;hidden&#34;: false, &#34;isLogModeRegression&#34;: false, &#34;type&#34;: &#34;expression&#34;, &#34;id&#34;: &#34;11&#34;}]}, &#34;version&#34;: 3}, &#34;parent_hash&#34;: null}, &#34;seed&#34;: &#34;776d301b30764a68b860880a30cd763d&#34;, &#34;user&#34;: {&#34;name&#34;: &#34;Alexandra Fomina&#34;, &#34;email&#34;: &#34;alexandrafomina4@gmail.com&#34;}}"
  class="dcg-tap-container"
>

  <div class="dcg-loading-div-container">
  <div class="dcg-loading-background-div"></div>
  <div class="dcg-loading-div">Loading...</div>
</div>


  <!-- GRAPHER -->
  <div class="dcg-sliding-interior">
    <!-- this is where the tools go. leaving div in because I like it aesthetically during load-up -->
    <div class="dcg-header"></div>

    <div id="graph-container"></div>
  </div>

  <div id="mygraphs-container"></div>

  
<!-- 1pixel white image for printing in FF -->
<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAIAAACQd1PeAAAAAXNSR0IArs4c6QAAAAlwSFlzAAALEwAACxMBAJqcGAAAAAd0SU1FB9wLEhYhKmtn2wYAAAAidEVYdENvbW1lbnQAQ3JlYXRlZCB3aXRoIEdJTVAgb24gYSBNYWOHqHdDAAAADElEQVQI12P4//8/AAX+Av7czFnnAAAAAElFTkSuQmCC" id="whitebg" aria-hidden="true" alt="">
 <!-- 1 white pixel for printing in FF -->
  


<script type="text/javascript">
  // catches errors within iframe and promotes them to qunit during tests
  try {
    window.onerror=window.top.onerror;
  } catch (ex){}
  if(!window.Desmos) window.Desmos = {};
  window.Desmos.config = {};
</script>
 <!-- Pull config information, and include it in Desmos.config -->
  <!-- TODO - get console and pushstate into regular .js files -->
  <script type="text/javascript">
  if(!window.console) window.console = {};
  if(!window.console.log) window.console.log = function(){};
</script>
 <!-- Make sure console.log is defined -->
  <script type="text/javascript">
  if(window.location.protocol === 'file:')
    window.history.pushState = function(){};
</script>
 <!-- Make sure we don't use pushstate on file protocol -->

  
  <script src="/assets/build/calculator_desktop-0b3cd9b68d2521420da7746a47b094a38af999a9.min.js"></script>
  <script>
    require(['toplevel/calculator_desktop', 'testbridge', 'jquery'], function (calcPromise, TestBridge, $) {
      $('.dcg-loading-div-container').hide();
      calcPromise.then(function(calc) {
        window.Calc = calc;
        TestBridge.ready();
      });
    });
  </script>
</body>
</html>

Judging from the shape of the graph, we can safely conclude that the runtime of mergesort is O(N)???? It is linear??? Aha! Fear not for the grpah can sometimes be deceptive. Even a nlog(n) graph can appear linear when zoomed in. But if you zoom out and see the BIGGER PICTURE! Like at this link, 
you will find that merge sort is O(nlog(n)); it is log linear.  It looks like a steep line when zoomed out but when zoomed in the range of small numbers it appears as log linear
