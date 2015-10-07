
<?php
header("Access-Control-Allow-Credentials: true");
header("Access-Control-Allow-Origin: http://url:8080");
header("Access-Control-Allow-Methods: GET, POST, PUT, DELETE, OPTIONS");
header("Access-Control-Allow-Headers: Origin, X-Requested-With, Content-Type, Accept, Authorization");

if($_SERVER['REQUEST_METHOD'] == 'OPTIONS') {
   header( "HTTP/1.1 200 OK" );
   exit();
}


$realm = 'Restricted area';

$password = 'somepassword';

$users = array('someusername' => $password);


if (isset($_SERVER['PHP_AUTH_USER']) == false ||  isset($_SERVER['PHP_AUTH_PW']) == false) {
    header('WWW-Authenticate: Basic realm="My Realm"');

    die('Not authorised');
}

if (isset($users[$_SERVER['PHP_AUTH_USER']]) && $users[$_SERVER['PHP_AUTH_USER']] == $password) 
{
    header( "HTTP/1.1 200 OK" );
    echo 'You are logged in!' ;
    exit();
}
?>