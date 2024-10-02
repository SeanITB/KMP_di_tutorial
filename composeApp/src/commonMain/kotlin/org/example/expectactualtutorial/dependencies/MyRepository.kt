package org.example.expectactualtutorial.dependencies

interface MyRepository {
    fun helloWorld(): String // instance on di
}

class MyRepositoryImpl(
    private val dbClient: DbClient // whe inject an instance od the dbClient
): MyRepository {
    override fun helloWorld(): String {
        return "Hello World!"
    }

}