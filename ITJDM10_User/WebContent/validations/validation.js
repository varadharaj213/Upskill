function validateform()
{
	
	
	
	var uname=document.myform.uname.value;

	var password=document.myform.password.value;
	var dob=document.myform.dob.value;
	
	var mobile=document.myform.mobile.value;
	var email=document.myform.mail.value;
	var address=document.myform.address.value;
	var atposition=email.indexOf("@");  
	var dotposition=email.lastIndexOf(".");

	
	
	if(uname==null||uname=="")
		{
		alert("UserName must be filled out.");
		document.myform.uname.focus();
		return false;
		}
	if(password==null||password=="")
		{
		alert("Password must be filled out.");
		document.myform.password.focus();
		return false;
		}
	if(dob==null||dob=="")
		{
		alert("Date of Birth must be filled out.");
		document.myform.dob.focus();
		return false;
		}
	if(mobile==null||mobile=="")
		{
		alert("Mobile number must be filled out.");
		document.myform.mobile.focus();
		return false;
		}
	if(mobile.length<8||mobile.length>12)
	    {
	    alert("Enter your valid mobile number.");
	    document.myform.mobile.focus();
	    return false;
	    }
	if(email==null||email=="")
	    {
	    alert("Email id must be filled out.");
	    document.myform.mail.focus();
	    return false;
		}
	if (atposition<1 || dotposition<atposition+2 || dotposition+2>=email.length)
	    {  
		  alert("Please enter a valid e-mail address.");  
		  document.myform.mail.focus();
		  return false;  
		}  
	if(address==null||address=="")
		{
		alert("Address must be filled out.");
		document.myform.address.focus();
		return false;
		}
		return true;
	}