<!DOCTYPE html>

<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
</head>
<body>
<div class="container">
    <div class="jumbotron alert-danger">
        <h1>Oops. Something went wrong</h1>
        <#if status?? && error??>
            <h2>${status} ${error}</h2>
        <#else>
            <h2>Generic error</h2>
        </#if>

    </div>
</div>
</body>

</html>
