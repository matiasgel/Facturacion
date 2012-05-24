package facturacion

class OrdenCompra {
    Integer id
    Cliente cliente
    Producto producto
    Integer cantidad 
    Double costoEnvio
    java.sql.Date fechaCompra
    java.sql.Date fechaEnvio
    String envioCompany
    static mapping = {
        id column:'ORDER_NUM'
        cliente column:'CUSTOMER_ID'
        producto column:'PRODUCT_ID'        
        cantidad column:'QUANTITY'
        costoEnvio column:'SHIPPING_COST'
        fechaCompra column:'SALES_DATE'
        
        fechaEnvio column:'SHIPPING_DATE'
        envioCompany column:'FREIGHT_COMPANY'
        table name: 'PURCHASE_ORDER'
    }
}
