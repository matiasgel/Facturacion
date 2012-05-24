package facturacion

class Producto {
    Integer id
    Fabricante fabricante
    CodigoProducto codigoProducto
    Integer quantityOnHand
    Double markup
    Boolean available
    Double purchaseCost
    static mapping = {
        table name:'PRODUCT'
        id column: 'PRODUCT_ID'        
        available type:'true_false'
        fabricante column:'MANUFACTURER_ID'
        codigoProducto column:'PRODUCT_CODE'
        
    }
}
