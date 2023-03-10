package com.example.materialepladsen.SERVER.Network.unusedfiles.Database

import java.sql.*

data class DatabaseConstants(
    val host: String = "",
    val port: String = "",
    val database: String = "",
    val username: String = "",
    val password: String = "",
    val server: String = "",
    val encrypt: String = "",
    val trustServerCertificate: String = "",
    val connectionUrl: String = ""
)

fun sqlQuery(query: String): ResultSet? {
    var resultSet: ResultSet? = null
    val server = "152.115.71.190:48123"
    val database = "materialepladsen_core_DTUMP3"
    val username = "DTUMP3"
    val password = "MPor2hRrSE"
    val connectionUrl = "jdbc:sqlserver://$server;databaseName=$database;user=$username;password=$password"
    try {
        val connection = DriverManager.getConnection(connectionUrl)
        if (connection.isValid(0)) {
            println("Connection established")
        }

        val statement: Statement = connection.createStatement()
        resultSet = statement.executeQuery(query)
    } catch (e: SQLException) {
        e.printStackTrace()
    }
    return resultSet
}


fun getSitesResultSet(): ResultSet {
    val selectSql = "SELECT * FROM [dbo].[v_mobileApp_sites]"
    return sqlQuery(selectSql)!!
}