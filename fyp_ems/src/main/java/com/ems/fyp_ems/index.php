<?php
// Database credentials
$host="localhost";
$port=3307;
$socket="MySQL";
$user="root";
$password="";
$dbname="emsprojectDB";

$con = new mysqli($host, $user, $password, $dbname, $port, $socket)
	or die ('Could not connect to the database server' . mysqli_connect_error());

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} else {
    echo "Connected successfully to the database!";
}

// Close connection
$conn->close();
?>