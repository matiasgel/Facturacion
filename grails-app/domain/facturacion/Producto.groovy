package facturacion

class Producto {
    Integer id
    Fabricante fabricante
    CodigoProducto codigoProducto
    Integer quantityOnHand
    Double marcado
    Boolean existente
    Double costoCompra
    String descripcion
    static mapping = {
        table name:'PRODUCT'
        id column: 'PRODUCT_ID'        
        existente type:'true_false'
        fabricante column:'MANUFACTURER_ID'
        codigoProducto column:'PRODUCT_CODE'
        cantidad column:'QUANTITY_ON_HAND'
        marcado column:'MARKUP'
        existente column:'AVAILABLE'
        costoCompra column:'PURCHASE_COST'                
        descripcion column:'DESCRIPTION'
    }
}
