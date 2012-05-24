package facturacion

class CodigoProducto {
    Character id
    CodigoDescuento codigoDescuento
    String descripcion
    static mapping = {
        id generator:'assigned'
        table name:'PRODUCT_CODE'
        id column:'PROD_CODE'
        codigoDescuento column:'DISCOUNT_CODE'
        descripcion column:'DESCRIPTION'
    }
}
