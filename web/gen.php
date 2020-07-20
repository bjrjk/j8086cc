<?php

if(!isset($_POST['code']))die("No j8086c code content!");

$j8086FileName = tempnam("/tmp","j8086");
$f = fopen($j8086FileName, "w");
fwrite($f, $_POST['code']);
fclose($f);

$command = "java -jar j8086cc.jar $j8086FileName 2>&1";
exec($command,$message,$retcode);
if($retcode != 0)die("Error:\n". $message);

echo '<p>j8086cInter IR:</p>';
echo '<textarea cols=40 rows=20>';
echo file_get_contents($j8086FileName . '.j8086cInter');
echo '</textarea>';

echo '<p>8086 Assembly:</p>';
echo '<textarea cols=40 rows=20>';
echo file_get_contents($j8086FileName . '.8086.asm');
echo '</textarea>';

unlink($j8086FileName);
unlink($j8086FileName . '.j8086cInter');
unlink($j8086FileName . '.8086.asm');

?>
