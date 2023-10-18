
function reverse(text){
	let limit = -1;
	let rev = "";
	for (var i = 0; i < text.length; i++) {
		if(text[i] == ' '){
			for(var j = i - 1; j > limit; j--){
				rev = rev + text[j];
			}
			limit = i;
			rev = rev + " ";
		}
	}

	for(var j = text.length - 1; j > limit; j--){
		rev = rev + text[j];
	}
	console.log(rev);
}

reverse("This is a sunny day");
