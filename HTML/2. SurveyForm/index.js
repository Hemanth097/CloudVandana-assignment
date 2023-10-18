function submitfun(){
    
    var name = document.getElementById("name").value;
    
    var email = document.getElementById("email").value;

    var freshcheck = document.getElementsByName("fresher");
    var fresher = "";

    for (i = 0; i < freshcheck.length; i++) {
        if (freshcheck[i].checked){
            fresher = freshcheck[i].value;
        }
    }

    var refercheck = document.getElementsByName("refer");
    var refer = "";

    for (i = 0; i < refercheck.length; i++) {
        if (refercheck[i].checked){
            refer = refercheck[i].value;
        }
    }

    var satisfactioncheck = document.getElementsByName("satisfaction");
    var satisfaction = "";

    for (i = 0; i < satisfactioncheck.length; i++) {
        if (satisfactioncheck[i].checked){
            satisfaction = satisfactioncheck[i].value;
        }
    }

    var suggestions = document.getElementById("suggestions").value;

    alert("Name : " + name + "\nEmail : " + email + "\nIs this the first time you are using our products & services? : " + fresher + "\nWould you suggest to your friends and colleagues? : " + refer + "\nHow satisfied are you with the company overall? : " + satisfaction + "\nsuggestions : " + suggestions);
}