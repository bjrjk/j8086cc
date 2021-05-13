<?php

if(!isset($_POST['code']))
	die("No j8086c code content!");

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
if($retcode != 0){
	foreach ($message as $value) {
		echo "$value \n <br> \n";
	}
	die("Compilation failed due to the above error. <br> \n");
}

$j8086c = file_get_contents($j8086cName);
$j8086p = file_get_contents($j8086pName);
$j8086i = file_get_contents($j8086iName);
$j8086s = file_get_contents($j8086sName);

unlink($j8086cName);
unlink($j8086pName);
unlink($j8086iName);
unlink($j8086sName);
?>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.61.0/codemirror.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.61.0/codemirror.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.61.0/mode/clike/clike.min.js"></script>
    <style>
        .center {
            text-align: center;
        }
    </style>
    <title>Online j8086cc Compiler</title>
</head>
<body>
<div class="container">
    <div class="alert alert-primary center" role="alert">
        Online j8086cc Compiler
    </div>
<p class="center">j8086c Code:</p>
<textarea cols="40" rows="20" id="j8086c">
<?php echo $j8086c; ?>
</textarea>
<br>
<p class="center">j8086p (PreProcessed Code):</p>
<textarea cols="40" rows="20" id="j8086p">
<?php echo $j8086p; ?>
</textarea>
<br>
<p class="center">j8086i (IR):</p>
<textarea cols="40" rows="20" id="j8086i">
<?php echo $j8086i; ?>
</textarea>
<br>
<p class="center">j8086s (Intel 8086 ASM):</p>
<textarea cols="40" rows="20" id="j8086s">
<?php echo $j8086s; ?>
</textarea>

<div class="center">
<p>Powered By:
<a href="https://github.com/bjrjk/j8086cc/">bjrjk/j8086cc</a>
</p>
<br>
</div>
</div>
<script>
var j8086c = CodeMirror.fromTextArea(document.getElementById("j8086c"), {
    mode: "text/x-csrc",
    lineNumbers: true,
});
var j8086p = CodeMirror.fromTextArea(document.getElementById("j8086p"), {
    mode: "text/x-csrc",
    lineNumbers: true,
});
var j8086i = CodeMirror.fromTextArea(document.getElementById("j8086i"), {
    lineNumbers: true,
});
var j8086s = CodeMirror.fromTextArea(document.getElementById("j8086s"), {
    lineNumbers: true,
});
</script>
</body>
</html>
