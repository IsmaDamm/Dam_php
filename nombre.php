<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>


        <div class="container">

            <form name="formulario" action="inicio.php" method="post">
                <div class="nombre1">
                    <label for="nombre1" class="form-label" >Nombre</label>
                    <input type="text" class="form-control" id="nombre2" name = "nombres" aria-describedby="nombreHelp">
                    <div id="nombreHelp" class="form-text"></div>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
</body>