<?php

if(!isset($_POST['code']))die("No j8086c code content!");

$j8086BaseFileName = tempnam("/tmp","j8086");
$j8086cName = $j8086BaseFileName . ".j8086c";
$j8086pName = $j8086BaseFileName . ".j8086p";
$j8086iName = $j8086BaseFileName . ".j8086i";
$j8086sName = $j8086BaseFileName . ".j8086s";
$f = fopen($j8086cName, "w");
fwrite($f, $_POST['code']);
fclose($f);

$command = "java -jar j8086cc.jar $j8086cName 2>&1";
exec($command,$message,$retcode);
if($retcode != 0)die("Error:\n". $message);

echo '<p>j8086p (PreProcessed Code):</p>';
echo '<textarea cols=40 rows=20>';
echo file_get_contents($j8086pName);
echo '</textarea>';

echo '<p>j8086i (IR):</p>';
echo '<textarea cols=40 rows=20>';
echo file_get_contents($j8086iName);
echo '</textarea>';

echo '<p>j8086s (Intel 8086 ASM):</p>';
echo '<textarea cols=40 rows=20>';
echo file_get_contents($j8086sName);
echo '</textarea>';

unlink($j8086cName);
unlink($j8086pName);
unlink($j8086iName);
unlink($j8086sName);

?>
