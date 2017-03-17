/* Filename: custom.js */
$(document).ready(function(){
	
	$('#submit').click(function(event) { 
		//alert("Hello! I am an alert box!");
		var mydistance=$('#mydistance').val(); 
		var mydistanceIn=$('[name=distin]:checked').val(); 
		var convertTo=$('[name=convertto]:checked').val(); 
		if(mydistanceIn==convertTo){ 
			alert("Cannot have same unit"); 
			return false; 
		} 
		console.log(mydistance+mydistanceIn+convertTo);
		$.get('DistanceServlet', {distance:mydistance,distIn:mydistanceIn,convert:convertTo},function(responseText) { 
			$('#convertvalue').text(responseText); 
			}); 
		}); 

});