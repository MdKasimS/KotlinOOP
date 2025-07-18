class OrderDataModel {



    companion object
    {
        var orderDataDictionary = mutableMapOf<OrderStatus, MutableList<Order>>()
        var orderDataList = mutableListOf<Order>()

        fun createOrders(order:Order)
        {
            if(!orderDataDictionary.containsKey(order.orderStatus))
            {
                orderDataDictionary[order.orderStatus] = mutableListOf<Order>()
                orderDataDictionary.getValue(order.orderStatus).add(order)
            }
            else
            {
                orderDataDictionary.getValue(order.orderStatus).add(order)
            }

            orderDataList.add(order)
        }

    }

}