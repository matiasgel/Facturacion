package facturacion
import java.sql.Types.*
class CodigoDescuento {   
    char id
    Double porcentaje
    static mapping ={
       id generator:'assigned'
       table name: 'DISCOUNT_CODE'       
       id column: 'DISCOUNT_CODE'
       porcentaje column:'RATE'       
    }
}
