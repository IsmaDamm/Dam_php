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

    <?php
        $nombre = $_POST['nombre'];
        $apellido = $_POST['apellido'];
        $nif = $_POST['nif'];
        $tel = $_POST['tel'];
        $codi = $_POST['codi'];
        $fecha = $_POST['fecha'];
        $email = $_POST['email'];
        $contra = $_POST['contra'];
        $prueba = true;
        

        if ($apellido == "") {
            $apellido = "Llena los campos obligatorios!";
            $prueba = false;
        }
        if ($email == "") {
            $email = "Llena los campos obligatorios!";
            $prueba = false;
            }
        if ($tel == "") {
            $tel = "Llena los campos obligatorios!";
            $prueba = false;
            }
        if ($nif == "") {
            $nif= "Llena los campos obligatorios!";
            $prueba = false;
            }
    ?>


        <div class="container">

            <form action="inicio.php" method="post">
                <div class="nombre">
                    <label for="nombre" class="form-label" >Nombre</label>
                    <input type="text" class="form-control" id="nombre" value = "<?php echo $nombre ?>" readonly aria-describedby="nombreHelp">
                    <div id="nombreHelp" class="form-text"></div>
                </div>
                <div class="apellidos">
                    <label for="apellidos" class="form-label">Apellidos</label>
                    <input type="text" class="form-control" id="apellidos" value = "<?php echo $apellido ?>" readonly aria-describedby="apellidosHelp">
                    <div id="apellidopsHelp" class="form-text"></div>
                </div>
                <div class="nif">
                    <label for="nombre" class="form-label">NIF</label>
                    <input type="text" class="form-control" id="nif" value = "<?php echo $nif ?>" readonly aria-describedby="nifHelp">
                    <div id="nifHelp" class="form-text"></div>
                </div>
                <div class="telefono">
                    <label for="nombre" class="form-label">Telefono</label>
                    <input type="number" class="form-control" id="telefono" value = "<?php echo $tel ?>" readonly aria-describedby="telefonoHelp">
                    <div id="telefonoHelp" class="form-text"></div>
                </div>
                <div class="codigopostal">
                    <label for="codigopostal" class="form-label">Codigo Postal</label>
                    <input type="text" class="form-control" id="nombre" value = "<?php echo $codi ?>" readonly aria-describedby="codigopostalHelp">
                    <div id="codigopostalHelp" class="form-text"></div>
                </div>
                <div class="poblacion">
                    <label for="poblacion" class="form-label">Poblacion</label>
                    <input type="text" class="form-control" id="poblacion" value = "<?php echo $pobl ?>" readonly aria-describedby="poblacionHelp">
                    <div id="poblacionHelp" class="form-text"></div>
                </div>
                <div class="fecha">
                    <label for="fecha" class="form-label">Fecha de Nacimiento</label>
                    <input type="date" class="form-control" id="fecha" value = "<?php echo $fecha ?>" readonly aria-describedby="fechaHelp">
                    <div id="fechaHelp" class="form-text"></div>
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Email address</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" value = "<?php echo $email ?>" readonly aria-describedby="emailHelp">
                    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Password</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" value = "<?php echo $contra ?>" readonly>
                </div>

                <div class="form-floating">
                    <select class="form-select" id="sexo" aria-label="Floating label select example">
                        <option selected></option>
                        <option value="1">Home</option>
                        <option value="2">Dona</option>
                    </select>
                    <label for="sexo">Escoge su sexo</label>
                </div>
                <div class="form-floating">
                    <select class="form-select" id="estado" aria-label="Floating label select example">
                        <option selected></option>
                        <option value="1">Casado</option>
                        <option value="2">Soltero</option>
                        <option value="3">Viudo</option>
                        <option value="4">Separado</option>
                        <option value="5">Otros</option>
                    </select>
                    <label for="sexo">Escoge su estado</label>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>

                
            </form>
            <!-- Content here -->
        </div>
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->
  </body>
</html>