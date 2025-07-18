class Order(Id: Int, Name: String, TaxRate: Double, var orderStatus : OrderStatus = OrderStatus.PROCESSING, var price : Double, var discountPercentage : Double):Product(Id, Name, TaxRate)
{

    fun printDetails()
    {
        println("${Id} ${Name} ${TaxRate}")
    }

    companion object
    {
        fun OrdersDispatched(): MutableList<Order>
        {
            if(OrderDataModel.orderDataDictionary.containsKey(OrderStatus.DISPATCHED))
            {
               return OrderDataModel.orderDataDictionary.getValue(OrderStatus.DISPATCHED)
            }
            return mutableListOf<Order>()
        }

        fun OrdersDelivered(): MutableList<Order>
        {
            if(OrderDataModel.orderDataDictionary.containsKey(OrderStatus.DELIVERED))
            {
                return OrderDataModel.orderDataDictionary.getValue(OrderStatus.DELIVERED)
            }
            return mutableListOf<Order>()
        }

        fun OrdersProcessing(): MutableList<Order>
        {
            if(OrderDataModel.orderDataDictionary.containsKey(OrderStatus.PROCESSING))
            {
                return OrderDataModel.orderDataDictionary.getValue(OrderStatus.PROCESSING)
            }
            return mutableListOf<Order>()
        }
    }


    override fun toString():String
    {
        return "Order { Id: ${Id}, Name: ${Name}, Price: ${price}, Discount: ${discountPercentage}, Tax: ${TaxRate}, Status: ${orderStatus} }"
    }


}


