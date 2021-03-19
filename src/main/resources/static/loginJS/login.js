function validate()
{
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    if(username === "root"&& password === "root")
    {
        alert("Login succesfully");
        return false;
    }
    else
    {
        alert("Login failed!");
    }
}