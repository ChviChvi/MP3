package com.example.materialepladsen.Database

import java.sql.ResultSet

data class Product(
    val group: String,
    val id: String,
    val articleNumber: String,
    val articleName: String,
    val size: String?,
    val weightM3: String,
    val priceExcludeTax: String,
    val priceIncludeTax: String,
    val unit: String,
    val availability: String?,
    val imageURL: String?
)

fun getProductsResultSet(): ResultSet {
    val selectSql = "SELECT * FROM [dbo].[v_mobileApp_products]"
    return sqlQuery(selectSql)!!
}

fun getProducts(): List<Product> {
    val products = mutableListOf<Product>()
    val resultSet = getProductsResultSet()
    while (resultSet.next()) {
        val product = Product(
            resultSet.getString("product_group"),
            resultSet.getString("id"),
            resultSet.getString("product_articlenumber"),
            resultSet.getString("product_articleName"),
            resultSet.getString("product_size"),
            resultSet.getString("product_WeightM3"),
            resultSet.getString("product_price_dkk_excludingTax"),
            resultSet.getString("product_price_dkk_includingTax"),
            resultSet.getString("unit"),
            resultSet.getString("availability"),
            resultSet.getString("product_image")
        )
        products.add(product)
    }
    return products
}