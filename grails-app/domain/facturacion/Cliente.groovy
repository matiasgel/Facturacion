package facturacion

class Cliente {
    Integer id
    CodigoDescuento codigoDescuento
    String cp
    String nombre
    String lineaDireccion1
    String lineaDireccion2    
    String ciudad
    String provincia
    String telefono
    String fax
    String email
    Integer limiteCredito
    static mapping = {
        cp column: 'ZIP'        
        nombre column:'NAME'
        lineaDireccion1 column:'ADDRESSLINE1'
        lineaDireccion2 column:'ADDRESSLINE2'
        ciudad column:'CITY'
        provincia column:'STATE'
        telefono column:'PHONE'
        limiteCredito column:'CREDIT_LIMIT'
        table name: 'CUSTOMER'
        id column: 'CUSTOMER_ID'
        codigoDescuento column: 'discount_code'
       
    }
}
