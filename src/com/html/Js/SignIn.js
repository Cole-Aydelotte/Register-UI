const { connect } = require("http2");

document.getElementById('signInForm').addEventListener('submit', function(event) {
  event.preventDefault();
  const con = connect();
  const user = document.getElementById('username').value;
  const password = document.getElementById('password').value;

  // Replace this logic with your authentication process
  if (password === con.query("SELECT password FROM users WHERE username = " + user + ";"))
  // if (password === 'cole' && user === 'cole') 
  {
     window.location.href = 'MainPage.html'; // Redirect to MainPage.html after alert
  } 
  else 
  {
      document.getElementById('errorMessage').textContent = 'Invalid username or password';
  }
});
