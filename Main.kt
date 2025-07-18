fun main()
{
    var orderToCreate = arrayListOf(Order(Name="Phone", Id=101, TaxRate = 18.0, orderStatus = OrderStatus.PROCESSING, price = 15000.0, discountPercentage =  10.0)
                                    ,Order(Name="Laptop", Id=102, TaxRate = 18.0, orderStatus = OrderStatus.DISPATCHED, price = 55000.0, discountPercentage = 5.0)
                                    ,Order(Name="Tablet", Id=103, TaxRate = 12.0, orderStatus = OrderStatus.DELIVERED, price = 25000.0, discountPercentage = 7.0)
                                    ,Order(Name="Monitor", Id=104, TaxRate = 18.0, orderStatus = OrderStatus.RETURNED, price = 12000.0, discountPercentage = 3.0)
                                    ,Order(Name="Keyboard", Id=105, TaxRate = 5.0, orderStatus = OrderStatus.CANCELLED, price = 1500.0,discountPercentage =  2.0)
                                    ,Order(Name="Mouse", Id=106, TaxRate = 5.0, orderStatus = OrderStatus.PROCESSING, price = 700.0, discountPercentage = 1.0)
                                    ,Order(Name="Printer", Id=107,TaxRate = 18.0, orderStatus = OrderStatus.DISPATCHED, price = 8000.0, discountPercentage = 6.0)
                                    ,Order(Name="Camera", Id=108, TaxRate = 18.0, orderStatus = OrderStatus.DELIVERED, price = 30000.0, discountPercentage = 8.0)
                                    ,Order(Name="Smartwatch", Id=110, TaxRate = 12.0,orderStatus = OrderStatus.DISPATCHED, price = 9000.0, discountPercentage = 9.0)
                                    ,Order(Name="Speaker", Id=109, TaxRate = 12.0, orderStatus = OrderStatus.PROCESSING, price = 3500.0, discountPercentage = 4.0))

    for(i in orderToCreate)
    {
        OrderDataModel.createOrders(i)
    }

    OrderDataModel.orderDataList.sortByDescending { order-> order.price }

    for(i in OrderDataModel.orderDataList)
    {
        println(i.toString())
    }

//    for(i in OrderDataModel.orderDataDictionary.keys)
//    {
//        println("---------${i}-----------")
//        for(j in OrderDataModel.orderDataDictionary.getValue(i))
//        {
//            println(j)
//        }
//    }

    println(Order.OrdersDelivered())
    println(Order.OrdersDispatched())
    println(Order.OrdersProcessing())
}