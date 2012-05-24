package facturacion

class Fabricante {
    Integer id
    String name
    String lineaDireccion1
    String lineaDireccion2
    String ciudad
    String cp
    String telefono
    String fax
    String email
    String rep
    static mapping = {
        table name: 'MANUFACTURER'
        id column : 'MANUFACTURER_ID'
        cp column:'ZIP'        
        nombre column:'NAME'
        ciudad column:'city'
        lineaDireccion1 column:'ADDRESSLINE1'
        lineaDireccion2 column:'ADDRESSLINE2'
        telefono column:'PHONE'
        
    }
}
