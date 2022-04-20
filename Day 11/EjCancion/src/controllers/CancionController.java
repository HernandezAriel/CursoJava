package controllers;

import org.springframework.stereotype.Controller;

/**
 * BEAN: Clase simple de Java que cumple
 * ciertas normas con sus propiedades y metodos.
 * Es un COMPONENTE que nos permite encapsular
 * el contenido con la finalidad de darle mejor estructura.
 *
 * -Permite reutilizar codigo.
 * -Mejor organizacion.
 *
 * Entities que pueden ser BEAN:
 *  -Controller
 *  -Component
 *  -Repository
 *  -Configuration
 */

@RestController
public class CancionController {

    //@RequestMapping(value = "/cancion", method = RequestMethod.POST)
    @PostMapping("/cancion")

    public String mostrarNombreCancion(){
        return "Hola";
    }
}
