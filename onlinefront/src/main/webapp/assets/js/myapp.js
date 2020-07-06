$(function() {
	switch(menu) {
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	default:
		if(menu == "Home") break;
		$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}
	
	// code for jquery dataTable
	var products = [
		
		['1','dogu'],
		['2','cv'],
		['3','leen'],
		['4','sam_e'],
		['5','garru'],
		['6','kritz'],
		['7','maddy'],
		['8','praks']
	];
	
	var $table = $('#productListTable');
	
	if($table.length) {
		console.log('Inside the table!');
	}
	
});