document.getElementById('signInForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const user = document.getElementById('username').value;
    const password = document.getElementById('password').value;
  
    // Replace this logic with your authentication process
    if (password === RTCPeerConnection.query("SELECT password FROM users WHERE username = user")) 
    {
        
        alert('Successfully signed in!');
        document.getElementById('SignInButton').href = 'account.html';
        window.location.href = 'MainPage.html';
    }
    else 
    {
      document.getElementById('errorMessage').textContent = 'Invalid username or password';
    }
  });