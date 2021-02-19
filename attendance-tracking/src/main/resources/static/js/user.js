/***
// get all buttons and remove spinners
function clearSpinners() {
	var elements = document.getElementsByClassName("btn-outline-primary");
	for(var x=0; x < elements.length; x++)
    {
    	if (elements[x].innerHTML.includes("spinner"))
    		alert(elements[x].innerHTML.toString());
    		//elements[x].innerHTML.slide(-3);
    	}
    }
}
***/

function hideSaveMassage() {      	
  	document.getElementById("message").style.display = "none";
}

function changeButtonText() {
	
	document.getElementById("SaveButton").innerHTML=
		'<span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span> Saving...';
}

function showButtonSpinner(elementId) {
	
	var month = elementId.substring(0,3);
	document.getElementById(elementId).innerHTML=
		'<span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span> ' + month;
}

function showButtonSpinnerGenerate(elementId) {
	var month = elementId.substring(0,3);
	document.getElementById(elementId).innerHTML=
		'<span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span> Generating... ';
}

function changeDeleteButtonText() {
	if(!(confirm('Are you sure you want to delete attendance records for this date?'))) return false;
	document.getElementById("DeleteButton").innerHTML=
		'<span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span> Deleting Records...';
}

function validateVacationYears()                                    
{ 
    var elements = document.getElementByName("vacationYear");
   
    for(var i = 0; i < elements.length; i++) {
    	var tmp = elements[i].value;
    } 
   
    return false; 
}

function clearSpinners() {
	var elements = document.getElementsByClassName("btn-outline-primary");
	for(var x=0; x < elements.length; x++)
    {
		alert(elements[x].innerHTML.toString().trim());
		return;
    	
    }
}


