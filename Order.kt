class Order : Product() {

    var orderStatus : OrderStatus? = null
    var price : Double = 0.0
    var discountPercentage : Double = 0.0

    fun printDetails()
    {
        println("${Id} ${Name} ${TaxRate}")
    }

    companion object
    {
        fun OrdersDispatched()
        {

        }

        fun OrdersDelivered()
        {

        }

        fun OrdersProcessing()
        {

        }
    }

}


