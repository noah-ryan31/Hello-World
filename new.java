<!DOCTYPE html>
<!-- All HTML documents begin and end with an "html" tag -->
<html lang="en">

  <!-- The "header" is the part of your document where you provide the browser with important information like stylesheets you have used -->
 <head>
  <title>Hello</title>  <!-- This text shows up on the tab in your browser -->
  <link 
 </head>

  <!-- The "body" is the part of your document where you include all content you want to show up in the browser -->
 <body>
  window.onscroll = function() {
  var el = document.getElementsByClassName('header')[0];
  var className = 'small';
  if (el.classList) {
    if (window.scrollY > 10)
      el.classList.add(className);
    else
      el.classList.remove(className);
  }
};
 </body>
   
</html> 
