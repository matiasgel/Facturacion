package facturacion

class PrincipalController {
    
    def index() { 
    def actions= 
        (grailsApplication.getArtefact("Controller","facturacion.PracticoQueryController")
            .metaClass.methods.findAll {it.name.startsWith("punto")})
                .collect { it.name}
    ['actions':actions]            
    }
}
